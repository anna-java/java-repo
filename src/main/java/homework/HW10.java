/*
String format на английском
https://www.youtube.com/watch?v=moQ3Kr8ouiU
https://www.youtube.com/watch?v=avSRKltaIRU

String format и регулярные выражения на русском
https://www.youtube.com/watch?v=_pLpx6btq6U
https://www.youtube.com/watch?v=gDPfNJw2VQ8

1. Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
Test Data:
"1, 2, 3, 4, 5" → {1, 2, 3, 4, 5}
(Без форматирования и с форматированием)

2. Написать 4 алгоритма stringToLetters, stringToLettersAndSpaces, stringToNumbers, stringToNumbersAndSpaces следуя
примеру на сайте: https://allcalc.ru/node/2030
Каждый алгоритм принимает строку, и удаляет ненужные символы:
Без форматирования, пожалуйста!
Note - missing image

3. Write a method that returns string argument n times separated by comma, and number of characters in new string
“abc”, 5 → “abc,abc,abc,abc,abc”, 19

4. Find if the passed string is a natural number
“1” → true
“1.1” → false
“a” → false
"0123456789" → false

5. Write a method that takes a string and returns a string made of the last 3 characters and the first 3 characters
of the passed string. If the argument string is longer than 5 characters, the method returns a string containing
the first char repeated number of chars times

6. A method should return a string with a length of 10, on even indexes should be even digits (ascending order),
on odd indexes should be letters (ascending order)

7. Написать метод, который принимает строку и натуральное число, меньше 10, и возвращает порядковые номера (не индексы!)
цифр, совпадающих с числом-параметром.
“23, 45 2 1 567, а, 3 4 : 78”, 4 → 5, 22

8. Написать метод, который возвращает строку из букв, которые стоят на третьей, шестой, девятой, и так далее, позициях
(порядковые номера букв) в слове-параметре.

9. Написать метод, который в строке-параметре меняет каждый четный символ на ‘a’, если символ не равен ‘a’ и ‘b’;
или на ‘z’ в противном случае. Метод возвращает новое слово.

10. Написать метод, который генерирует валидный пароль, который соответствует правилам:
- длина пароля от 8 до 64 символов
- пароль должен состоять из букв, цифр и символов
- допускается использование символов  !@#$%&*
- в пароле должна быть как минимум одна заглавная буква, одна строчная буква, одна цифра и один символ
Придумать тест кейсы на проверку сгенерированного пароля на валидность. Написать тесты
 */


package homework;

import java.util.Arrays;

public class HW10 {

    static String line = "_________________________________________\n";
    static String line2 = "\t -- \t";
    static String text = "TC ";
    static int num = 1;
    static char letter = 'a';


    public static void printTCNumber() {
        System.out.print(line + text + num + line2);
        num++;
    }


    public static void printLetter() {
        System.out.print(line + text + num + letter + line2);
        letter++;
    }


    //1a with formatting
    public static void stringToNumbers(String text) {

        if (!text.isEmpty()) {
            System.out.printf("%s%n", text);
        } else {
            System.out.println("The string is empty");
        }
    }


    //1b with formatting
    public static void stringToNumbers2(String text) {

        char openingBracket = '{';
        char closingBracket = '}';

        if (!text.isEmpty()) {
            System.out.printf("%c%s%c%n", openingBracket, text, closingBracket);
        } else {
            System.out.println("The string is empty");
        }
    }


    //1c without formatting
    public static void stringToNumbers3(String text) {

        if (text.isEmpty()) {
            System.out.println("The string is empty");
        }
        String[] arrayText = new String[]{text.replaceAll("\\s", " ")};
        System.out.println(Arrays.toString(arrayText));
    }


    //2a
    public static void stringToLetters(String text) {

        if (text.isEmpty()) {
            System.out.println("The string is empty");
        }
        String newText = text.replaceAll("[\\d\\W]", "");
        // \\d - a digit (integer), \\W - a non-word character, [] matches conditions inside the brackets
        System.out.println(newText);
    }


    //2b
    public static void stringToLettersAndSpaces(String text) {

        if (text.isEmpty()) {
            System.out.println("The string is empty");
        }
        String newText = text.replaceAll("[\\d[^\\w\\s]]", "");
        System.out.println(newText);
    }


    //2c
    public static void stringToNumbers4(String text) {

        if (text.isEmpty()) {
            System.out.println("The string is empty");
        }
        String newText = text.replaceAll("\\D", "");
        // \\D - a non-digit character
        System.out.println(newText);
    }


    //2d
    public static void stringToNumbersAndSpaces(String text) {

        if (text.isEmpty()) {
            System.out.println("The string is empty");
        }
        String newText = text.replaceAll("[^\\d\\s]", "");
        System.out.println(newText);
    }


    //3
    public static void stringNTimesAndCountLength(String sentence, int n) {

        if (text.isEmpty()) {
            System.out.println("The string is empty");
        }
        char comma = ',';
        String space = " ";
        String newSentence = String.format("%s%c%s", sentence, comma, space).repeat(n - 1).concat(sentence);
        System.out.printf(newSentence + "%s" + newSentence.length(), space);
    }


    //4
    public static void checkIfANaturalNumber(String text) {

        if (text.isEmpty()) {
            System.out.println("The string is empty");
        }
        boolean result = text.matches("[1-9][0-9]*");
        System.out.println(result);
    }


    //5
    public static void manipulationsWithString(String text) {

        if (text.isEmpty()) {
            System.out.println("The string is empty");
        } else if (text.length() <= 5) {
            String first3Letters = text.substring(0, 3);
            String last3Letters = text.substring(text.length() - 3);

            System.out.println(first3Letters.concat(last3Letters));
        } else {
            text = text.trim().toLowerCase();
            char firstLetter = text.charAt(0);
            int count = 0;

            for (int i = 0; i < text.length(); i++) {

                if (text.charAt(i) == firstLetter) {
                    count++;
                }
            }
            System.out.println(String.valueOf(firstLetter).repeat(count));
        }
    }




    public static void main(String[] args) {

        //1a
        printLetter();

        String text = "1, 2, 3, 4, 5";

        stringToNumbers(text);


        //1b
        printLetter();

        text = "1, 2, 3, 4, 5";

        stringToNumbers2(text);


        //1c
        printLetter();

        text = "1, 2, 3, 4, 5";

        stringToNumbers3(text);


        //2a
        num++;
        letter = 'a';
        printLetter();

        text = "8Cx1*6.Q{DWu! ft}+8/T*N1 ggL18cc";

        stringToLetters(text);


        //2b
        printLetter();

        text = "LW.?bwdX6AZBw FwZtn0/G &bY.U*#[9";

        stringToLettersAndSpaces(text);


        //2c
        printLetter();

        text = "fz;-qL}D@+6#jSh KMe/+%6JK 3x+*SL";

        stringToNumbers4(text);


        //2c
        printLetter();

        text = ",-{#%(7+ 2n8Dib2Ufe_/tw5 C+7#mWz";

        stringToNumbersAndSpaces(text);


        //3
        num++;
        printTCNumber();

        String sentence = "abc";
        int n = 5;

        stringNTimesAndCountLength(sentence, n);
        System.out.println();


        //4
        letter = 'a';
        printLetter();

        text = "1";

        checkIfANaturalNumber(text);


        printLetter();

        text = "1.1";

        checkIfANaturalNumber(text);


        printLetter();

        text = "a";

        checkIfANaturalNumber(text);


        printLetter();

        text = "0123456789";

        checkIfANaturalNumber(text);


        //5
        letter = 'a';
        printLetter();

        text = "";

        manipulationsWithString(text);


        printLetter();

        text = "Anton";

        manipulationsWithString(text);


        printLetter();

        text = "Chupacabra";

        manipulationsWithString(text);


        printLetter();

        text = "Kate likes cakes";

        manipulationsWithString(text);








    }
}
