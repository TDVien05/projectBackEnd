package projectBE1.java;

public class Author {
	private String authorID;
	private String authorName;

	public String getAuthorID() {
		return authorID;
	}

	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Author(String authorID, String authorName) {
		this.authorID = authorID;
		this.authorName = authorName;
	}

}
