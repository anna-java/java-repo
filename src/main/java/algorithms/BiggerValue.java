/*
4. Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
Test Data:
3333, 9999
Expected Result = 9999
 */


package algorithms;

public class BiggerValue {

    public int biggerValue(int a, int b) {

        if (a != b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
        return 0;
    }
}
