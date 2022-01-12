package module2.ManagerBook;

public class Book {
    private String bookName;
    private int price;
    private int issueBook;
    private Author author;

    public Book(){}
    public Book(String bookName, int price, int issueBook, Author author) {
        this.bookName = bookName;
        this.price = price;
        this.issueBook = issueBook;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIssueBook() {
        return issueBook;
    }

    public void setIssueBook(int issueBook) {
        this.issueBook = issueBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void printBook() {
        System.out.println(this.bookName);
    }

    public boolean isIssueBook(Book other) {
        return this.issueBook == other.issueBook;
    }
    public double afterDisscount(double x) {
        return this.price * (1 - x/100);
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", issueBook=" + issueBook +
                ", author=" + author +
                '}';
    }
}
