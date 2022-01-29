package exercise_james.string_regex.validate_email.test;

import exercise_james.string_regex.validate_email.EmailExample;

public class EmailExampleTest {
    private static EmailExample emailExample;

    public static final String[] valiEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invaliEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : valiEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid" + isvalid);
        }
        for (String email : invaliEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid" + isvalid);
        }
    }
}
