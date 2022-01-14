package JavaExerciseYouTube.ManagerBook;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(11, 2, 1992);
        System.out.println(date1);
        Author author1 = new Author("Truong", date1);
        System.out.println(author1);
        Book book1 = new Book("Ca thang 4", 50000, 2003, author1);
        Book book2 = new Book("20 thang chap", 550000, 2009, author1);
        System.out.println(book1);
        book1.printBook();
        System.out.println(book1.isIssueBook(book2));
        System.out.println("after disscount " +book1.afterDisscount(20));
    }
}
