package exercise_james.design_patterns.singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("Begin testing singleton pattern");

        BookBorrower bookBorrower = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower.borrowBook();
        System.out.println("Book Borrow1 asked to borrow the book");
        System.out.println("Book Borrow1 author and title");
        System.out.println(bookBorrower.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("Book Borrow1 asked to borrow the book");
        System.out.println("Book Borrow1 author and title");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower.returnBook();
        System.out.println("Bookborrow1 return the book");

        bookBorrower2.borrowBook();
        System.out.println("bookborrow2 author and title");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        System.out.println("End Testing single pattern");
    }
}
