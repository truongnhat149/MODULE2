package design_parttern.creational_design_parttern.builder;

public class ClientTest {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .buildDoors(5)
                .buildPool(true)
                .buildWalls(4)
                .buildRoof(true)
                .build();
        System.out.println(house);
    }
}
