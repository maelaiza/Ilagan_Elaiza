package Ilagan_L11Activity1;
import java.io.Serializable;

public class Book implements Serializable {
	private String title;
	private String author;
	private int yearPublished;
	
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
	}
	
	public String toString() {
		return String.format(title + "\t " + author+ "\t" + yearPublished);
	}
}
