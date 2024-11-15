package collections.Map.HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Book {
	int bookid;
	String bookname;
	double bookPrice;

	public Book(int bookid, String bookname, double bookPrice) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookPrice = bookPrice;
	}

	public int getid() {
		return bookid;
	}

	public String getbookname() {
		return bookname;
	}

	public double getbookprice() {
		return bookPrice;
	}

	public String toString() {
		return "Book ID: " + bookid + " Book Name: " + bookname + " Book Price: " + bookPrice;
	}

	public static void main(String[] args) {
		HashMap<Book, Author> bmap = new HashMap<Book, Author>();
		bmap.put(new Book(101, "Java Basics", 200.0), new Author("ABC"));
		bmap.put(new Book(102, "Advanced Python", 250.0), new Author("EFG"));
		bmap.put(new Book(103, "Mastering SQL", 330.0), new Author("HIJ"));
		bmap.put(new Book(104, "Java Performance", 290.0), new Author("KLM"));
		bmap.put(new Book(105, "Java Fundamentals", 210.0), new Author("ABC"));
		bmap.put(new Book(106, "Java Patterns", 300.0), new Author("KLM"));
		bmap.put(new Book(107, "Java Deep Dive", 2010.0), new Author("ABC"));
		bmap.put(new Book(108, "Java Enterprise", 2000.0), new Author("ABC"));
		bmap.put(new Book(109, "Java Networking", 400.0), new Author("EFG"));
		bmap.put(new Book(110, "Java Security", 600.0), new Author("ABC"));
		
		System.out.println("Original map: ");
		Set<Entry<Book, Author>> ent = bmap.entrySet();
		for (Entry<Book, Author> e : ent) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
