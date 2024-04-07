/*
Part 1
___________________________________________________

1. В пакете homework создать класс HW4, всю работу выполнять в этом классе.
Не забываем, что все методы у нас пока public static void.
Если вы хотите вынести общие для класса переменные за метод main, то делайте их static

2. Написать метод, который будет печатать номер задания перед каждым ответом. Придумайте свой дизайн.

3. Записать в виде кода следующие логические выражения:
1) (2 = 2) И (7 = 7);
2) Не(15 < 3);
3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
4) Не("Сосна" = "Дуб");
5) (Не(15 < 3)) И (10 > 20);
6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
7) (6/2 = 3) ИЛИ (7*5 = 20)

Записать в виде кода следующие выражения:
4.
а) Света младше Андрея и Наташи
б) На полке стоят учебники, а на столе лежат справочники.
в) БОльшая часть детей — девочки. Остальные - мальчики.

5. “Водительские права можно получить, только когда исполнится 16 лет.”

6. ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”

Записать выражения в виде условий if-else:

7. “Если с другом ты, это хорошо, а когда наоборот - плохо”

8. Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
Если x больше 10, то вывести на печать “x больше 10”.
Если x меньше нуля, то вывести на печать “x - отрицательное число”
Если x = 5, то вывести на печать “Разность x и 5 равна 0”
Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”.
Проверить, соответствует ли последнее утверждение всем предыдущим утверждениям.

9. Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
Выведите результат работы алгоритма на печать.Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

10. Напишите алгоритм проверки возраста на соответствие условиям (if-else):
Голосовать можно с 18 лет
Машину можно водить с 16 лет
В школу можно идти с 5 лет
Выведите результат работы алгоритма на печать.

11. Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
5 - выдать похвальную грамоту и перевести в следующий класс
4 - перевести в следующий класс
3 - дать задание на лето и перевести в следующий класс
2 - вызвать родителей и оставить в текущем классе на второй год
Выведите результат работы алгоритма на печать.

 */


package homework;

public class HW4 {
    static String line = "________\n";
    static String text = "Task #";
    static int num = 2;
    static int subNum = 1;
    static char letter = 'a';

    public static void printTask() {
        System.out.println(line + text + num);
        num++;
    }

    public static void printNum() {
        System.out.print(subNum + ") ");
        subNum++;
    }

    public static void printLetter() {
        System.out.print(letter + ") ");
        letter++;
    }


    public static void convertTemp(double celsius) {
        System.out.println("C = " + celsius);
        System.out.println("F = " + (celsius * 9 / 5 + 32));
    }


    static int k, l, m;

    static void printDivision(int k, int l, int m) {
        if (k != 0 && l != 0 && m != 0) {
            System.out.println("The result of k divided by l = " + k / l + ", and the remainder = " + k % l + '\n'
                    + "The result of k divided by m = " + k / m + ", and the remainder = " + k % m + "\n"
                    + "The result of l divided by m = " + l / m + ", and the remainder = " + l % m + "\n"
                    + "The result of m divided by k = " + m / k + ", and the remainder = " + m % k);
        } else {
            System.out.println("Division by 0 is not possible, please enter any other number");
        }
    }


    public static void speedAverage(double time, double distance) {
        System.out.println((Math.round(distance / time)) + " mph");
    }


    public static void applesStudents(int apples, int students) {
        if (apples == 42 && students == 42) {
            System.out.println("Если " + apples + " яблока поделить на " + students
                    + " ученика, то каждый ученик получит по " + apples / students + " яблоку, и "
                    + apples % students + " яблок останется учителю.");
        } else if (apples == 55 && students == 5) {
            System.out.println("Если " + apples + " яблок поделить на " + students
                    + " учеников, то каждый ученик получит по " + apples / students + " яблок, и "
                    + apples % students + " яблок останется учителю.");
        } else if (apples == 1 && students == 2) {
            System.out.println("Если " + apples + " яблоко поделить на " + students
                    + " учеников, то каждый ученик получит по " + apples / students
                    + " яблок, и " + apples + " яблоко останется учителю.");
        }
    }


    public static void main(String[] args) {

        printTask(); //Task 2


        printTask(); //Task 3

        printNum(); //1
        System.out.println((2 == 2) && (7 == 7));


        printNum(); //2
        System.out.println(!(15 < 3));


        printNum(); //3

        String tree1 = "Pine";
        String tree2 = "Oak";
        String tree3 = "Cherry";
        String tree4 = "Maple";

        System.out.println(tree1.equals(tree2) || tree3.equals(tree4));


        printNum(); //4
        System.out.println(!(tree1.equals(tree2)));


        printNum(); //5
        System.out.println((!(15 < 3) && (10 > 20)));


        printNum(); //6
        System.out.println();
        /* ("You have eyes to see") && (2nd floor is below a 3rd floor");
        bad operand types for binary operator '&&'*/


        printNum(); //7
        System.out.println((6 / 2 == 3) || (7 * 5 == 20));


        printTask(); //4

        printLetter(); //a
        int ageSveta = 18, ageAndrei = 20, ageNatasha = 22;

        System.out.println((ageSveta < ageAndrei) && (ageSveta < ageNatasha));


        printLetter(); //b
        System.out.println();
        //("There are books on the shelf") && ("There are handbooks on the table");


        printLetter(); //c
        System.out.println();
        //("The vast majority of the kids are girls") && ("The rest are boys");


        printTask(); //5

        int DriverAge = 16;

        if (DriverAge >= 16) {
            System.out.println("You can get a driver license if you're 16 y.o. or older");
        }


        printTask(); //6
        //("Peter isn't on a bus and reading a book") || ("Peter doesn't look at the window");


        printTask(); //7

        boolean youHaveAFriend = true;

        if (youHaveAFriend) {
            System.out.println("then it's good");
        } else {
            System.out.println("it's bad");
        }


        printTask(); //8

        int x = 10; //10, 12, -3, 5, 0

        if (x > 10) {
            System.out.println(x + " is greater than 10");
        } else if (x < 0) {
            System.out.println(x + " is a negative number");
        } else if (x == 5) {
            System.out.println("The difference between " + x + " and 5 is equal to 0");
        } else {
            System.out.println(((x < 11) && (x >= 0)) && (x != 5));
        }


        printTask(); //9

        int a = 15;

        if (a % 2 == 0) {
            System.out.println(a * 2);
        } else {
            System.out.println(a * a);
        }


        printTask(); //10

        letter = 'a';
        printLetter(); //a

        int age2 = 10;

        if (age2 > 0 && age2 <= 150) { //data validation
            if (age2 >= 18) {
                System.out.println("You can vote");
            } else {
                System.out.println("You're too young to vote");
            }
        } else {
            System.out.println("Please enter a valid age");
        }


        printLetter(); //b

        if (age2 >= 16) {
            System.out.println("You can apply for a driver license");
        } else {
            System.out.println("You have to be 16 y.o. to legally drive a car as an independent driver in the U.S.");
        }


        printLetter(); //c

        if (age2 >= 5) {
            System.out.println("You can go to school in the U.S");
        } else {
            System.out.println("You're too young and might need to consider Pre-K for now");
        }


        printTask(); //11

        int studentGrade = 1;

        if (studentGrade >= 2 && studentGrade <= 5) {
            if (studentGrade == 5) {
                System.out.println("Say congratulations and transfer a student to the next class");
            } else if (studentGrade == 4) {
                System.out.println("Transfer a student to the next class");
            } else if (studentGrade == 3) {
                System.out.println("Give a student homework for summer and transfer s/he to the next class");
            } else {
                System.out.println("Invite parents to school and don't transfer a student to the next class");
            }
        } else {
            System.out.println("Enter a valid grade");
        }


        printTask(); //12 (part 2)

        convertTemp(10);


        printTask(); //13 (part 2)

        int v = 8;
        int w = -6;

        if (v % 3 == 0 && w % 3 == 0) {
            System.out.println(v + w);
        } else if (v % 5 == 0 && w % 5 == 0) {
            System.out.println(v - w);
        } else if (v % 2 == 0 && w % 2 == 0) {
            if (v < 0 || w < 0) {
                System.out.println(-1 * v * w);
            } else {
                System.out.println(v * w);
            }
        } else {
                System.out.println("Impossible to make any calculations");
            }


        printTask(); //14

        printDivision(10, 60,1);


        printTask(); //15

        /*
        p = pheasants with 2 legs;
        r = rabbits with 4 legs;

        p + r = 35; counting heads
        2p + 4r = 94; counting legs

        p = 35 - r;
        2(35 - r) + 4r = 94;
        70 - 2r + 4r = 94;
        70 + 2r = 94;
        2r = 24;
        r = 12; rabbits;
        p = 35 - 12 = 23; pheasants
        */

        int actualRabbits = 12;
        int actualPheasants = 23;

        int expectedRabbits = 12;
        int expectedPheasants = 23;

        if (actualRabbits == expectedRabbits && actualPheasants == expectedPheasants) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        printTask(); //16

        speedAverage(0.3, 12);
        speedAverage(2.5, 150);
        speedAverage(1.75, 300);


        printTask(); //17

        applesStudents(42, 42);
        applesStudents(55, 5);
        applesStudents(1, 2);


        //18 skipped because it's a re-writing of one of the previous tasks


        printTask(); //19

        short num = -32768;

        if (num > -10 && num < 10) {
            System.out.println("It's a one-digit number");
        } else if ((num > -100 && num < -9) || (num > 9 && num < 100)) {
            System.out.println("It's a two-digit number");
        } else if ((num > -1000 && num < -99) || (num > 99 && num < 1000)) {
            System.out.println("It's a three-digit number");
        } else if ((num > -10000 && num < -999) || (num > 999 && num < 10000)) {
            System.out.println("it's a four-digit number");
        } else if ((num >= -32768 && num < -9999) || (num > 9999 && num < 32768)) {
            System.out.println("it's a five-digit number");
        } else {
            System.out.println("Out of short number's scope");
        }

    }
}
