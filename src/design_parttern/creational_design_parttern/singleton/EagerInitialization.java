package design_parttern.creational_design_parttern.singleton;

public class EagerInitialization {
    private static final EagerInitialization INSTANCE = new EagerInitialization();
    private EagerInitialization() {

    }
    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}
