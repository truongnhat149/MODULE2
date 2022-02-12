package exercise_james.structural_design_pattern.implements_adapter;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }
    public void printFileSize(String path) {
        long size = fileCalculator.calculateSize(path);
        System.out.printf("size %s", size);
    }
}
