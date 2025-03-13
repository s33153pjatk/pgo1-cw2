public class Zad2 {

    public static int findDominant(int[] array) {
        int candidate = -1;
        int count = 0;

        for (int num : array) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > array.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 2, 2};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {5, 5, 5, 5, 1};

        System.out.println(findDominant(array1));
        System.out.println(findDominant(array2));
        System.out.println(findDominant(array3));
    }
}
