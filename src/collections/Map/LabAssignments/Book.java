package collections.Map.LabAssignments;

//create book and author class,create map of book as key and author as value
import java.util.ArrayList;
/*create book and author class,create map of book as key and author as value
2.create map of authorname as key and no books as value*/
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

//1.take author name from user and make list of books written by that author
	public static HashMap<Author, ArrayList<String>> authorsWisebookNames(HashMap<Book, Author> bmap) {
		HashMap<Author, ArrayList<String>> map = new HashMap<Author, ArrayList<String>>();
		for (Entry<Book, Author> entry : bmap.entrySet()) {
			ArrayList<String> bookNames = new ArrayList<>();
			Author author = entry.getValue();
			Book book = entry.getKey();

			if (map.containsKey(author)) {
				bookNames = map.get(author);
			}
			bookNames.add(book.getbookname());
			map.put(author, bookNames);

		}
		return map;
	}

//2.create map of authorname as key and no. books as value
	public static HashMap<String, Integer> authorBookCountMap(HashMap<Book, Author> bmap) {
		HashMap<String, Integer> map = new HashMap<>();

		for (Entry<Book, Author> entry : bmap.entrySet()) {
			String authorName = entry.getValue().getName();

			if (map.containsKey(authorName)) {
				map.put(authorName, map.get(authorName) + 1);
			} else {
				map.put(authorName, 1);
			}
		}
		return map;
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
		System.out.println("\nAuthors wise book names:");
		HashMap<Author, ArrayList<String>> authorBooksMap = authorsWisebookNames(bmap);
		for (Entry<Author, ArrayList<String>> e : authorBooksMap.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("\nAuthor-wise book count:");
		HashMap<String, Integer> authorBookCount = authorBookCountMap(bmap);
		for (Entry<String, Integer> e : authorBookCount.entrySet()) {
		    System.out.println("Author: " + e.getKey() + ", Number of Books: " + e.getValue());
		}

	}

}
