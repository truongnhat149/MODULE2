package exercise_james.string_regex.validate_account.test;

import exercise_james.string_regex.validate_account.AccountExample;

public class Test {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[]
            {"123abc_", "_abc123", "____________", "123456", "abcght"};
    public static final String[] invalidAccount = new String[]
            {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid " + isvalid);
        }

        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid " + isvalid);
        }
    }
}
