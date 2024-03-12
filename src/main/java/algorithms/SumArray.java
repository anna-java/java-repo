/*
HW8 Part 1
___________________________________________________
3. Написать алгоритм SumArray, который возвращает сумму всех чисел массива

Test Data:
{0, 1, 2, 3, 4, 5} → 15
{-7, -3} → -10

 */

package algorithms;

import project_helpers.Helpers;

public class SumArray {

    public int SumArray(int[] array) {

        int[] array = {};
        int sum = 0;

        if (Helpers.checkIfArrayIsEmpty(array)) {

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        return sum;
    }
}
