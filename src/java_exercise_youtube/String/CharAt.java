package java_exercise_youtube.String;


public class CharAt {
    public static void main(String[] args) {
        String sv1 = "Le Phung Nhat Truong";
        String sv2 = "Le Phung Nhat truong";
        String sv3 = "Le Phung Nhat ";

        System.out.println("sv 1 compareTo sv2 " + sv1.compareTo(sv2));
        System.out.println("sv 1 compareTo sv3 " + sv1.compareTo(sv3));
        System.out.println("sv 1 compareToIgnoreCase sv2 " + sv1.compareToIgnoreCase(sv2));
        System.out.println("sv 1 compareToIgnoreCase sv3 " + sv1.compareToIgnoreCase(sv3));

        boolean check = sv1.regionMatches(3, sv2, 4, 5);
        System.out.println(check);
        String sdt = "0862955026";
        System.out.println(sdt.startsWith("0862"));
        System.out.println(sdt.startsWith("0865"));
        System.out.println(sdt.endsWith("026"));
        System.out.println(sdt.endsWith("028"));
    }
}
