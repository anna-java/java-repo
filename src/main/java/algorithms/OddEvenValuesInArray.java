/*
Для заданий 10 и 11 необходимо писать методы в классе OddEvenValuesInArray, а тестовые методы в классе OddEvenValuesInArrayTest

10. Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел, и возвращает количество четных чисел в этом массиве

11. Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел, и возвращает количество нечетных чисел в этом массиве

12. В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(), который принимает на вход массив
целых чисел и число number. Метод возвращает значение true, если все элементы массива больше number, иначе возвращает false
 */


package algorithms;

public class OddEvenValuesInArray {

    public int countEvenValuesInArray(int[] array) {

        int counter = 0;

        if (array == null || array.length == 0) {
            return -1;
        } else {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }


    public int countOddValuesInArray(int[] array) {

        int counter = 0;

        if (array == null || array.length == 0) {
            return -1;
        } else {

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }


    public boolean areValuesGreaterThanNumber(int[]array, int number) {

        if (array == null || array.length == 0) {
            return false;
        } else {

            for (int i = 0; i < array.length; i++) {
                if (array[i] > number) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}


