package Assignment;

import java.util.Random;

public class Student extends Thread{
	Book book;
	Object lock = new Object();
	public static int count = 0;
	private int id;
	
	public Student(Book book) {
		this.book = book;
		id = ++count;
	}

	@Override
	public void run()
	{
		Random rand = new Random();
		System.out.println("Book with id " + book.getId() + " is acquired by student" + id);
		synchronized (lock) {
			book.review(id);
			boolean checkout = rand.nextBoolean();
			try {
				book.addToCart(checkout,id);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
