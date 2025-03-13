public class Zad3 {

    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;

        if (n <= 1) {
            return array;
        }

        positions = positions % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + positions) % n] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int positions1 = 2;
        int[] array2 = {1, 2, 3};
        int positions2 = 3;

        printArray(rotateArray(array1, positions1));
        printArray(rotateArray(array2, positions2));
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
