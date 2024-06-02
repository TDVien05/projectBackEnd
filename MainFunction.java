package projectBE1.java;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFunction extends Book {

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
			}
			if (flag == 2) {
				System.out.println("========================ADD BOOK========================");
				do {
					Book bookObj = new Book();
					bookObj.addBook();
					System.out.print("Do you want to add more book || 0 : No || 1 : Yes : ");
					checkAddBook = scanner.nextInt();
					scanner.nextLine();
					arrBook.add(bookObj);
				} while (checkAddBook != 0);
			}
		} while (flag != 5);
	}
}
