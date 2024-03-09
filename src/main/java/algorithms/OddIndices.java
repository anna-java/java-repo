/*
Написать алгоритм OddIndices, который принимает массив целых чисел, и возвращает массив значений нечетных индексов
Test Data:
Input = {-45, 590, 234, 985, 12, 68}
Expected Result =  {590, 985, 68}
*/

package algorithms;

import project_helpers.Helpers;

public class OddIndices {

    public int[] oddIndices(int[] array) {

        if (Helpers.checkIfArrayIsEmpty(array)) {

            int count = 0;
            int[] newArray = new int[array.length / 2];

            for (int i = 1; i < array.length; i += 2) {
                newArray[count] = array[i];

                count++;
        }
            return newArray;
        }
        return new int[0];

    }
}



