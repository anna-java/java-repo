package homework;

import java.util.Arrays;

import static com.google.common.primitives.Ints.reverse;

public class FallRefresh {

    public static void main(String[] args) {

        System.out.println("Task #1_1:");
        /*
        Написать программу, которая будет печатать/выводить следующий текст:
        3
        2
        1
        Поехали!!!
         */

        System.out.println("""
                3
                2
                1
                Go!
                """);


        System.out.println("Task #1_2:");
        // Написать программу, которая будет печатать/выводить следующий текст:

        System.out.println("____888888______________________________\n" +
                "____888888______________________________\n" +
                "___8888888888___________________________\n" +
                "__888888888888__________________________\n" +
                "__8888111188888_________________________\n" +
                "_888881111188888___11___________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111118888_11____________________\n" +
                "_8888881111118888_11___11__8888888______\n" +
                "_8888881111118888__1__11__88888888888___\n" +
                "_8888888111111888____11__8888888888888__\n" +
                "__888888111111888_111___88888888888888__\n" +
                "__8888888111118881111__888881111118888__\n" +
                "___888888811188881111_8888811111111888__\n" +
                "____8888888188881111188888111111118888__\n" +
                "_____88888888888111118888111111118888___\n" +
                "______888888888111118888811111188888____\n" +
                "______8888888881111188888888888888______\n" +
                "_____888888888811111888888888888________\n" +
                "____88888888888111118888888888__________\n" +
                "___88881111888811111888888888___________\n" +
                "__8888111111888111118888888888__________\n" +
                "_888881111118881111188811118888_________\n" +
                "_8888881111888811111881111118888________\n" +
                "_8888888118888811111888111188888________\n" +
                "__888888888888_1111888881188888_________\n" +
                "___8888888888___111_8888888888__________\n" +
                "____88888888_____1___88888888___________\n" +
                "_____888888___________888888____________\n" +
                "_______________________8888_____________\n");


        System.out.println("Task #1_3:");
        // Вывести/напечатать смайлик, не :), а настоящий смайлик одним символом)

        System.out.println("""
                ( > ^ . ^ < )
                \t\t\t\tC( - ___ - C )
                ( 0 _._ 0 )""");
        System.out.println("\uD83D\uDE00");


        System.out.println("\nTask #2_1:");
        /*
        Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным
        на ваш выбор и вывести результаты следующих операций с этими переменными:
        сложение, умножение, вычитание, деление и остаток от деления.
        Также сделать проверку на четность этих переменных и вывести результат.
         */

        int a = 17;
        int b = 10;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;
        int odd = a % 2;
        int even = b % 2;

        System.out.println(STR."""
                            addition: \{addition}
                            subtraction: \{subtraction}
                            multiplication: \{multiplication}
                            division: \{division}
                            remainder: \{remainder}
                            a is an odd number, because the remainder is \{odd}
                            b is an even number, becasue the remainder is \{even}
                            """);

        System.out.println("Task #2_2:");
        /*
        Создать программу дележа добычи на пиратском корабле.
        По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
        остальное делится поровну между всеми членами команды, включая капитана.

        Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

        Вывести на экран кому сколько пиастров полагается.
        Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

        Дополнительное задание со звездочкой:
        Попробовать придумать как программа может проверить правильность дележа.
         */

        double trophy = 20000.0;
        int pirates = 11;
        // pirates quantity includes the shipowner and the captain

        double ownerShare = trophy / 2;
        double captainShare = (trophy - ownerShare) / 2;
        int crew = pirates - 1;
        // crew includes the captain, but not the shipowner
        double crewShare = (trophy - ownerShare - captainShare) / crew;
        double captainShareUpdated = captainShare + crewShare;

        System.out.println(STR."""
                            Shipowner gets $\{ownerShare}
                            Ship captain gets $\{captainShareUpdated}
                            Each crew member gets $\{crewShare}""");

        double shipOwnerIsAlsoTheCaptain = ownerShare + captainShareUpdated;
        System.out.println(STR."If the shipowner is also the captain, then his share will be $\{shipOwnerIsAlsoTheCaptain}");

        double shareCheck = ownerShare + captainShareUpdated + crewShare * (crew - 1);
        // crew - 1 is the crew without the captain because we've already calculated captainShareUpdated
        boolean check = (shareCheck == trophy);
        System.out.println(STR."Pirates check if all shares were calculated correctly: \{check}");


        System.out.println("\nTask #3_1:");
        /*
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        a == b - если переменные равны
        a < b - если переменная a меньше b
        a > b - если переменная b меньше a
         */
        a = 18;
        b = 36;

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");
        }


        System.out.println("\nTask #3_2:");
        /*
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная
         */
        a = 19;
        b = 22;

        if ((a + b) % 2 == 0) {
            System.out.println("Maybe a nad b are even");
        } else {
            System.out.println("Either a or b is odd");
        }


        System.out.println("\nTask #3_3:");
        /*
        Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор
        и вывести следующие строки:
        больше 10 - если переменная больше 10
        меньше 100 - если переменная меньше 100
        результат деления на 2 больше 20 - если это соответствует истине
        значение переменной между 5 и 40 включительно - если это правда
        значение переменной меньше 5 или больше 40 - если предыдущее условие ложное
         */
        int x = 40;

        if (x > 10 && x < 100) {
            System.out.println(x + " is greater than 10 and less than 100");
        } else if (x > 10) {
            System.out.println(x + " is greater than 10");
        } else {
            System.out.println(x + " is less than 100");
        }

        if (x / 2.0 == 20) {
            System.out.println(x + " divided by 2 is equal to 20");
        } else if (x / 2.0 > 20) {
            System.out.println(x + " divided by 2 is greater than 20");
        } else {
            System.out.println(x + " divided by 2 is less than 20");
        }

        if (x >= 5 && x <= 40) {
            System.out.println(x + " is in the [5; 40] range");
        } else {
            System.out.println(x + " is not in the [5; 40] range");
        }


        System.out.println("\nTask #3_4:");
        /*
        Необходимо вывести числа от 0 до 15
         */
        for (int i = 0; i < 16; i++) {
            //System.out.println("i = " + i);
            System.out.print(i + " ");
        }


        System.out.println("\n\nTask #3_5:");
        /*
        Необходимо вывести все положительные степени числа 5 которые меньше 10000,
        вывести результат возведения в степень.
         */
        for (int i = 1; i < 10000; i++) {
            int result = (int) Math.pow(5, i);

            if (result < 10000) {
                System.out.println("5^" + i + " = " + result);
            }
        }

        // variant #2
        for (int i = 5; i < 10000; i *= 5) {
            System.out.println("i = " + i);
        }


        System.out.println("\nTask #3_6:");
        /*
        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        Реализовать 2 варианта:
        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение).
         */
        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }


        // variant #2
        System.out.println();
        for (int i = 40; i < 61; i += 4) {
            System.out.println("i = " + i);
        }


        System.out.println("\nTask #4_1:");
        /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все нечетные числа из массива.
         */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }


        System.out.println("\n\nTask #4_2:");
        /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все значения массива больше 5.
         */
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 5) {
                System.out.print(array2[i] + " ");
            }
        }


        System.out.println("\n\nTask #4_3:");
        /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо увеличить все значения массива на 15.
         */
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array3.length; i++) {
            array3[i] += 15;
        }
        System.out.println(Arrays.toString(array3));


        System.out.println("\nTask #4_4:");
        /*
        Задача со звездочкой
        Дан массив из десяти произвольных целых чисел (например, {1, 2, …, 9, 10})
        Необходимо изменить порядок элементов массива на противоположный
        (т.е. чтобы получилось {10, 9, …, 2, 1}).
        Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
         */
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array4Reversed = array4;

        for (int i = array4Reversed.length - 1; i > -1; i--) {
            array4Reversed[i] = array4[i];
            System.out.print(array4Reversed[i] + " ");
        }
        System.out.println();


        // Variant #2
        reverse(array4);
        System.out.println(Arrays.toString(array4));


        // Variant #3
        array4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int index = 0; index < array4.length / 2; index++) {
            int mirroredIndex = array4.length - index - 1;

            System.out.println("Swapping elements " + index + " and " + mirroredIndex);

            int temp = array4[index];
            array4[index] = array4[mirroredIndex];
            array4[mirroredIndex] = temp;
        }
        System.out.println(Arrays.toString(array4));


        System.out.println("\nTask #5_1:");
        /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.
         */
        array = new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);


        System.out.println("\nTask #5_2:");
        /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.
         */
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);


        System.out.println("\nTask #5_3:");
        /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.
         */
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);


        System.out.println("\nTask #5_4:");
        /*
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.
         */
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        sum = 0;
        int sumAvg = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            sumAvg = sum / array.length;
        }
        System.out.println(sumAvg);


        System.out.println("\nTask #5_5:");
        /*
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.
         */
        int[][] array4D = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;

        for (int i = 0; i < array4D.length; i++) {
            for (int j = 0; j < array4D[i].length; j++) {
                sum += array4D[i][j];
            }
        }
        System.out.println(sum);


        System.out.println("\nTask #5_6:");
        /*
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.
         */
        int[][] array2DMax = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        max = Integer.MIN_VALUE;

        for (int i = 0; i < array2DMax.length; i++) {
            for (int j = 0; j < array2DMax[i].length; j++) {
                if (array2DMax[i][j] > max) {
                    max = array2DMax[i][j];
                }
            }
        }
        System.out.println("Maximum array value is " + max);







    }
}
