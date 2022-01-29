package exercise_james.string_regex.validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
//    Bắt đầu bằng một ký tự chữ hoa C hoặc A
//    hoặc P
//    Không chứa các ký tự đặc biệt
//    Theo sau ký tự bắt đầu là 4 ký tự số
//    Kết thúc phải là 1 trong những ký tự chữ hoa sau:
//    G, H, I, K, L, M
    public static final String CLASS_REGEX =
        "[C|A|P]+\\d{4}+[G|H|I|K|L|M]$";
    public boolean isClass(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
