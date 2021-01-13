package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Blogs;
import com.example.au.couchbasedemo.repository.BlogRepository;

@RestController
public class BlogController {
    
    @Autowired
    BlogRepository blogRepository;
    
	/*
	 * @RequestMapping("/") public String index() { return
	 * "Welcome to the CRUD application!!"; }
	 */
    
    @PostMapping("/blogs")
    public Blogs addBlogPost(@RequestBody Blogs newBlog) {
        return blogRepository.save(newBlog);
    }
    
    @GetMapping("/blogs/tags/{tags}")
    public List<Blogs> getBlogHere(@PathVariable String tags){
    	List<Blogs> blo = new ArrayList<>();
    	for(Blogs b: blogRepository.findAll())
    	{
    		List<String> taggers = b.getTags();
    		if(taggers.contains(tags))
    			blo.add(b);
    	}
    	return blo;
    }
    
    
    
    @GetMapping("/blogs/{id}")
    public Optional<Blogs> getBlog(@PathVariable String id) {
        if (blogRepository.existsById(id)) {
            return blogRepository.findById(id);
        } else
            return Optional.empty();
    }
    
    @GetMapping("/blogs/author/{author}")
    public Blogs getBlogByAuthorName(@PathVariable String author) {
        return blogRepository.findByAuthor(author);
    }
    
    @DeleteMapping("/blogs/topic/{topic}/author/{author}")
    public List<Blogs> deleteByAuthorAndTopic(@PathVariable String topic, @PathVariable String author) {
        return blogRepository.deleteBytopicAndAuthor(topic, author);
    }
    
    @DeleteMapping("/blogs/{id}")
    public void deleteById(@PathVariable String id) {
        blogRepository.deleteById(id);
    }
    
}