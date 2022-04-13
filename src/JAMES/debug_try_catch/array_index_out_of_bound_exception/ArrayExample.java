package exercise_james.debug_try_catch.array_index_out_of_bound_exception;

import java.util.Scanner;

public class ArrayExample {

//    public Integer[] creatRandom() {
//
//        Integer[] arr = new Integer[100];
//        System.out.println("Danh sách phần tử của mảng");
//        for (int i = 0; i < 100; i++) {
//            arr[i] = floor(random() + 100);
//        }
//        return arr;
//    }
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arrNumber = new Integer[100];
        for (int i = 0; i < 100; i++) {
            arrNumber[i] = rd.nextInt(i);
            System.out.print(arrNumber[i] + " " +
                    "");
        }
        return arrNumber;
    }

    private class Random {
        public Integer nextInt(int i) {
            return i = (int) Math.floor(Math.random() * 100 + 1);
        }
    }
}
