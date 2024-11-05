package L16_Activity;

import java.util.ArrayList;

import Ilagan_L11Activity1.Book;

public class L1 {
	private static ArrayList<Book> library = new ArrayList<>();
	public static void main(String[] args) {
		 addBooks();
		 printLibrary();
		 rentBooks();	 
	}
	private static void addBooks() {
		library.add(new Book("The Lord of  the Rings", "J.R.R Tolkien", 1954));
		library.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
		library.add(new Book("The Tipping Point", "M. Gladwell", 2000));
		library.add(new Book("Guns, Germs and Steel", "Jared Diamond", 1997));
	}
	private static void printLibrary() {
		System.out.println("Library Books:");
		for (Book book : library) {
			System.out.println(book);
		}
	}
	private static void rentBooks() {
		if (library.size() > 1) {
			library.get(2).rent("2024-11-10");
			library.get(3).rent("2024-11-15");
		}
		System.out.println("\nRented Books:");
        for (Book book : library) {
            if (book.isRented()) {
                System.out.println(book);
            }
	}

}
}
