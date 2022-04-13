package design_parttern.creational_design_parttern.builder;

public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildWalls(int walls);
    Builder buildPool(boolean hasPool);
    Builder buildDoors(int door);
    Builder withColor(String color);
    House build();
}
