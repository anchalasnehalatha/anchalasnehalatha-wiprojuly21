package lab25_july;

class library {
    // Private fields
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public library(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // default: book is available
    }

    // Issue the book
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book \"" + title + "\" issued successfully.");
        } else {
            System.out.println("Book \"" + title + "\" is already issued.");
        }
    }

    // Return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book \"" + title + "\" returned successfully.");
        } else {
            System.out.println("Book \"" + title + "\" was not issued.");
        }
    }

    // Get book info
    public void getBookInfo() {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("ISBN      : " + isbn);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
        System.out.println("------------------------------------");
    }
}
public  class LibraryTest {
    public static void main(String[] args) {
        // Create book objects
        library b1 = new library("Wingsof fire","Dr.Abdulkalam", "ISBN001");
        library b2 = new library("Myjourney","Kalamswife", "ISBN002");

        // Display initial info
        b1.getBookInfo();
        b2.getBookInfo();

        // Issue one book
        b1.issueBook();
        b1.getBookInfo();
        // Return the book
        b1.returnBook();
        b1.getBookInfo();

       
    }
}


