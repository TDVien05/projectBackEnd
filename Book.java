package projectBE1.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

	@Override
	public void uploadDataFromFile(Book book) throws IOException {

	}

	@Override
	public void storeDataToFile(ArrayList<Book> arrBook) throws IOException {
		PrintWriter pw = new PrintWriter("D:\\practice_java\\src\\projectBE1\\java\\Book.txt", "UTF-8");
		try {

			for (int i = 0; i < arrBook.size(); i++) {
				pw.println(arrBook.get(i));
			}
			pw.println("\n");
			pw.flush();
			pw.close();

		} catch (Exception e) {
			e.printStackTrace();
			scanner.next();
		}
	}

}