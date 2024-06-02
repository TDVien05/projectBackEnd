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
			System.out.println("5 : Store book to file and exit");
			System.out.println("6 : Exits");
			System.out.print("Choose your option : ");
			flag = scanner.nextInt();
			scanner.nextLine();
			if (flag == 1) {
				for (int i = 0; i < arrBook.size(); i++) {
					System.out.println(arrBook.toString());
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
				} while (checkAddBook != 0);
			} else if (flag == 3) {
				System.out.println("========================EDIT BOOK========================");
				int checkEdit = 1;
				for (int i = 0; i < arrBook.size(); i++) {
					System.out.println(arrBook.toString());
				}
				do {
					for (int i = 0; i < arrBook.size(); i++) {
						System.out.println(i + arrBook.toString());
					}
					System.out.print("Enter book ID you want to edit : ");
					int bookID = scanner.nextInt();
					scanner.nextLine();
					if (bookID >= arrBook.size() || bookID < 0) {
						System.out.println("Book does not exist");
					} else {
						arrBook.get(bookID).updateBook(arrBook.get(bookID));
					}
					System.out.print("Do you want to edit more book || 0 : No || 1 : Yes : ");
					checkEdit = scanner.nextInt();
					scanner.nextLine();
				} while (checkEdit == 1);
			} else if (flag == 4) {
				System.out.println("========================DELETE BOOK========================");
				int bookDelete, checkDelete, stillDelete;
				for (int i = 0; i < arrBook.size(); i++) {
					System.out.println(i + arrBook.toString());
					System.out.print("Enter book ID you want to delete : ");
					bookDelete = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Are you sure to delete || 0 : No || 1 : Yes || Enter your choice : ");
					checkDelete = scanner.nextInt();
					scanner.nextLine();
					if (checkAddBook == 1) {
						arrBook.remove(bookDelete);
						System.out.println("Deleted successfully");
					} else
						System.exit(0);
				}
			} else if (flag == 5) {
				Book bookObj = new Book();
				bookObj.storeDataToFile(arrBook);
				System.out.println("========================THANK YOU FOR YOUR VISITING========================");
			} else if (flag == 6) {
				System.out.println("========================THANK YOU FOR YOUR VISITING========================");
				System.exit(0);
			}

			else {
				System.out.println("Invalid value. Enter again !!! ");
			}
		} while (flag != 5);
	}

}