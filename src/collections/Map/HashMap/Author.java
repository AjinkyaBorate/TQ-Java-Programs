package collections.Map.HashMap;

public class Author {
	String authorname;
	public Author(String authorname) {
		this.authorname=authorname;
	}
	public String getName() {
		return authorname;
	}
	public String toString() {
		return " Author Name:"+authorname;
	}
}
