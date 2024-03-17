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


Part 2
Ожидается, что вы выполните часть заданий самостоятельно, а по остальным заданиям у вас будут вопросы, вы их погуглите,
обсудите с другими студентами и найдете решение.
___________________________________________________

11. Рассчитать с помощью математических операторов и вывести на печать задачи и ответы:

12. Объяснить:
	a. почему число 48 кратно 8
b. что оба числа - четные.
c. что числа 47 и 49 - нечетные.
d. только одно из всех чисел кратно 7

13. Распечатать следующую таблицу,  где результат рассчитывается с помощью применения арифметических и унарных операторов:
+10
-5
*100
/2
%2
^2
++
- -
k = 5
15
25
6
l = …
m = …
* Для примера выведены некоторые результаты вычислений для  переменной k = 5

14.  Вычислить результат:
xⁿ ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))
если
x = 7
y = 18
n = 3
Распечатать результат в следующем виде:
If
x = 7
y = 18
n = 3
then
xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = …
* if else здесь не нужны!

15. Записать условие задачи в виде формулы и вычислить ответ:
note - missing image


Part 3
Ожидается, что если вы выполнили части 1 и 2, то вы, как минимум, подумаете над заданиями в Части 3. Возможно,
вам нужно будет нагуглить то, что мы на уроке не проходили. Часто нужно будет проявить смекалку.
Формат выполнения Части 3 -  вольный, если не оговорены специальные условия.
___________________________________________________

16. Декларировать и инициализировать переменные a, b, c. Распечатать выражение и результаты вычислений:
Сумма чисел a, b, c++ и sumABC-- = …, а разность b++ и  sumCBA = …
Вычислить выражения, если d = 4:

17. Note - missing image

18. Note - missing image

19. Note - missing image

20. Ввести в программу формулу конвертации температур C° -> F°. Найти на сайте https://openweathermap.org/ температуру
в любом городе, и проверьте, соответствует ли температура в С и F вашим расчетным значениям (использовать только int)
* Кто хочет - проверьте погоду в K (кельвинах) и ее соответствие с расчетным значением
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
