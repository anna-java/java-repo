//BubbleSort with While and For loops


package algorithms;

import java.util.Arrays;

public class BubbleSort_WhileAndForLoops {

    public static void bubbleSort(int[] array) {

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {

                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }


    //Method 2
    public static void bubbleSort2(int[] array) {

        boolean isSorted = true;

        while (isSorted) {
            isSorted = false;

            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = true;
                }
            }
            for (int i = array.length - 1; i > 0; i--) {

                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = true;
                }
            }
        }
    }


    public static void main(String[] main) {

        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));


        //Method 2
        bubbleSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
