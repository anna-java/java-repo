package homework;

import java.util.Arrays;

public class WinterRefresh {

    /*
Задача №1

Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел
*/

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return 1.0 * a / b;
    }


/* Задачи №2

https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
     */

    public static int doubleInteger(int i) {
        return i * 2;
    }


    public static boolean isLove(final int flower1, final int flower2) {
        //return (flower1 % 2 == 0 && flower2 % 2 == 1) || (flower1 % 2 == 1 && flower2 % 2 == 0);
        return (flower1 + flower2) % 2 == 1;
    }


    public static String numberToString(int num) {
        //return "" + num;
        return String.valueOf(num);
    }


    public static int findSmallestInt(int[] arguments) {

        int smallestInt = Integer.MAX_VALUE;
        //int smallestInt = arguments[0];

            for (int i = 0; i < arguments.length; i++) {
                if (arguments[i] < smallestInt) {
                    smallestInt = arguments[i];
                }
            }
        return smallestInt;
    }


    public static String countingSheep(int num) {

        if (num <= 0) {
            return "-1";
        }
        String string = " sheep. . .";

        for (num = 1; num < 10; num++) {
            System.out.print(num + string);
        }
        return "" + num + string;
    }


    /* Задача №1

Написать статический метод, превращающий натуральное (целое положительное) число (например, 643) в строку,
состоящую из названий цифр этого числа (например, “шесть четыре три”).
*/

    public static void convertToNum(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                System.out.print("Negative numbers are not allowed! ");
            } else if (array[i] == 0) {
                System.out.print("zero ");
            } else if (array[i] == 1) {
                System.out.print("one ");
            } else if (array[i] == 2) {
                System.out.print("two ");
            } else if (array[i] == 3) {
                System.out.print("three ");
            } else if (array[i] == 4) {
                System.out.print("four ");
            } else if (array[i] == 5) {
                System.out.print("five ");
            } else if (array[i] == 6) {
                System.out.print("six ");
            } else if (array[i] == 7) {
                System.out.print("seven ");
            } else if (array[i] == 8) {
                System.out.print("eight ");
            } else if (array[i] == 9) {
                System.out.print("nine ");
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("Task #7_1:");
        System.out.println(addition(3, 5));
        System.out.println(subtraction(3, 5));
        System.out.println(multiplication(3, 5));
        System.out.println(division(29, 5));


        System.out.println("\nTask #7_2:");
        System.out.println(doubleInteger(5));

        System.out.println(isLove(6, 5));
        System.out.println(isLove(8, 8));

        System.out.println(numberToString(123));

        int[] arguments = {34, 15, 88, 2};
        System.out.println(findSmallestInt(arguments));

        System.out.println(countingSheep(5));


        System.out.println("\nTask #8_1:");
        convertToNum(new int[]{8, -3, 0});

    }
}


/*Задача №2

Создать класс Employee, в котором хранится информация о сотруднике предприятия:
имя, месячная зарплата, количество детей.
Создать класс TaxPayment, в котором будет храниться имя сотрудника и сумма подоходного налога,
который он должен будет заплатить.
Создать метод, который получит массив сотрудников, и вернет (или распечатает, но лучше, если вернет)
массив налоговых выплат (TaxPayment) по следующему правилу:
Если зарплата больше 10000, то налоговая ставка 23%
Если зарплата от 5000 до 10000, то налог составляет 18%
Если зарплата меньше 5000, то налог составляет 13%
За каждого ребенка из зарплаты вычитается 1000, и налог берется с оставшейся суммы.
*/



/*
Задача №3
(на подумать, сложная)

Я читаю студентам некий курс, состоящий из 10 занятий. Мне нужен класс, который представляет собой классный журнал.
Этот журнал содержит список студентов (фамилии придумайте сами) и “клеточки” для выставления оценок
(подсказка — как лучше хранить имя студента и все его оценки вместе?)
Класс должен иметь следующие возможности (реализованные как методы):
Поставить оценку любому студенту за любое занятие (по номеру занятия).
Распечатать все оценки всех студентов за одно занятие (по номеру)
Распечатать все оценки всех студентов за весь курс
Посчитать средний балл любого студента.
     */
