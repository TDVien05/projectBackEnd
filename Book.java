package projectBE1.java;

import java.io.BufferedReader;
import java.io.FileReader;
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
		return "ISBN = " + ISBN + "\n" + "title = " + title + "\n" + "price = " + price + "\n" + "authorName = "
				+ authorName + "\n\n";
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
		System.out.print("Enter new author : ");
		book.authorName = scanner.nextLine();
		return book;
	}

	@Override
	public void storeDataToFile(ArrayList<Book> arrBook) throws IOException {

		PrintWriter pw = new PrintWriter("D:\\practice_java\\src\\projectBE1\\java\\Book.txt", "UTF-8");
		try {
			for (Book book : arrBook) {
				pw.println(book.toString());
				pw.println(); // Add an empty line to separate records
			}
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Book> readDataFromFile() throws IOException {
		ArrayList<Book> arrBook = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("D:\\practice_java\\src\\projectBE1\\java\\Book.txt"));
		try {
			String isbn = "";
			String title = "";
			String author = "";
			double price = 0.0;
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("ISBN = ")) {
					isbn = line.substring(7).trim();
				} else if (line.startsWith("title = ")) {
					title = line.substring(8).trim();
				} else if (line.startsWith("price = ")) {
					price = Double.parseDouble(line.substring(8).trim());
				} else if (line.startsWith("authorName = ")) {
					author = line.substring(13).trim();
					// Create a Book object when all fields are read
					arrBook.add(new Book(isbn, title, price, author));
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
		return arrBook;
	}
}
