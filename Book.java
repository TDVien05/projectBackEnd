package projectBE1.java;

import java.util.Scanner;

public class Book implements IActivities {

	Scanner scanner = new Scanner(System.in);

	protected String ISBN;
	protected String title;
	protected double price;
	protected String authorName;

	public Book() {

	}

	public Book(String iSBN, String title, double price, String authorName) {
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.authorName = authorName;
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

	public void showBookInfo(Book book) {
		System.out.println("ISBN : " + book.getISBN());
		System.out.println("Title : " + book.getTitle());
		System.out.println("Price : " + book.getPrice());
		System.out.println("Author name : " + book.getAuthorName());
	}

	public String toString() {
		return "ISBN = " + ISBN + "\n title=" + title + "\n price=" + price + "\n authorName=" + authorName + "\n\n\n";
	}

	@Override
	public void addBook() {

		System.out.print("Enter the new book ISBN : ");
		this.ISBN = scanner.nextLine();

		System.out.print("Enter the new book title : ");
		this.title = scanner.nextLine();

		System.out.print("Enter the new book price : ");
		int check = 1;
		do {
			try {
				this.price = scanner.nextDouble();
				scanner.nextLine();
				check = 0;
			} catch (Exception e) {
				System.out.println("Invalid price. Enter again !!!");
				System.out.print("Enter price again : ");
				scanner.next();
			}
		} while (check == 1);

		System.out.print("Enter the book author : ");
		this.authorName = scanner.nextLine();

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
	public Book updateBook(Book book) {
		System.out.print("Enter new title : ");
		book.title = scanner.nextLine();
		System.out.print("Enter new ISBN : ");
		book.ISBN = scanner.nextLine();
		System.out.print("Enter new price : ");
		book.price = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter new author : ");
		book.authorName = scanner.nextLine();
		return book;
	}

}