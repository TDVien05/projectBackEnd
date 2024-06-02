package projectBE1.java;

public interface IActivities {
	void addBook();

	Book deleteBook(Book book);

	void searchBook();

	void storeBookDataToFile();

	void storeAuthorDataToFile();

	Book updateBook(Book book);

}
