/*
Методы и тесты из заданий 1-4 писать в классах - CreateArray и CreateArrayTest.

1. В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(), который принимает
на вход 5 целых чисел, и возвращает массив из этих же чисел.
Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

2. Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}

3. Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}

4. 4-aя задача только для тех, кто хочет разобраться с методом класса String split()
Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов и возвращает массив из этих слов.
Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
 */


package algorithms;

public class CreateArray {

    public int[] createIntArray(int num1, int num2, int num3, int num4, int num5) {

        return new int[]{num1, num2, num3, num4, num5};
    }


    public double[] createDoubleArray(double num1, double num2, double num3, double num4, double num5) {

        return new double[]{num1, num2, num3, num4, num5};
    }


    public String[] createStringArray(String word1, String word2, String word3, String word4, String word5) {

        return new String[]{word1, word2, word3, word4, word5};
    }
}
