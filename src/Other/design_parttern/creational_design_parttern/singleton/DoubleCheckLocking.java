package design_parttern.creational_design_parttern.singleton;

public class DoubleCheckLocking {
    // key volatile dc sử dụng để dánh dấu biến sẽ được lưu trữ trong main
    // memory
    private static volatile DoubleCheckLocking instance;

    private DoubleCheckLocking() {}

    public static DoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLocking.class) {
                if (instance == null) {
                    instance =  new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
