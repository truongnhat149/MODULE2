package Exercise.introductionToJava;

import java.util.Scanner;

public class calcDate {

    public static void main(String[] args) {
        Scanner calcDay = new Scanner(System.in);
        System.out.println("Which month that want to count date?");

        System.out.print("Enter month");
        int month = calcDay.nextInt();
        String daysInmonth;

        switch (month) {
            case 2:
                daysInmonth = " 28 or 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInmonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInmonth = "30";
                break;
            default :
                daysInmonth = "";
                break;
        }
            if (!daysInmonth.equals("")) {
                System.out.printf("The month %d has %s day", month, daysInmonth);

            }
            else System.out.print("invalid input");

//            case 1 :
//            case 3 :
//            case 5 :
//            case 7 :
//            case 8 :
//            case 10 :
//            case 12 :
//                System.out.print("that month has 31 date ");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.print("that month has 30 date");
//                break;
//            default:
//                System.out.print("that month has 29 date");
//                break;
        }

    }
