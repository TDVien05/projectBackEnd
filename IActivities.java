package projectBE1.java;

import java.io.IOException;
import java.util.ArrayList;

public interface IActivities {
	void addBook();

	Book updateBook(Book book);

	void storeDataToFile(ArrayList<Book> arrBook) throws IOException;

	ArrayList<Book> readDataFromFile() throws IOException;

	void searchBookByAuthor(ArrayList<Book> arrBook);

	void searchBookByTitle(ArrayList<Book> arrBook);

	void deleteAllBook(ArrayList<Book> arrBook);

}
