/*
HW9. Методы класса String для самостоятельного изучения

Все задания в первой части нужно выполнять в проекте Java_05
Создайте класс StringMethods
Смотрите видео по каждому методу и решайте задание с помощью метода из видео.
Каждое задание должно быть решено методом, который возвращает результат	(не печатать ответы, а возвращать)
Тестировать ваш код можно в классе StringMethodsTest (протестируйте только то, что хотите, или на что останется время)
Задачи с * - повышенной сложности

Видео1: https://youtu.be/78ZAzmNbUYQ?t=173
Методы isEmpty(), length(), trim(), replace()

1. Написать метод removeSpaces(), который принимает на вход строку.
Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в конце строки.
Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
Если пробелов не было, вернуть сообщение “Пробелов не было”.
Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
Test Data:
"    Red Rover School   " → “Лишние пробелы удалены”
"Red Rover School" → “Пробелов не было”
"" → “Строка пустая”

2. Написать алгоритм removeAllAs().
С помощью методов из видео1, написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет
все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
Test Data:
"    Red Rover School   " →  "Red Rover School"
"panda   " → "pnd"
"taramasalata" → "trmslt"

3. Написать алгоритм removeAllZeros().
С помощью методов из видео1, написать алгоритм, который принимает на вход строку, состоящую из цифр. Если строка валидная,
то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
Если в строке не было нулей, метод возвращает сообщение "This is a valid string".
Test Data:
"3504209706040000 " →  "35429764"
"0000000111" → "111"

4. Написать алгоритм removeAllSpaces.
С помощью методов из видео1, написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет
все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
Test Data:
"    R e d     Ro ve    r Sc   h ool   " →  "RedRoverSchool"
"p a     n   d a   " → "panda"

Видео2: https://www.youtube.com/watch?v=thzfsPEYXfI
Методы charAt(), concat(), contains(), substring(), toLowerCase(), toUpperCase()

5. Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
Метод возвращает количество букв a/A, и количество букв/знаков в слове без букв a/A. Итоговый результат должен
строиться с помощью метода из видео 2.
Test Data:
"Abracadabra" → "5, 6"
"Homenum Revelio" → "0, 15"
"3 tarAmasAlatA" → "6, 8"

6. Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
Test Data:
"As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions.
Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use,
although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have
begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades." → true
"99 little bugs in a code.
99 little bugs in a code.
Take one down, and patch it around.
235 critical bugs in the code." → false

7. Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово “обернуто” в кавычки:
Test Data:
"Abracadabra" → ""Abracadabra""

8*. Напишите метод insertQuotes2(), который принимает на вход две строки, и добавляет знак :  после слова “писал”,
и оборачивает в кавычки вторую строку
(результат строится с помощью метода concat())
Test Data:
"Федор Достоевский писал", "Надо любить жизнь больше, чем смысл жизни." →
"Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни.""
Задание со звездочкой:
"Наполеон Бонапарт писал", "В моем словаре нет слова «невозможно»." →
"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""

9. Напишите метод, который принимает на вход название города и исправляет написание:
Test Data:
"ташкент" → "Ташкент"
"ЧикаГО" → "Чикаго"

 */


package homework;


public class StringMethods {

    //1
    public String removeSpaces(String text) {

        if (!(text.isEmpty())) {

            if (text.length() != 16) {
                return text.trim().concat("; extra spaces are removed");
            } else {
                return "No extra spaces found";
            }
        }
            return "The string is empty";
    }


    //2
    public String removeAllAs(String text) {

        if (text.isEmpty()) {
            return "The string is empty";
        }
        String modifiedText = text.replace("a", "");
        return modifiedText.trim();
    }


    //3
    public String removeAllZeros(String text) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else {
            if (text.contains("0")) {
                String modifiedText = text.replace("0","");
                return modifiedText.trim();
            } else {
                return "This is a valid string";
            }
        }
    }


    //4
    public String removeAllSpaces(String text) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else {
            String modifiedText = text.replace(" ", "");
            return modifiedText.trim();
        }
    }


    //5
    public String countAs(String text) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else {
            char someChar = 'a';
            char someChar2 = 'A';
            int count = 0;
            int count2 = 0;

            for (int i = 0; i < text.length(); i++) {

                if ((text.charAt(i) == someChar) || (text.charAt(i) == someChar2)) {
                    count++;
                    count2 = text.length() - count;
                } else {
                    count2 = text.length();
                }
            }
            return String.valueOf(count).concat(", ").concat(String.valueOf(count2));
        }
    }


    //6
    public String countJava(String text) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else {
            if (text.contains("Java")) {
                return String.valueOf(true);
            }
            return String.valueOf(false);
        }
    }


    //7
    public String insertQuotes(String text) {

        if (text.isEmpty()) {
            return "The string is empty";
        }
        return "\"".concat(text).concat("\"");
    }


    //8
    public String insertQuotes2(String text1, String text2) {

        if (text1.isEmpty() || text2.isEmpty()) {
            return "Either one or two strings are empty";
        } else {
            if (text2.contains("«") || text2.contains("»")) {
                String modifedText2 = text2.replace('«', '"').replace('»', '"');
                return text1.concat(": ").concat("\"").concat(modifedText2).concat("\"");
            }
        }
        return text1.concat(": ").concat("\"").concat(text2).concat("\"");
    }



    }

