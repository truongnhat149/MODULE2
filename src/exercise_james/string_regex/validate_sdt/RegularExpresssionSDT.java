package exercise_james.string_regex.validate_sdt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresssionSDT {
    //Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
    private static final String NUMBER_REGEX =
            "[(]+\\d{2}+[)]+[-]+[(0]+\\d{9}+[)]$";
    public boolean isRegularExpresssionSDT(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
