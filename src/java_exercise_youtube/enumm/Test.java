package java_exercise_youtube.enumm;

public class Test {
    public static void main(String[] args) {
        TimeTable timeTable2 = new TimeTable(Day.Monday , "Math, physic, chemistry ");
        TimeTable timeTable6 = new TimeTable(Day.Friday , "biology, physic, exercise ");
        TimeTable timeTable5 = new TimeTable(Day.Thursday , "exercise, biology, computer science ");

        System.out.println(timeTable2);

        int x = Month.Month_1.numberOfDays();
        System.out.println(x);
    }
}
