package design_parttern.creational_design_parttern.singleton;

public class LazyInitialization {

    private static LazyInitialization instance;

    private LazyInitialization() {

    }
    public static LazyInitialization getInstance() {
        if ( instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
