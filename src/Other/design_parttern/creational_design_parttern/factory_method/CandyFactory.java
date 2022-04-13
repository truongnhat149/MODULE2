package design_parttern.creational_design_parttern.factory_method;

public class CandyFactory {
    private CandyFactory() {
    }

    public static Candy getCandy(CandyType candyType) {
        switch (candyType) {
            case MINTY_CANDY :
                return new MintyCandy();
            case HARD_CANY:
                return new HardCandy();
            default:
                throw new IllegalArgumentException("this is candy type is unsupported");
        }
    }
}
