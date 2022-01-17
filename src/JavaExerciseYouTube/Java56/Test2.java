package JavaExerciseYouTube.Java56;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
//        Student student1 = new Student(140, "LPNT", "Class 12", 7);
//        Student student2 = new Student(230, "NTTH", "Class 8", 5);
//        Student student3 = new Student(350, "BTT", "Class 5", 6.5);
////        System.out.println(Arrays.toString(student1));
//        Student[] students = new Student[] {student1, student2, student3};
//        System.out.println("Array before sorting " +Arrays.toString(students));
//        // array after ascending arrangement
//
//        Arrays.sort(students);
//        System.out.println("Array after sorting " +Arrays.toString(students));

        String stringg = "Hello everybody, my name is truong";
        String[] arr = stringg.split(" ");
        System.out.println(Arrays.toString(arr));

        String[] arr2 = stringg.split(",");
        System.out.println(Arrays.toString(arr2));

        String string2 = "Hello all. I am Truong! twently four year old. i am programming! 1 ";
        String[] arr3 = string2.split("\\.|\\!");
        System.out.println(Arrays.toString(arr3));
    }
}
