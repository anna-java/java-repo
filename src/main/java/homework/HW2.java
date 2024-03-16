/*
Part 1
Ожидается, что вы выполните все задания.
___________________________________________________

Попробуйте задания 1 и 2 выполнить с помощью инструкций:
https://www.jetbrains.com/help/idea/rename-refactorings.html

https://coderlessons.com/tutorials/java-tekhnologii/izuchite-intellidzh-ideia/intellij-idea-refaktoring-koda

1. В проекте JavaForBeginners05:
В папке src создать новый пакет с названием myWork.
Переименовать пакет в myPackage
В пакете myPackage создать класс MyClass
В классе MyClass запустить пустую программу (сделать так, чтобы код отработал с результатом 0)
Переименовать класс MyClass в DeleteClass
Переименовать пакет myPackage в deletePackage
Удалить класс DeleteClass
Удалить пакет deletePackage
(не удалите весь проект!)
Если вы повторяли за мной код на уроке и, как и я, назвали класс HW2, то переименуйте этот класс в Lesson2.

2. В папке src:
Создать новый пакет с названием homework.
Перенести класс HW1 в пакет homework
В пакете homework создать класс HW2
Написать точку входа в программу
Запустить программу

Остальные задания выполнять в классе HW2:

3. Создать переменную number, присвоить ей значение 3, и перед каждым ответом на последующие задачи выводить на печать:
Task …
где вместо … должен стоять номер задания, распечатанный с помощью переменной number и унарного оператора.
* Так же можно вывести букву подзадания с помощью переменной
char subTask и унарного оператора

4. Создать целочисленные переменные x, y, z и присвоить им любые значения (на ваше усмотрение)
Вывести значения переменных в столбик
Вывести значения переменных в строку
Вывести значения этих переменных так, чтобы было понятно, какое значение к какой переменной относится.
Например, должно быть распечатано:
int x = 5;
или
y = 10;

5. Используя конкатенацию, вывести в строку через запятую значения переменных из задания 4
Пример вывода:
5, 10, 15

6. Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
Sum of x and y = …
x * z = …
Разность переменных y и z = …

7. Создать переменные apple и student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение, где вместо … - результаты математических вычислений:
Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.

8. Распечатать выражение из задания 7 со значениями 100 и 21 соответственно.

9.  Решить с помощью переменных и математических вычислений

10. Распечатать выражение с помощью переменных и вычислений:
У сороконожки заболели ножки:
8 ноют, 5 гудят,
7 хромают, 2 болят.
Помоги сороконожке
Посчитать здоровые ножки.
Ответ: …

 */

package homework;

public class HW2 {

    public static void main(String[] args) {

        int number = 3;
        char subTask = 'a';

        System.out.println("Task " + number + ":"); //3
        System.out.println("----------");


        System.out.println("Task " + ++number + subTask + ":"); //4a

        int x = 3, y = 5, z = 7;

        System.out.println(x + "\n" + y + "\n" + z);
        System.out.println("----------");


        System.out.println("Task " + number + ++subTask + ":"); //4b
        System.out.println(x + " " + y + " " + z);
        System.out.println("----------");


        System.out.println("Task " + number + ++subTask + ":"); //4c
        System.out.println("int x = " + x + ";\n" + "int y = " + y + ";\n" + "int z = " + z + ";");
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //5
        System.out.println(x + ", " + y + ", " + z);
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //6
        System.out.println("Sum of x and y = " + (x + y));
        System.out.println("x * z = " + x * z);
        System.out.println("Разность переменных y и z = " + (y - z));
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //7

        int apples = 40, students = 6;

        System.out.println("Если " + apples + " яблок поделить на "
                + students + " учеников, то каждый ученик получит по "
                + apples / students + " яблок, и "
                + apples % students + " яблока останется учителю.");
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //8

        apples = 100; students = 21;

        System.out.println("Если " + apples + " яблок поделить на "
                + students + " учеников, то каждый ученик получит по "
                + apples / students + " яблокa, и "
                + apples % students + " яблок останется учителю.");
        System.out.println("----------");

        System.out.println("Task " + ++number + ":"); //9

        int lemons = 6;
        apples = lemons + 24;
        int pears = apples - 12;

        System.out.println(lemons + apples + pears + " kg");
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //10

        int legs = 40, sick1 = 8, sick2 = 5, sick3 = 7, sick4 = 2;

        System.out.println(legs - sick1 - sick2 - sick3 - sick4 + " healthy legs");
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //11 (part 2)
        System.out.println("35 is bigger than 7 in " + 35 / 7 + " times");
        System.out.println("8 is smaller than 48 in " + 48 / 8 + " times");
        System.out.println("54 is " + (54 - 6) + " bigger than 6");
        System.out.println("----------");


        subTask = 'a';

        System.out.println("Task " + ++number + subTask + ":"); //12a (part 2)
        System.out.println("48 is divisible by 8 because the remainder is equal to " + 48 % 8);
        System.out.println("----------");


        System.out.println("Task " + number + ++subTask + ":"); //12b (part 2)
        System.out.println("48 is the even number because it's divisible by 2, and the remainder is equal to " + 48 % 2);
        System.out.println("8 is the even number because it's divisible by 2, and the remainder is equal to " + 8 % 2);
        System.out.println("----------");


        System.out.println("Task " + number + ++subTask + ":"); //12c (part 2)
        System.out.println("47 is the odd number because it's not divisible by 2, and the remainder is equal to "
                + 47 % 2);
        System.out.println("49 is the odd number because it's not divisible by 2, and the remainder is equal to "
                + 47 % 2);
        System.out.println("----------");


        System.out.println("Task " + number + ++subTask + ":"); //12d (part 2)
        System.out.println("Among 48, 8, 47 and 49, only 49 is divisible by 7 because the remainder is equal to "
                + 49 % 7);
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //13 (part 2)

        int k = 5, l = 7 , m = 8;

        int oldK = k;
        oldK--;

        int oldL = l;
        oldL--;

        int oldM = m;
        oldM--;

        System.out.println("----------------------------------------------------------------------\n"
                + "|\t\t" + "| " + " +10 " + " | " + " -5 " + " | " + " *100 " + " | " + " /2 "
                + " | " + " %2 " + " | " + " ^2 " + " | " + " ?++ " + " | " + " ?-- " + " |\n"
                + "----------------------------------------------------------------------\n"
                + "| " + "k = " + k + " |  " + (k + 10) + "   |  " + (k - 5) + "   |  " + k * 100
                + "   |  " + k / 2 + "   |  " +  k % 2 + "   |  " + k * k++ + "  |  " + k + "    |  " + oldK + "\t |\n"
                + "----------------------------------------------------------------------\n"
                + "| " + "l = " + l + " |  " + (l + 10) + "   |  " + (l - 5) + "   |  " + l * 100
                + "   |  " + l / 2 + "   |  " +  l % 2 + "   |  " + l * l++ + "  |  " + l + "    |  " + oldL + "\t |\n"
                + "----------------------------------------------------------------------\n"
                + "| " + "m = " + m + " |  " + (m + 10) + "   |  " + (m - 5) + "   |  " + m * 100
                + "   |  " + m / 2 + "   |  " +  m % 2 + "   |  " + m * m++ + "  |  " + m + "    |  " + oldM + "\t |\n"
                + "----------------------------------------------------------------------");


        System.out.println("Task " + ++number + ":"); //14 (part 2) the reciprocal of the fraction

        x = 7;
        y = 18;
        int xn = x * x * x;
        int total = xn * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y));

        System.out.println("If\n" + "x = 7\n" + "y = 18\n" + "n = 3\nthen");
        System.out.println("xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) is equal to " + total);
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //15 (part 2)

        int days1 = 5, suites1 = 15, suites2 = 69;
        int dailyWork = suites1 / days1;
        int days2 = suites2 / dailyWork;

        System.out.println("It will take " + days2 + " days to sew " + suites2 + " suites" );
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //16 (part 3)

        int a = 11, b = 15, c = 21;
        int sum = a + b + c++; //47, c = 21, then becomes 22
        int sum2 = a + b + c--; //48, c = 22, then becomes 21
        int sumCBA = c + b + a; //47

        System.out.println(sum + sum2);
        System.out.println(b++ - sumCBA); //b = 15, then becomes 16
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //17 (part 3)

        x = 4;
        int result = (x + 3) * (x + 3);

        System.out.println("(x + 3) ^ 2 = " + result);
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //18 (part 3)

        int result1 = (3 + 4 * x) / 5;
        int result2 = (10 * (y - 5) * (a + b + c)) / x;
        int result3 = 9 * (4 / x + (9 + x) / y);

        System.out.println(result1 - result2 + result3);
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //19 (part 3) throws exception, to use a reciprocal of the fraction

        /*

        int d = 4;
        int result4 = (5 * x + 7 * y) / (8 * x + 10 * y);
        int result5 = (3 * x - y) / (x + y);
        int result6 = result4 / result5;
        int result7 = a + b + c / d + (a + b) / (c + d) + a * b;
        System.out.println(result6 / result7);

         */
        System.out.println("----------");


        System.out.println("Task " + ++number + ":"); //20 (part 3)

        int C = 35;
        int F = (C * 9 / 5) + 32;
        int K = C + 273;

        System.out.println(C + " degrees Celsius is equal to " + F + " degrees Fahrenheit");
        System.out.println(C + " degrees Celsius is equal to " + K + " degrees Kelvin");
        System.out.println("----------");

    }
}
