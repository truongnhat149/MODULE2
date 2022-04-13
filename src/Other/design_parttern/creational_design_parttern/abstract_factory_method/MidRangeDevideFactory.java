package design_parttern.creational_design_parttern.abstract_factory_method;

public class MidRangeDevideFactory extends ElectronicDeviceAbstractFactory {
    @Override
    Laptop createLaptop() {
        return new MidRangeLaptop();
    }

    @Override
    Phone createPhone() {
        return new MidRangePhone();
    }
}
