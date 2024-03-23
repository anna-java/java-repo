/*
Методы и тесты из заданий 1-4 писать в классах - CreateArray и CreateArrayTest.

1. В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(), который принимает
на вход 5 целых чисел, и возвращает массив из этих же чисел.
Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
 */

package algorithms;

public class CreateArray {

    public int[] createIntArray(int num1, int num2, int num3, int num4, int num5) {

        return new int[]{num1, num2, num3, num4, num5};
    }
}
