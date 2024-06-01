package projectBE1.java;

import java.util.Scanner;

public class Book implements IActivities {

	Scanner scanner = new Scanner(System.in);

	protected String ISBN;
	protected String title;
	protected String price;
	protected String authorName;
	protected int bookID = 0;

	public Book() {

	}

	public Book(String iSBN, String title, String price, String authorName) {
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.authorName = authorName;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthor(String authorName) {
		this.authorName = authorName;
	}

	public void showBookInfo(Book book) {
		System.out.println("BookID : " + book.getBookID());
		System.out.println("ISBN : " + book.getISBN());
		System.out.println("Title : " + book.getTitle());
		System.out.println("Price : " + book.getPrice());
		System.out.println("Author name : " + book.getAuthorName());
	}

	public String toString() {
		return "BookID : " + bookID + "\n ISBN = " + ISBN + "\n title=" + title + "\n price=" + price + "\n authorName="
				+ authorName + "\n\n\n";
	}

	@Override
	public void addBook() {
		bookID++;

		System.out.print("Enter the new book ISBN : ");
		this.ISBN = scanner.nextLine();

		System.out.print("Enter the new book title : ");
		this.title = scanner.nextLine();

		System.out.print("Enter the new book price : ");
		this.price = scanner.nextLine();

		System.out.print("Enter the book author : ");
		this.authorName = scanner.nextLine();

	}

	@Override
	public void deleteBook() {

	}

	@Override
	public void updateBook(int bookID) {

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

}
