package design_parttern.creational_design_parttern.abstract_factory_method;

public class ElectronicDeviceFactory {
    public static ElectronicDeviceAbstractFactory getFactory(Segment segment) {
        switch (segment) {
            case HIGH_END:
                return new HighEndDeviceFactory();
            case MID_RANGE:
                return new MidRangeDevideFactory();
            default:
                throw new UnsupportedOperationException("This device unsupported");
        }
    }
}
