package projectBE1.java;

public class Book implements IActivities {

	protected String ISBN;
	protected String title;
	protected double price;
	protected String authorName;
	protected String bookID;

	public Book() {

	}

	public Book(String iSBN, String title, double price, String authorName) {
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.authorName = authorName;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthor(String authorName) {
		this.authorName = authorName;
	}

	public Book addBook(String ISBN, String title, double price, String authorName) {
		Book bookObj = new Book(ISBN, title, price, authorName);
		return bookObj;
	}

	public void showBookInfo(Book book) {
		System.out.println("ISBN : " + book.getISBN());
		System.out.println("Title : " + book.getTitle());
		System.out.println("Price : " + book.getPrice());
		System.out.println("Author name : " + book.getAuthorName());
	}

	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void storeBookDataToFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void storeAuthorDataToFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", authorName=" + authorName + "]";
	}

	@Override
	public void addBook() {
		// TODO Auto-generated method stub

	}

}
