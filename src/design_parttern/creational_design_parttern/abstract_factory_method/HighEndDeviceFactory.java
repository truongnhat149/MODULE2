package design_parttern.creational_design_parttern.abstract_factory_method;

public class HighEndDeviceFactory extends ElectronicDeviceAbstractFactory {
    @Override
    Laptop createLaptop() {
        return new HighEndLaptop();
    }

    @Override
    Phone createPhone() {
        return new HighEndPhone();
    }
}
