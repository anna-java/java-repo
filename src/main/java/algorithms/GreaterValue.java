/*
4. Напишите алгоритм GreaterValue, который из двух параметров типа int возвращает бОльшее значение.
Test Data:
3333, 9999
Expected Result = 9999
 */


package algorithms;

public class GreaterValue {

    public int greaterValue(int a, int b) {

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
