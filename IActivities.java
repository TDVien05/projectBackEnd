package projectBE1.java;

public interface IActivities {
	void addBook();

	void deleteBook(String title);

	void searchBook();

	void storeBookDataToFile();

	void storeAuthorDataToFile();

	Book updateBook(Book book);

}
