package exercise_james.structural_design_pattern.implements_fade;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }

    private void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }
}
