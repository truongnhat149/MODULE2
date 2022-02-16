package design_parttern.creational_design_parttern.factory_method;

public class ClientTest {
    public static void main(String[] args) {
        Candy candy = CandyFactory.getCandy(CandyType.MINTY_CANDY);
        System.out.println(candy.getCandyName());
    }
}

