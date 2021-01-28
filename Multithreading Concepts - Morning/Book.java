package Assignment;

public class Book {
	public static int count = 0;
	private int id;
	private int isbn;
	private String name;
	public Book(int isbn, String name) {
		super();
		this.isbn = isbn;
		this.name = name;
		id = ++count;
	}	
	public Book() {
		super();
		id = ++count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	synchronized public void review(int a) {
		System.out.println("Book with id " + id + " is getting reviewed by student" + a);
	}
	synchronized public void addToCart(boolean checkout,int a) throws InterruptedException{
		System.out.println("Book with id " + id + " is in the cart of student" + a);	
		if(checkout)
		{
			System.out.println("Book with id " + id + " has been checked out by student" + a);
		}
		else
		{
			Thread.sleep(300000);
			System.out.println("Book with id " + id + " is free to use ");
		}
	}
	
}
