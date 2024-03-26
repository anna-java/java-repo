/*
Для заданий 5-9 необходимо писать методы в классе ManipulationsWithArrays, а тестовые методы в классе ManipulationsWithArraysTest

5. Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
Метод возвращает массив тех же чисел, умноженных на number
Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}

6. Написать метод toDoubleArray(), который принимает на вход массив целых чисел, и возвращает массив типа double[] из тех же чисел
Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}

7. Написать метод toIntArray(), который принимает на вход массив типа double[], и возвращает массив типа int[] из тех же чисел
Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

8. Написать метод toStringArray(), который принимает на вход массив целых чисел, и возвращает массив типа String[] из тех же чисел
(желательно не использовать метод .toString(), нужно переводить вручную)
Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}

9. Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа String[]
(желательно не использовать метод .toString(), нужно переводить вручную)
Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
 */


package algorithms;

public class ManipulationsWithArrays {

    public int[] multiplyArrayByNumber(int[] array, int multiplier) {

        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new int[0];
        } else {
            int[] multipliedArray = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                int multipliedIndex = array[i] * multiplier;
                multipliedArray[i] = multipliedIndex;
            }
            return multipliedArray;
        }
    }


    public double[] toDoubleArray(int[] array) {

        if (array == null) {
            return null;
        } else if (array.length == 0) {
            return new double[0];
        } else {
            double[] doubleArray = new double[array.length];

            for (int i = 0; i < array.length; i++) {
                doubleArray[i] = array[i];
            }
            return doubleArray;
        }
    }
}
