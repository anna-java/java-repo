/*
Part 1
___________________________________________________

1. В пакете homework создать класс HW3, всю работу выполнять в этом классе.
Все задания из домашней работы, начиная с номера 2, должны быть распечатаны с номером задания:
Task 2
3
-5
b = 100
Если необходимо выбрать тип переменных:
выбираем тип данных с минимально достаточным диапазоном значений, если точность не важна
выбираем тот тип, который позволяет хранить максимально точное значение, если точность важна

2. Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.

3. Создать переменные s и t типа short, присвоить им значения с разницей 60000.

4. Создать переменную i типа int и присвоить ей минимально возможное значение этого типа. Затем присвоить максимально
возможное значение этого типа. Распечатать оба значения в виде таблицы:
int min
значение i
int max
значение i

5. Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
(можно ненастоящий номер телефона, например, 18009998877)

6. Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double и присвоить ей
значение 100.101101.
Распечатать результат в виде таблицы:
float f = 100.101101
значение f
double d = 100.101101
значение d
a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
Распечатать результаты.

8. Создать переменную float ff и присвоить ей значение выражения 10 / 3.

9. Создать переменную double dd и присвоить ей значение выражения 10 / 3.
Добиться максимальной точности значений вычислений и распечатать результаты.
Создать переменные типа Float:
floatSum
floatSub (substraction)
floatProduct
floatQuotient
floatRemainder
и  присвоить им значения, вычисленные с помощью переменных f и ff.

10. Создать переменные типа double:
doubleSum
doubleSub
doubleProduct
doubleQuotient
doubleRemainder
и присвоить им значения, вычисленные с помощью переменных d и dd.

11. Распечатать результаты вычислений заданий 8 - 10 в виде таблицы:
f = …
ff = …
d = …
dd = …
floatSum = …
floatSub = …
floatProduct = …
floatQuotient = …
floatRemainder = …
doubleSum = …
doubleSub = …
doubleProduct = …
doubleQuotient = …
doubleRemainder = …

12. Распечатать слова HELLO JAVA точками (чтобы получился рисунок точками)


Part 2
___________________________________________________

13. Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
t1 = 0;
t2 = 150;
t3 = -120;
t4 = - 505.505;
t5 = 100100;
t6 = 100010001000;
t7 = 2.66666666666666;
t8 = - 1000000.001;
t9 = 1010;
Распечатать значения всех переменных.

14. С помощью полей классов ссылочного типа распечатать таблицу:
Type
Size in bits
min
max
byte
8
-128
127
short
int
long
float
double

15. Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения, сравнить 2 переменные друг с другом с помощью метода .equals(). Вывести результат сравнения на печать в виде выражения:
“Если num1 равно num2, то результат сравнения методом .equals() = …”
Присвоить переменным разные значения, сравнить, и вывести результат на печать:
“Если num1 не равно num2, то результат сравнения методом .equals() = …”

16. Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
а) одинаковыми значениями
b) number1 < number2
c) number1 > number2
сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет - не equals() !), и вывести результаты сравнения на печать в виде выражений:
“Если number1 = number2, то результат сравнения методом … = …”
“Если number1 < number2, то результат сравнения методом … = …”
“Если number1 > number2, то результат сравнения методом … = …”

17. Создать переменную типа Float, присвоить ей значение 234.9999, распечатать значение переменной в int

18. С помощью метода sum() класса Double посчитать сумму двух переменных типа double.

19. С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.

20. Создать 2 переменные типа Short:
short1 = 12000
short2 = 12300
Распечатать фразу:
“12000 - 12300 = -300”
где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
Присвоить переменной short1 значение 12500, вывести фразу:
“12500 - 12300 = 200”
где значение 200 выведено с помощью метода класса Short, а не операцией вычисления

21. Создать переменные:
String str1 = "123.56";
String str2 = "123.55";
Double doub1 = 123.56;
Double doub2 = 123.55;
Распечатать результат doub1 - doub2
Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
Сравнить полученные результаты doub1 - doub2 и str1 - str2

22. Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
(значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение, затем минимальное значение.
Посчитать и распечатать среднее значение. Распечатать результат среднего значения температуры тела кота.


Part 3
__________________________________________________

23. Создать переменную n типа Number, присвоить ей максимально возможное значение.
Присвоить n значение 10, затем присвоить n значение 10.999999999
Распечатать результаты в виде выражения:
“Переменная n может принимать значения:
 n =  …
 n =  …
 n =  …
 Это возможно, потому что …”

24. Создать переменную Integer numberInteger = 100.
Доказать, что numberInteger имеет тип Integer,
а numberInteger.toString() имеет тип String.

25. Вывести на экран следующие выражения, используя для печати только переменные:
“50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
“100 meters = … miles,  100 miles = … meters”, где значения должны быть вычислены по формулам

26. На сайте погоды https://openweathermap.org/ найти в документации и распечатать, какие коды соответствуют следующим состояниям погоды:
… - thunderstorm with heavy rain
… - overcast clouds: 85-100%
… - Shower sleet
 */


package homework;

public class HW3 {

    public static void main(String[] args){

        int count = 1;
        String line = "----------";
        char letter = 'a';


        System.out.println("Task " + ++count); //Task 2

        byte a = 34;
        byte b = 88;

        System.out.println(line);


        System.out.println("Task " + ++count); //Task 3

        short s = -32500;
        short t = 27500;

        System.out.println(line);


        System.out.println("Task " + ++count); //Task 4

        int i = -2147483648;

        System.out.println("---------------------------------\n"
                + "|" + "\tint min\t" + "\t|\t" + i + "\t|");

        i = 2147483647;

        System.out.println("---------------------------------\n"
                + "|" + "\tint max\t" + "\t|\t" + i + "\t|");
        System.out.println("---------------------------------");


        System.out.println("Task " + ++count); //Task 5

        long phoneNumber = 13473690503L;

        System.out.println(line);


        System.out.println("Task " + ++count); //Task 6

        float f = 100.101101F;
        double d = 100.101101;

        System.out.println("-------------------------------------\n"
                + "|" + "\tfloat f = \t" + "\t|\t" + f + "\t|\n"
                + "-------------------------------------\n"
                + "|" + "\tdouble d = \t" + "\t|\t" + d + "\t|\n"
                + "-------------------------------------");


        char countLetter = 'a'; //Task 7a

        System.out.println("Task " + ++count + countLetter);

        double dd = 10.09999 + 20.099999;

        System.out.println(dd);
        System.out.println(line);


        System.out.println("Task " + count + ++countLetter); //Task 7b

        float ff = 10.09999F + 20.099999F;

        System.out.println(ff);
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 8

        ff = 10F / 3F;
        dd = 10D / 3D;

        System.out.println("ff = " + ff);
        System.out.println("dd = " + dd);
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 9

        float floatSum = f + ff;
        float floatSub = f - ff;
        float floatProduct = f * ff;
        float floatQuotient = f / ff;
        float floatRemainder = f % ff;

        System.out.println(line);


        System.out.println("Task " + ++count); //Task 10

        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;

        System.out.println(line);


        System.out.println("Task " + ++count); //Task 11

        String longLine = "---------------------------------------------------------------------------------------------------------";
        String verticalLine = "|";

        System.out.println(longLine + "\n" + verticalLine + "\t" + "f = " + f + "\t"
                + verticalLine + "\t" + "d = " + d + "\t"
                + verticalLine + "\t\t" + "ff = " + ff + "\t\t"
                + verticalLine + "\t\t" + "dd = " + dd + "\t\t" + verticalLine + "\n" + longLine + "\n"
                + verticalLine + "\t" + "floatSum = " + floatSum + "\t\t\t\t"
                + verticalLine + "\t\t" + "doubleSum = " + doubleSum + "\t\t\t\t\t\t\t" + verticalLine + "\n"
                + verticalLine + "\t" + "floatSub = " + floatSub + "\t\t\t\t\t"
                + verticalLine + "\t\t" + "doubleSub = " + doubleSub + "\t\t\t\t\t\t\t" + verticalLine + "\n"
                + verticalLine + "\t" + "floatProduct = " + floatProduct + "\t\t\t"
                + verticalLine + "\t\t" + "doubleProduct = " + doubleProduct + "\t\t\t\t\t\t" + verticalLine + "\n"
                + verticalLine + "\t" + "floatQuotient = " + floatQuotient + "\t\t\t"
                + verticalLine + "\t\t" + "doubleQuotient = " + doubleQuotient + "\t\t\t\t\t\t\t\t" + verticalLine + "\n"
                + verticalLine + "\t" + "floatRemainder = " + floatRemainder + "\t\t\t"
                + verticalLine + "\t\t" + "doubleRemainder = " + doubleRemainder + "\t\t\t\t\t" + verticalLine + "\n"
                + longLine);


        System.out.println("Task " + ++count); //Task 12
        System.out.println("*\t" + "*\t" + "*****\t" + "*\t\t" + "*\t" + "\t  *  "  // 1 Hello
                + "\t\t\t*****\t" + " *\t\t" + "*\t" + "*\t" + "  *\t" + "\t\t*\n"  // 1 Java
                + "*\t" + "*\t" + "*\t\t" + "*\t\t" + "*\t\t" + "*\t" + "*\t"       // 2 Hello
                + "\t\t  *\t" + "   *" + "   *\t" + "*\t" + "*\t" + "*   *\t\t*\n"  // 2 Java
                + "****" + "*\t" + "*****\t" + "*\t\t" + "*\t\t" + "*\t" + "*\t"    // 3 Hello
                + "\t\t  *\t" + "   *****\t" + "*\t" + "*\t" + "*****\t\t*\n"       // 3 Java
                + "*\t" + "*\t" + "*\t\t" + "*\t\t" + "*\t\t" + "*\t" + "*\t"       // 4 Hello
                + "\t  *\t  *\t" + "   *" + "   *\t" + "*\t" + "*\t" + "*   *\n"    // 4 Java
                + "*\t" + "*\t" + "*****\t" + "*****\t" + "*****\t" + "  *\t"       // 5 Hello
                + "\t\t  *****\t" + "   *" + "   *\t" + "  *\t" + "\t*   *\t\t*");  // 5 Java

        System.out.println(line);


        System.out.println("Task " + ++count); //Task 13

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Float t7 = 2.66666666666666F;
        Double t8 = -1000000.001;
        Short t9 = 1010;

        System.out.println(t1 + ", " + t2 + ", " + t3 + ", " + t4 + ", " + t5 + ", " + t6 + ", " + t7 + ", "
                + t8 + ", " + t9);
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 14 (Skipped because it's just another table)
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 15

        Integer num1 = new Integer(25);
        Integer num2 = new Integer(25);
        boolean comparison = num1.equals(num2);

        System.out.println("Если num1 равно num2, то результат сравнения методом .equals() = " + comparison);

        num1 = 30;
        num2 = 40;
        boolean comparison2 = num1.equals(num2);

        System.out.println("Если num1 не равно num2, то результат сравнения методом .equals() = " + comparison2);
        System.out.println(line);


        System.out.println("Task " + ++count + letter); //Task 16a, should've used Integer.compare(number1, number2)

        int number1 = 20;
        int number2 = number1;
        //boolean comparison3 = (number1 == number2);

        System.out.println("Если number1 = number2, то результат сравнения методом equal to = " + Integer.compare(number1, number2));
        System.out.println(line);


        System.out.println("Task " + count + ++letter); //Task 16b

        number1 = 35; number2 = 65;
        //boolean comparison4 = (number1 < number2);

        System.out.println("Если number1 < number2, то результат сравнения методом less than = " + Integer.compare(number1, number2));
        System.out.println(line);


        System.out.println("Task " + count + ++letter); //Task 16c

        letter = 'a';
        number1 = 80;
        //boolean comparison5 = (number1 > number2);

        System.out.println("Если number1 > number2, то результат сравнения методом more than = " + Integer.compare(number1, number2));
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 17

        Float num = new Float(234.9999F);

        System.out.println(num.intValue());
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 18

        double x = 36.6;
        double y = 63.4;

        System.out.println(Double.sum(x, y));
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 19

        Float m = new Float(136.6F);
        Float n = new Float(163.4F);

        System.out.println(Integer.sum(m.intValue(), n.intValue()));
        System.out.println(line);


        System.out.println("Task " + ++count + letter); //Task 20a, could've used Short.compareUnsigned(short1, short2);

        Short short1 = new Short("12000");
        Short short2 = new Short("12300");

        System.out.println(short1 + " - " + short2 + " = " + short1.compareTo(short2));
        System.out.println(line);


        System.out.println("Task " + count + ++letter); //Task 20b

        short1 = 12500;

        System.out.println(short1 + " - " + short2 + " = " + short1.compareTo(short2));
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 21

        String str1 = new String("123.56");
        String str2 = new String("123.55");
        Double doub1 = new Double(123.56);
        Double doub2 = new Double(123.55);

        Double subDoub = (doub1 - doub2);
        Double subStr = (Double.valueOf(str1) - Double.valueOf(str2));

        System.out.println(subDoub);
        System.out.println(subStr);
        System.out.println(Double.compare(subDoub, subStr));
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 22, could've used just one variable

        Float maxTemperature = new Float("104.0F");
        Float minTemperature = new Float("99.0F");
        Float averageTemperature = (maxTemperature - minTemperature) / 2 + minTemperature;

        System.out.println(averageTemperature);
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 23

        Long wLong = new Long(9223372036854775807L);
        Integer wInt = new Integer(10);
        Double wDouble = new Double("10.999999999");

        System.out.println("Переменная w может принимать значения: \n"
                + "w = " + wLong + '\n'
                + "w = " + wInt + '\n'
                + "w = " + wDouble + '\n');
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 24

        Integer numberInteger = new Integer(100);

        System.out.println(numberInteger.getClass());
        System.out.println(numberInteger.toString().getClass());
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 25

        double kgTolbs = 2.205;
        float milesTometers = 1609.0F;

        System.out.println("50 kg = " + 50 * kgTolbs + " lbs, 50 lbs = " + 50 / kgTolbs + " kg");
        System.out.println("100 meters = " + 100 / milesTometers + " miles, 100 miles = " + 100 * milesTometers
                + " meters");
        System.out.println(line);


        System.out.println("Task " + ++count); //Task 26
        //thunderstorm with heavy rain
        System.out.println("\"weather\": [\n"
                + "        {\n"
                + "            \"id\": 202,\n"
                + "            \"main\": \"Rain\",\n"
                + "            \"description\": \"light rain\",\n"
                + "            \"icon\": \"11d\"\n"
                + "        }\n"
                + "    ],");
        //Overcast clouds: 85-100%, 04n as well
        System.out.println("\"weather\": [\n"
                + "        {\n"
                + "            \"id\": 804,\n"
                + "            \"main\": \"Rain\",\n"
                + "            \"description\": \"light rain\",\n"
                + "            \"icon\": \"04d\"\n"
                + "        }\n"
                + "    ],");
        //Shower sleet
        System.out.println("\"weather\": [\n"
                + "        {\n"
                + "            \"id\": 613,\n"
                + "            \"main\": \"Rain\",\n"
                + "            \"description\": \"light rain\",\n"
                + "            \"icon\": \"13d\"\n"
                + "        }\n"
                + "    ]");
    }
}
