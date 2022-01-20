package java_exercise_youtube.other;

import java.util.Objects;

public class Equals {
    private int day;
    private int month;

    public Equals() {
    }
    public Equals(int day, int month) {
        if (day >= 1 && day < 31) {
            this.day = day;
        } else {
            System.out.println("Oh no! Please check and re-enter");
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Oh no! Please check and re-enter");
            this.month = 1;
        }
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public void setDay(int day) {
        if (day >= 1 && day < 31) {
            this.day = day;
        }
        else {
            System.out.println("Oh no! Please check and return enter");
            this.day = 1;
        }
    }
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
        else {
            System.out.println("Oh no! Please check and return enter");
            this.month = 1;
        }
    }
    public String toString() {
        return "day = " + this.day + " month = " + this.month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equals equals = (Equals) o;
        return day == equals.day && month == equals.month;
    }
    @Override
    public int hashCode() {
        return Objects.hash(day, month);
    }
}
