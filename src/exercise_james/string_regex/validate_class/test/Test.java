package exercise_james.string_regex.validate_class.test;

import exercise_james.string_regex.validate_class.ValidateClass;

public class Test {
    public static String[] arrClass = {"C11I21", "C0318G", "C12", "M03128G", "a12341P0", "P123123G", "P4G"};

    public static void main(String[] args) {
        ValidateClass check = new ValidateClass();
        for (String strig : arrClass) {
            if (check.isClass(strig)) {
                System.out.println(strig + "is class");
            } else
                System.out.println(strig + " is not class ");
        }
    }
}
