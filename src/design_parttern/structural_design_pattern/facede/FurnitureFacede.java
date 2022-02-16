package design_parttern.structural_design_pattern.facede;

public class FurnitureFacede {
    private static FurnitureFacede INSTANCE;
    private Furniture table;
    private Furniture chair;
    private Furniture tv;

    public FurnitureFacede() {
        this.table = table;
        this.chair = chair;
        this.tv = tv;
    }

    public static FurnitureFacede getInstance() {
        if (INSTANCE == null)
            INSTANCE = new FurnitureFacede();
        return INSTANCE;
    }

    public void makeTableAndChair() {
        table.make();
        chair.make();
    }

    public void makeTVAndChair() {
        tv.make();
        chair.make();

    }
}
