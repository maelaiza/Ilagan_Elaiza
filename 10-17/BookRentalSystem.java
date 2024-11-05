package Ilagan_L11Activity1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class BookRentalSystem {
	private static final String FILE_NAME = "library.txt";
	
	 public static void main(String[] args) throws IOException {
	    
	        List<Book> bookList = new ArrayList<>();
	        bookList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
	        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
	        bookList.add(new Book("The Tipping Point", "M. Gladwell", 2000));
	        bookList.add(new Book("Guns, Germs, and Steel", "Jared Diamond", 1997));

	       
	        BookRentalSystem system = new BookRentalSystem();

	      
	        system.writeToFile(bookList);

	        
	        List<Book> booksFromFile = system.readFromFile();

	      
	        System.out.println("************************************* LIBRARY *************************************");
	        for (Book book : booksFromFile) {
	            System.out.println(book);
	        }
	        System.out.println("***********************************************************************************");
	    }

	    
	    public void writeToFile(List<Book> books) {
	        ObjectOutputStream oos = null;
	        try {
	            oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
	            oos.writeObject(books);
	            System.out.println("Books written to file successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (oos != null) {
	                try {
	                    oos.close(); // Explicitly closing the stream
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

	   
	   
		public List<Book> readFromFile() {
	        ObjectInputStream ois = null;
	        List<Book> books = new ArrayList<>();
	        try {
	            ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
	            books = (List<Book>) ois.readObject();
	            System.out.println("Books read from file successfully.");
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            if (ois != null) {
	                try {
	                    ois.close(); 
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return books;
	    }
	}
	
   /* static Book[] books = new Book[] {
            new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954),
            new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
            new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
            new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)
        };
    //}
    public static void displayBooks(Book[] books) {
        System.out.println("************* LIBRARY *************");
        for (Book book : books) {
            System.out.println(book);
        }
    }


    public static void displayRentedBooks(Book[] books) {
        
            for (Book book : books) {
                if (book.getTitle().equals("The Lord of the Rings") || book.getTitle().equals("The Tipping Point")) {
                    book.rent();
                }
            }
        
        System.out.println("\n***** BOOKS RENTED, NEVER READ *****");
        for (Book book : books) {
            if (book.isRented()) {
                System.out.println(book);
            }
        }
    }
    public static void main(String[] args) {
	     
        displayBooks(books);
        displayRentedBooks(books);
    }
}*/