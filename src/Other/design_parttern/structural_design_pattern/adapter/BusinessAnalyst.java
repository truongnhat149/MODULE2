package design_parttern.structural_design_pattern.adapter;

public class BusinessAnalyst implements Customer{
    private Developer developer;

    public BusinessAnalyst(Developer developer) {
        this.developer = developer;
    }
    @Override
    public void sendRequest(String request) {
        System.out.println("Reading request...");
        System.out.println(request);
        String info = this.translate(request);
    }
    private String translate(String request) {
        return  "Create Zoom";
    }
}
