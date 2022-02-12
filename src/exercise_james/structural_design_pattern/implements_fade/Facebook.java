package exercise_james.structural_design_pattern.implements_fade;

public class Facebook implements SocialShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.printf("Sharing to Facebook %s", this.message);
    }
}
