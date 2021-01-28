package Assignment;

public class Administrator extends Thread{
	
	public void run()
	{
		Book b = null;
		Main m = new Main();
		System.out.println("A book initiated by an admin");
		m.addBook(b);
	}
	
}
