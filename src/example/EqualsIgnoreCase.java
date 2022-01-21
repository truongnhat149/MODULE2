package example;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String string1 = "java";
        String string2 = "java";
        String string3 = "JAVA";
        String string4 = "JavaScript";

        // so sánh equals
        System.out.println("so sánh : equals");
        System.out.println(string1.equals(string3));

        // so sánh equalIgnoreCase sẽ bỏ qua chữ hoa hoặc chữ thường
        System.out.println("so sánh s1 và s2 = ignoreCase");
        System.out.println(string1.equalsIgnoreCase(string2));

        System.out.println("so sánh s1 vs s3 --- ");
        System.out.println(string1.equalsIgnoreCase(string3));

        System.out.println("so sánh s1 với s4");
        System.out.println(string1.equalsIgnoreCase(string4));
    }
}
