package module2.ManagerMoive;

public class Main {
    public static void main(String[] args) {
        ShowDate showDate = new ShowDate(23, 5, 1998);
        ShowDate showDate2 = new ShowDate(23, 5, 2000);
        Manuafacturer manuafacturer = new Manuafacturer("New York Company", "America");
        Manuafacturer manuafacturer2 = new Manuafacturer("Japannese", "Japan");
        Movie movie = new Movie("Canh Hoa tan", 2019, manuafacturer, 23000, showDate);
        Movie movie2 = new Movie("Royal", 2020, manuafacturer2, 30000, showDate);
//        System.out.println(manuafacturer.getNameCompany());
        movie.printNameCompany();
        System.out.println(movie.isCheckPrice(movie2));
        // discount
        System.out.println(movie.priceDisscount(20));
    }
}
