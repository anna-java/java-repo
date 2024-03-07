/*
Написать алгоритм OddIndices, который принимает массив целых чисел, и возвращает массив значений нечетных индексов
Test Data:
Input = {-45, 590, 234, 985, 12, 68}
Expected Result =  {590, 985, 68}
*/

package algorithms;

public class OddIndices {

    public int oddIndices(int[] array) {

        array = new int[]{-45, 590, 234, 985, 12, 68};

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                return array[i];
            }
        } return 0;

    }
}



