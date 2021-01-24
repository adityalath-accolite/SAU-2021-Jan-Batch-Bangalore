package com.au.manager;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.au.library.Book;

public class LibraryManager {
	
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		
		factory = new Configuration().configure().buildSessionFactory();
		
		LibraryManager manager = new LibraryManager();
		
		//adding a book
		int id = manager.addBooks("Wings of fire","Dr.A.P.J.Abdul Kalam",1999,"Autobiography");
		System.out.println("The book added with id "+id);
		
		id = manager.addBooks("The monk who sold his Ferrari","Robin Sharma",1996,"Spiritual");
		System.out.println("The book added with id "+id);
		
		id = manager.addBooks("One night at the call center","Chetan Bhagat",2005,"Fiction");
		System.out.println("The book added with id "+id);
		
		id = manager.addBooks("Mein Kampf","Adolf Hitler",1948,"Autobiography");
		System.out.println("The book added with id "+id);
		
		id = manager.addBooks("My Experiments with truth","Mahatma Gandhi",1925,"Autobiography");
		System.out.println("The book added with id "+id);
		
		
		
		//fetching info
		manager.getBookById(4);                 
		manager.getBookById(6);
		
		
		//updating book
		Book book = manager.updateBook(5,"Mohandas Karamchand Gandhi");
		System.out.println("Book with id 5 updated successfully with name "+book.getAuthor());
		
		
		//delete a book
		manager.deleteBook(3);
		System.out.println("Book with id 3 deleted successfully");
		
		//getting count of entries
		int count = manager.getCount();
		System.out.println("There are " + count + " books present currently in the library");
	
	}
	@Transactional
	private int getCount() {
		Session s = factory.openSession();
		try
		{
			List<Book> list = s.createQuery("FROM Book").list();
			return list.size();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
		return 0;
	}

	private void deleteBook(int i) {
		
		Session s = factory.openSession();
		Transaction tx = null;
		try 
		{
			tx = s.beginTransaction();
			Book p = s.get(Book.class, i);
			s.delete(p);
			tx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
		finally
		{
			s.close();
		}
		
	}

	private Book updateBook(int i, String author) {
		Session s = factory.openSession();
		Transaction tx = null;
		try 
		{
			tx = s.beginTransaction();
			Book p = s.get(Book.class, i);
			p.setAuthor(author);
			s.update(p);
			tx.commit();
			return p;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
		finally
		{
			s.close();
		}
		return null;
		
	}

	private void getBookById(int i) {
		
		Session s = factory.openSession();
		Transaction tx = null;
		try
		{
			tx = s.beginTransaction();
			Book book = s.get(Book.class, i);
			if(book == null)
			{
				System.out.println("Book with id " + i + " is not available");
			}
			else
			{
				System.out.println("Book with book id "+ i + " is " + book.getName() + " written by " + book.getAuthor() + " in year " + book.getYearPublished() + ". Genre of the book is " + book.getGenre());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(tx != null)
				tx.rollback();
		}
		finally
		{
			s.close();
		}
		
	}

	@Transactional
	private int addBooks(String name, String author, int year, String genre) {
		Session s = factory.openSession();
		
		try 
		{
			Book book = new Book(name,author,year,genre);
			return (int)s.save(book);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
		return 0;
	}

}
