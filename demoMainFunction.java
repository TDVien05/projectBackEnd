package projectBE1.java;

import java.util.ArrayList;
import java.util.Scanner;

public class demoMainFunction {
	public static void main(String[] args) {
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
					arrBook.get(bookID).updateBook(arrBook.get(bookID));
					System.out.print("Do you want to edit more book || 0 : No || 1 : Yes : ");
					checkEdit = scanner.nextInt();
					scanner.nextLine();
				} while (checkEdit == 1);
			} else if (flag == 4) {

			}
		} while (flag != 5);
	}
}