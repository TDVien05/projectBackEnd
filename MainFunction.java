package projectBE1.java;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> arrBook = new ArrayList<>();
		int flag;
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

			}
			if (flag == 2) {
				System.out.println("========================ADD BOOK========================");
				int check;
				do {
					Book bookObj = new Book();
					System.out.print("Enter the new book ISBN : ");
					String newISBN = scanner.nextLine();
					bookObj.setISBN(newISBN);
					System.out.print("Enter the new book title : ");
					String newtitle = scanner.nextLine();
					bookObj.setTitle(newtitle);
					System.out.print("Enter the new book price : ");
					double newprice = scanner.nextInt();
					scanner.nextLine();
					bookObj.setPrice(newprice);
					System.out.print("Enter the book author : ");
					String newAuthorName = scanner.nextLine();
					bookObj.setAuthor(newAuthorName);
					arrBook.add(bookObj);
					System.out.print("Do you want to add more book || 0 : No || 1 : Yes || : ");
					check = scanner.nextInt();
				} while (check != 0);
			}
		} while (flag != 5);
	}

}
