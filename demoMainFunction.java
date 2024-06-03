package projectBE1.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class demoMainFunction {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> arrBook = new ArrayList<>();
		int flag, checkAddBook = 1;
		do {
			System.out.println("========================MENU SYSTEM========================");
			System.out.println("1 : List of book");
			System.out.println("2 : Add new book");
			System.out.println("3 : Editing a book");
			System.out.println("4 : Delete a book");
			System.out.println("5 : Exits");
			System.out.print("Choose your option : ");
			flag = scanner.nextInt();
			scanner.nextLine();
			if (flag == 1) {
				Book bookObj = new Book();
				arrBook = bookObj.readDataFromFile();
				for (Book book : arrBook) {
					System.out.println("ISBN : " + book.ISBN);
					System.out.println("Title : " + book.title);
					System.out.println("Price : " + book.price);
					System.out.println("Author : " + book.authorName);
					System.out.println();
				}
			} else if (flag == 2) {
				System.out.println("========================ADD BOOK========================");
				do {
					Book bookObj = new Book();
					bookObj.addBook();
					System.out.print("Do you want to add more book || 0 : No || 1 : Yes : ");
					checkAddBook = scanner.nextInt();
					scanner.nextLine();
					arrBook.add(bookObj);
					bookObj.storeDataToFile(arrBook);
				} while (checkAddBook != 0);
			} else if (flag == 3) {
				System.out.println("========================EDIT BOOK========================");
				int checkEdit = 1;
				Book bookObj = new Book();
				arrBook = bookObj.readDataFromFile();
				do {
					for (int i = 0; i < arrBook.size(); i++) {
						System.out.println(i);
						System.out.println("ISBN : " + arrBook.get(i).ISBN);
						System.out.println("Title : " + arrBook.get(i).title);
						System.out.println("Price : " + arrBook.get(i).price);
						System.out.println("Author : " + arrBook.get(i).authorName);
						System.out.println();
					}
					System.out.print("Enter book ID you want to edit : ");
					int bookID = scanner.nextInt();
					scanner.nextLine();
					if (bookID >= arrBook.size() || bookID < 0) {
						System.out.println("Book does not exist");
					} else {
						arrBook.get(bookID).updateBook(arrBook.get(bookID));
					}
					bookObj.storeDataToFile(arrBook);
					System.out.print("Do you want to edit more book || 0 : No || 1 : Yes : ");
					checkEdit = scanner.nextInt();
					scanner.nextLine();
				} while (checkEdit == 1);
			} else if (flag == 4) {
				System.out.println("========================DELETE BOOK========================");
				Book bookObj = new Book();
				arrBook = bookObj.readDataFromFile();
				int bookDelete, stillDelete;
				do {
					for (int i = 0; i < arrBook.size(); i++) {
						System.out.println(i);
						System.out.println("ISBN : " + arrBook.get(i).ISBN);
						System.out.println("Title : " + arrBook.get(i).title);
						System.out.println("Price : " + arrBook.get(i).price);
						System.out.println("Author : " + arrBook.get(i).authorName);
						System.out.println();
					}
					System.out.print("Enter book ID you want to delete : ");
					bookDelete = scanner.nextInt();
					scanner.nextLine();
					if (bookDelete >= arrBook.size() || bookDelete < 0) {
						System.out.println("Book does not exist");
					} else {
						arrBook.remove(bookDelete);
					}
					bookObj.storeDataToFile(arrBook);
					System.out.print("Do you want to edit more book || 0 : No || 1 : Yes : ");
					stillDelete = scanner.nextInt();
					scanner.nextLine();
				} while (stillDelete == 1);
			} else if (flag == 5) {
				System.out.println("========================THANK YOU FOR YOUR VISITING========================");
				System.exit(0);
			}

			else {
				System.out.println("Invalid value. Enter again !!! ");
			}
		} while (flag != 5);
	}

}