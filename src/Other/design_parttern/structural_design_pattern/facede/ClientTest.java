package design_parttern.structural_design_pattern.facede;

public class ClientTest {
    public static void main(String[] args) {
        FurnitureFacede facede = FurnitureFacede.getInstance();
        facede.makeTVAndChair();
    }
}
