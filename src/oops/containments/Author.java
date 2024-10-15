package oops.containments;
//Containments using constructor/toString
public class Author {
	String authorName;
Author(String authorName){
	this.authorName=authorName;
}
public String toString() {
	return " "+authorName;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author obj =new Author("XYZ");
		System.out.println(obj);
	}

}
