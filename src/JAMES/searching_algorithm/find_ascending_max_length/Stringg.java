package exercise_james.searching_algorithm.find_ascending_max_length;

import java.util.LinkedList;
import java.util.Scanner;

public class Stringg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String string = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        int leng = string.length();
        for (int i = 0; i < leng; i++)
        {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < leng; j++)
            {
                if (string.charAt(j) > list.getLast())
                    list.add(string.charAt(j));
            }
            if (list.size() > max.size())
            {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max)
        {
            System.out.println(character);
        }
        System.out.println();
    }
}
/*********************************************************************************
 * 	Tính toán độ phức tạp của bài toán:                                           *
 * 	1 vòng lặp bên ngoài = n;                                                     *
 * 	1 vòng lặp bên trong = n - 1;                                                 *
 *  1 câu lệnh = 1                                                                *
 * 	1 vòng lặp * 1 câu lệnh = 1;                                                  *
 *  T(n) = (n * (n - 1)) + (1 + 1);                                               *
 *  T(n) = O(n^2) + O(n);                                                         *
 * 	T(n) = O(n^2);                                                                *
 * 	=> Độ phức tạp bài toán này là O(n^2)                                         *
 *********************************************************************************/


