//BubbleSort with two For loops


package algorithms;

import java.util.Arrays;

public class BubbleSort_NestedForLoops {

    private static void bubbleSort(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


        public static void main(String[] args) {

        int[] array = {2, 4, 66, 4, 3, 23, 5, 330};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
