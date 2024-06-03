package projectBE1.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface IActivities {
	void addBook();

	void uploadDataFromFile() throws FileNotFoundException;

	Book updateBook(Book book);

	void storeDataToFile(ArrayList<Book> arrBook) throws IOException;

}
