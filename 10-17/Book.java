package Ilagan_L11Activity1;
import java.io.Serializable;

public class Book implements Serializable{
		private String title;
		private String author;
		private int yearPublished;
		private boolean isRented;

		public boolean isRented() {
			return isRented;
			
		}
		public Book(String title, String author, int yearPublished) {
			this.title = title;
			this.author = author;
			this.yearPublished = yearPublished;
			this.isRented = false;
		}
		
		public void rent () {
			this.isRented = true;
		}
		
		public String toString() {
			return String.format(title + "\t " + author+ "\t" + yearPublished);
		}
		
		public String getTitle() {
			return title;
		}
		
		
	}



