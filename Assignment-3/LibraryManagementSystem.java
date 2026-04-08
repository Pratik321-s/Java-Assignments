import java.util.ArrayList;

class Book
{
	int bookId;
	String title;
	String author;
	boolean isAvailable;
	
	Book(int bookId, String title, String author)
	{
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	void issueBook()
	{
		if(isAvailable){
			isAvailable = false;
			System.out.println(title + " issued successfully.");
		}else{
			System.out.println(title + " is already issued");
		}
	}
	
	void returnBook()
	{
		if(!isAvailable){
			isAvailable = true;
			System.out.println(title + " returned successfully");
		}else{
			System.out.println(title + " was not issued");
		}
	}
	
	void displayBook()
	{
		System.out.println("Book ID: " + bookId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		
		if(isAvailable){
			System.out.println("Status: Available");
		}else{
			System.out.println("Status: Issued");
		}
	}
}

class LibraryManagementSystem
{
	public static void main(String []args)
	{
		ArrayList<Book> books = new ArrayList<>();
		
		Book b1 = new Book(1, "Java Basics", "James Gosling");
		Book b2 = new Book(2, "Data Structure", "Mark Allen");
		Book b3 = new Book(3, "Operating Systems", "Galvin");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		b1.issueBook();
		b1.issueBook();    //trying to issue again
		
		b2.issueBook();
		b2.returnBook();
		
		System.out.println("All Books: ");
		for(Book b : books){
			b.displayBook();
		}
		
		System.out.println("Available Books: ");
		for(Book b : books){
			if(b.isAvailable){
				b.displayBook();
			}
		}
		
		System.out.println("Issued Books");
		for(Book b : books){
			if(!b.isAvailable){
				b.displayBook();
			}
		}
		
		System.out.println("Total Books: " + books.size());
	}
}