package collections.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Double.doubleToLongBits(bookPrice) == Double.doubleToLongBits(other.bookPrice) && bookid == other.bookid
				&& Objects.equals(bookname, other.bookname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookPrice, bookid, bookname);
	}

	public static void main(String[] args) {
		LinkedHashMap<Book, Integer> lmap = new LinkedHashMap<>();
		lmap.put(new Book(1, "Java", 100.0), 2);
		lmap.put(new Book(3, "SQL", 200.0), 5);
		lmap.put(new Book(5, "Python", 300.0), 9);
		lmap.put(new Book(1, "Java", 100.0), 3);

		Set<Entry<Book, Integer>> entry = lmap.entrySet();
		for (Entry<Book, Integer> e : entry) {
			System.out.println(e.getKey() + " | Quantity:" + e.getValue());
		}

	}

}
