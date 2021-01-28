package Assignment;

import java.util.ArrayList;

public class Main {
	volatile public static ArrayList<Book> list = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException{
		
		Book b1 = new Book(1,"Math Magic");
		Book b2 = new Book(1,"Math Magic");					//copy of book b1
		Book b3 = new Book(2,"English Marigold");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		Student s1 = new Student(b1);
		Student s2 = new Student(b1);
		Student s3 = new Student(b2);
		Student s4 = new Student(b3);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
		Administrator a1 = new Administrator();
		Administrator a2 = new Administrator();
		Administrator a3 = new Administrator();
		
		a1.start();
		a2.start();
		a3.start();
		
		s1.join();
		s2.join();
		s3.join();
		a1.join();
		a2.join();
		s3.join();
		
		
		System.out.println("Total count of the books is " + Book.count);
		
	}
	
	public void addBook(Book b)
	{
		b = new Book();
		list.add(b);
		System.out.println("New book added with id " + b.getId());
	}
	

}