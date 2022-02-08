package exercise_james.file_io.max_write_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile rawf = new ReadAndWriteFile();
        List<Integer> numbers = rawf.readFile("D:\\JAVA\\2code\\src\\exercise_james\\file_io\\max_write_file\\numbers.txt");
        int maxValue = findMax(numbers);
        rawf.writeFile("D:\\JAVA\\2code\\src\\exercise_james\\file_io\\max_write_file\\result.txt", maxValue);
    }
}
