package exercise_james.string_regex.validate_sdt.test;

import exercise_james.string_regex.validate_sdt.RegularExpresssionSDT;

public class RegularExpresssionSDTTest {
    private static String[] arrNumber = {"(84)-(0978489648)",
            "(a8)-(22222222)", "(814)-(0978489648)"};

    public static void main(String[] args) {
        RegularExpresssionSDT sdt = new RegularExpresssionSDT();
        for (String number : arrNumber) {
            if (sdt.isRegularExpresssionSDT(number)) {
                System.out.println(number + " is number phone");
            } else
                System.out.println(number + " is not number ");
        }
    }
}
