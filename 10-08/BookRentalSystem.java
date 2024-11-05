package Ilagan_L9Activity1;

public class BookRentalSystem {
    static Book[] books = new Book[] {
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
}

