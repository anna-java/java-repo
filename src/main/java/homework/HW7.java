/*
HW 7 for Beginners

Part 1
___________________________________________________

Все задания выполнять в классе HW7 в проекте JavaForBeginners (без Maven)

1. Прочитать ссылку про оператор switch в документации Oracle, посмотреть видео (ссылки в презентации),
и переписать  методы returnMonth(), returnDayOfTheWeek() с помощью оператора switch.
(Эти методы нужно найти в Слаке в коде, который выставляла Гаяна в субботу, 8 октября).

2. Написать универсальный метод для построения последовательности, которая начинается с числа start,
заканчивается числом end (оба включительно). Все числа в этой последовательности должны быть кратны числу step.
Этот метод должен высчитывать первое кратное число в диапазоне [start, end] и строить последовательность
(возрастающую или убывающую) от вычисленного первого кратного числа с шагом step.
(Эта задача по мотивам разбора HW6, Part 1 в воскресенье 9 октября)

3. Создать массив catsNames[], заполнить его любыми своими значениями (не такими, как были на уроке).

4. В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”, а значение элемента с индексом 1 на “Черныш”.

5. Создать массив catsColors[] и заполнить его значениями (см картинку в презентации).

6. Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.

7. Создать массив isCatRed[] и заполнить его соответствующими значениями (см картинку в презентации. Red = рыжий)

8. Распечатать для массивов catsNames[] и catsColors[]:
имя кота в коробке с номером 6
имена котов из коробок с четными индексами
имена котов из коробок, чьи индексы кратны 4
цвет котов из коробок с нечетными индексами
цвет котов из коробок, чьи индексы кратны 3, но не кратны 2

9. Распечатать “Накорми кота!” для всех серых котов

10. Распечатать “Дай коту воды!” для всех котов со значениями true из массива isCatRed[]

11. Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет

12. Для кота в последней коробке распечатать имя, цвет, возраст

13. Распечатать имя, цвет, возраст котов в двух серединных коробках

14. Распечатать имена всех котов, чей возраст больше 2 лет

15. Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true

16. Распечатать средний возраст котов из массива catsAges[]

17. Распечатать возраст самого молодого кота

18. Распечатать возраст самого старого кота

19. Распечатать количество серых котов и количество рыжих котов

20. Распечатать имя кота, если кот находится в коробке с нечетным индексом и его возраст не больше 2 лет


Part 2
___________________________________________________

21. Написать метод, который создает и печатает массив четных положительных чисел, значения которых не больше 6.
Заполняем значения и печатаем с помощью цикла for. Длина массива - l.

22. Написать метод, который принимает на вход массив int, и печатает среднее значение всех элементов массива.
Проверить работу метода, если параметр на вход - массив catsAges

23. Создать массив всех нечетных отрицательных чисел в промежутке от (-1000 до -900).

24. Создать массив из 10 случайных положительных целых чисел в промежутке от 100 до 200 включительно.

25. Написать метод, который принимает на вход массив int[] array и число int number.
Метод проверяет, содержится ли число number в массиве array.
При первом нахождении числа number, метод печатает “yes”.
При каждом нахождении чисел на 1 больше числа number, или на 1 меньше числа number, метод печатает “maybe”.
Метод печатает “no”, если не находит ни одного числа, соответствующего условиям.


Part 3
___________________________________________________


 */


package homework;

import java.util.Arrays;

public class HW7 {

    static String line = "__________________________________________________________\n";
    static String text = "TC ";
    static int num = 1;


    public static void printTaskNum() {
        System.out.println(line + text + num);
        num++;
    }


    //Method 1
    public static String returnMonth(int month) {
        String returnMonth;
        switch (month) {
            case 1:
                returnMonth = "January";
                break;
            case 2:
                returnMonth = "February";
                break;
            case 3:
                returnMonth = "March";
                break;
            case 4:
                returnMonth = "April";
                break;
            case 5:
                returnMonth = "May";
                break;
            case 6:
                returnMonth = "June";
                break;
            case 7:
                returnMonth = "July";
                break;
            case 8:
                returnMonth = "August";
                break;
            case 9:
                returnMonth = "September";
                break;
            case 10:
                returnMonth = "October";
                break;
            case 11:
                returnMonth = "November";
                break;
            case 12:
                returnMonth = "December";
                break;
            default:
                returnMonth = "Invalid month";
                break;
        }
        return returnMonth;
    }


    public static String returnDayOfTheWeek(int day) {
        String returnDayOfTheWeek;
        switch (day) {
            case 1:
                returnDayOfTheWeek = "Mon";
                break;
            case 2:
                returnDayOfTheWeek = "Tue";
                break;
            case 3:
                returnDayOfTheWeek = "Wed";
                break;
            case 4:
                returnDayOfTheWeek = "Thu";
                break;
            case 5:
                returnDayOfTheWeek = "Fri";
                break;
            case 6:
                returnDayOfTheWeek = "Sat";
                break;
            case 7:
                returnDayOfTheWeek = "Sun";
                break;
            default:
                returnDayOfTheWeek = "Invalid day";
                break;
        }
        return returnDayOfTheWeek;
    }


    //Need to add the code for #5 test scenario
    public static void returnNumLine(int start, int end, int step) {

        if (step == 0) {
            System.out.print("Error! Enter correct step number");
        } else {
            if (start < end && step > 0) { //Positive step
                int start1 = start - start % step;
                if (start1 < start) {
                    start1 += step;
                }
                for (int i = start1; i <= end; i += step) {
                    System.out.print(i + ", ");
                }
            } else if (start > end && step > 0) { //Positive step
                int start1 = start - start % step;
                if (start1 > start) {
                    start1 -= step;
                }
                for (int i = start1; i >= end; i -= step) {
                    System.out.print(i + ", ");
                }
            } else if (start < end && step < 0) { //Negative step
                int start1 = start - start % step;
                if (start1 < start) {
                    start1 -= step;
                }
                for (int i = start1; i <= end; i -= step) {
                    System.out.print(i + ", ");
                }
            } else if (start > end && step < 0) { //Negative step
                int start1 = start - start % step;
                if (start1 > start) {
                    start1 += step;
                }
                for (int i = start1; i >= end; i += step) {
                    System.out.print(i + ", ");
                }
            }
        }
    }


        public static void main(String[] args) {

            printTaskNum(); //1

            System.out.println(returnMonth(11));
            System.out.println(returnDayOfTheWeek(3));


            printTaskNum(); //2

            returnNumLine(1, 26, 7);
            System.out.println();

            returnNumLine(-1, -26, -7);
            System.out.println();

            returnNumLine(-1, 26, 7);
            System.out.println();

            returnNumLine(1, -26, -7);
            System.out.println();

            returnNumLine(1, -26, 0);
            System.out.println();

            returnNumLine(10, 10, 2);


            printTaskNum(); //3

            String[] catsNames = new String[]{"Bucks", "Chris", "Darcy", "Musya", "Ajax", "Ginger", "Shadow", "Brownie",
                    "Onyxia", "Snowflake"};

            System.out.println(Arrays.toString(catsNames));


            printTaskNum(); //4

            catsNames[1] = "Chernysh";
            catsNames[4] = "Ryzhik";

            System.out.println(Arrays.toString(catsNames));


            printTaskNum(); //5

            String[] catsColors = new String[]{"gray", "black", "light-gray", "dark-gray", "orange", "orange",
                    "chocolate", "brown", "turtle", "ashy"};

            System.out.println(Arrays.toString(catsColors));


            printTaskNum(); //6

            Integer[] catsAges = new Integer[10];

            catsAges[0] = 20;
            catsAges[1] = 14;
            catsAges[2] = 1;
            catsAges[3] = 5;
            catsAges[4] = 10;
            catsAges[5] = 17;
            catsAges[6] = 15;
            catsAges[7] = 3;
            catsAges[8] = 11;
            catsAges[9] = 2;

            System.out.println(Arrays.toString(catsAges));


            printTaskNum(); //7

            boolean[] isCatOrange = new boolean[10];

            if (catsColors.length == isCatOrange.length) {

                for (int i = 0; i < catsColors.length; i++) {
                    if (catsColors[i].equals("orange")) {
                        isCatOrange[i] = true;
                    } else {
                        isCatOrange[i] = false;
                    }
                }
            }

            System.out.println(Arrays.toString(isCatOrange));

            /* Method 2

            Boolean[] isCatOrange = new Boolean[]{false, false, false, false, true, false, true, false};

            System.out.println(Arrays.toString(isCatOrange)); */


            printTaskNum(); //8

            System.out.println(catsNames[6]);

            for (int i = 0; i < catsNames.length; i += 2) {
                System.out.print(catsNames[i] + ", ");
            }

            System.out.println();

            for (int k = 0; k < catsNames.length; k += 4) {
                System.out.print(catsNames[k] + ", ");
            }

            System.out.println();

            for (int l = 1; l < catsColors.length; l += 2) {
                System.out.print(catsColors[l] + ", ");
            }

            System.out.println();

            for (int m = 0; m < catsColors.length; m += 3) {
                if (m % 2 != 0) {
                    System.out.print(catsColors[m] + ", ");
                }
            }

            System.out.println();


            printTaskNum(); //9

            for (int i = 0; i < catsColors.length; i++) {
                if (catsColors[i].equals("gray")) {
                    System.out.println("Feed " + catsNames[i] + "!");
                }
            }

            printTaskNum(); //10

            for (int i = 0; i < isCatOrange.length; i++) {
                if (isCatOrange[i]) {
                    System.out.println("Give " + catsNames[i] + " some water!");
                }
            }


            printTaskNum(); //11

            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] < 2) {
                    System.out.println("Get " + catsNames[i] + " vaccinated!");
                }
            }


            printTaskNum(); //12

            if ((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length)) {

                int boxNum = catsNames.length - 1;

                System.out.println(catsNames[boxNum]);
                System.out.println(catsNames[boxNum]);
                System.out.println(catsNames[boxNum]);
            }


            printTaskNum(); //13


            for (int i = 0; i < catsNames.length; i++) {

                int boxNum1 = catsNames.length / 2 - 1;
                int boxNum2 = catsNames.length / 2;

                if (i == boxNum1 || i == boxNum2) {
                    System.out.println(catsNames[i] + ", " + catsAges[i] + " y.o., " + catsColors[i] + " color");
                }
            }


            /* 2nd variant

            if ((catsNames.length == catsAges.length) || (catsAges.length == catsColors.length)) {

                int midBox1 = catsNames.length / 2;

                System.out.println(catsNames[midBox1 - 1] + ", " + catsNames[midBox1]);
                System.out.println(catsAges[midBox1 - 1] + ", " + catsAges[midBox1]);
                System.out.println(catsColors[midBox1 - 1] + ", " + catsColors[midBox1]);

            }

             */


            printTaskNum(); //14

            if (catsNames.length == catsAges.length) {

                for (int i = 0; i < catsAges.length; i++) {
                    if (catsAges[i] > 2) {
                        System.out.print(catsNames[i] + ", ");
                    } else {
                        System.out.println("too young");
                    }
                }

            }


            printTaskNum(); //15

            if (catsNames.length == isCatOrange.length) {

                for (int i = 0; i < catsColors.length; i++) {
                    if (isCatOrange[i]) {
                        System.out.println("Feed " + catsNames[i] + "!");
                    }
                }

            }


            printTaskNum(); //16


            double catsAgesSum = 0;

            for (int i = 0; i < catsAges.length; i++) {
                catsAgesSum += catsAges[i];
            }

            double catsAgesAvg = catsAgesSum / catsAges.length;

            System.out.println(catsAgesAvg);


            printTaskNum(); //17

            Arrays.sort(catsAges);

            int min = catsAges[0];

            System.out.println(min);


            printTaskNum(); //18

            int max = catsAges[catsAges.length - 1];

            System.out.println(max);


            printTaskNum(); //19

            int countGray = 0;
            int countOrange = 0;

            for (int i = 0; i < catsColors.length; i++) {

                if (catsColors[i].equals("gray") || catsColors[i].equals("light-gray") || catsColors[i].equals("dark-gray")) {

                    countGray++;
                    System.out.println(countGray + " gray cat(s)");

                } else if (catsColors[i].equals("orange")) {

                    countOrange++;
                    System.out.println(countOrange + " orange cat(s)");
                }
            }


            printTaskNum(); //20

            if (catsNames.length == catsAges.length) {

                for (int i = 1; i < catsAges.length; i += 2) {

                    if (catsAges[i] <= 2) {
                        System.out.println(catsNames[i]);
                    }
                }
            }
        }
    }
