package collections.Map.TreeMap;

//TreeMap for Book Class, keys as book objects
import java.util.Set;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map.Entry;

public class Book // implements Comparable<Book>
{
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

//// to sort book key by price using Comparable
//	public int compareTo(Book obj) {
//		return Double.compare(this.bookPrice, obj.bookPrice);
//	}

	public static void main(String[] args) {
		TreeMap<Book, Integer> tmap = new TreeMap<Book, Integer>(new Bookprice());
		tmap.put(new Book(1, "Java", 100.0), 2);
		tmap.put(new Book(3, "SQL", 230.0), 5);
		tmap.put(new Book(5, "Python", 300.0), 9);
		tmap.put(new Book(1, "Java", 150.0), 3);

		Set<Entry<Book, Integer>> entry = tmap.entrySet();
		for (Entry<Book, Integer> e : entry) {
			System.out.println(e.getKey() + " | Quantity:" + e.getValue());
		}
	}
}

//to sort book key by price using Comparator
class Bookprice implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o1.getbookprice(), o2.getbookprice());
	}
}
