class Book 
{
	int bookId;
	String bookName;
	
	Book(int bookId, String bookName)
	{
		this.bookId = bookId;
		this.bookName = bookName;
	}
}

class Library
{
	void displayBooks(Book []books)
	{
		System.out.println("Books in Library: ");
		
		for(Book b : books)
		{
			System.out.println("Book ID: " + b.bookId);
			System.out.println("Book Name: " + b.bookName);
		}
	}
}

class Main
{
	public static void main(String []args)
	{
		Book b1 = new Book(101, "Java Programming");
		Book b2 = new Book(102, "Python Basics");
		Book b3 = new Book(103, "Data Structures");
		
		Book []books = {b1, b2, b3};
		
		Library lib = new Library();
		lib.displayBooks(books);
	}
}