import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};

        int[] result1 = filterEvenIndexOddValue(array1);

        for (int num : result1) {

            System.out.print(num + " ");

        }

        System.out.println();

        int[] array2 = {2, 3, 4, 5, 6, 7};

        int[] result2 = filterEvenIndexOddValue(array2);

        for (int num : result2) {

            System.out.print(num + " ");

        }

        System.out.println();

        int[] array3 = {7, 8, 9, 10, 11};

        int[] result3 = filterEvenIndexOddValue(array3);

        for (int num : result3) {

            System.out.print(num + " ");

        }

    }

    public static int[] filterEvenIndexOddValue(int[] array) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                resultList.add(array[i]);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

}
