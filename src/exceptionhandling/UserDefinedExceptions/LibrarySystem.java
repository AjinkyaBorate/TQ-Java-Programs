package exceptionhandling.UserDefinedExceptions;

/*In a library system, if a user tries to borrow a book that is currently checked out by someone else, 
 * a BookNotAvailableException should be thrown.*/
public class LibrarySystem {
	public void borrowBook(String bookName, boolean isAvailable) throws BookNotAvailableException {
		if (!isAvailable) {
			throw new BookNotAvailableException("The book with Name " + bookName + " is currently checked out.");
		}
		System.out.println("Book with Name " + bookName + " borrowed successfully.");
	}

	public static void main(String[] args) {
		LibrarySystem librarySystem = new LibrarySystem();
		String bookName = "Java";
		boolean isAvailable = false;

		try {
			librarySystem.borrowBook(bookName, isAvailable);
		} catch (BookNotAvailableException e) {
			System.out.println(e);
		}
	}
}
