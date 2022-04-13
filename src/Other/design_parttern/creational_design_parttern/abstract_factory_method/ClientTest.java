package design_parttern.creational_design_parttern.abstract_factory_method;

public class ClientTest {
    public static void main(String[] args) {
        ElectronicDeviceAbstractFactory highEndDevice = ElectronicDeviceFactory.getFactory(Segment.HIGH_END);
        Laptop highEndLap = highEndDevice.createLaptop();
        Phone highEndPhone = highEndDevice.createPhone();
        System.out.println(highEndLap.getSegment());
        System.out.println(highEndPhone.getSegment());

        System.out.println("============");

        ElectronicDeviceAbstractFactory midRangeDeivce = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);
        Laptop midRangeLap = midRangeDeivce.createLaptop();
        Phone midRangePhone = midRangeDeivce.createPhone();
        System.out.println(midRangeLap.getSegment());
        System.out.println(midRangePhone.getSegment());
    }
}
