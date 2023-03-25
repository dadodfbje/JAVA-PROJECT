import java.util.Arrays;

public class Branch {
         
	String branch;
	Books[] books;
	
	public Branch(String branch,Books[] books)
	{
		this.branch=branch;
		this.books=books;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Books[] getBooks() {
		return books;
	}

	public void setBooks(Books[] books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Branch [branch=" + branch + ", books=" + Arrays.toString(books) + "]";
	}

	

	
	
	
}
