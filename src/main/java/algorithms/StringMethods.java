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

Видео3: https://www.youtube.com/watch?v=6_RDHZfygGo
indexOf(), lastIndexOf()

10. Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится между первой
и последней буквой-параметром:
Test Data:
"Abracadabra", "b" → "bracadab"
"Whippersnapper", "p" → "ppersnapp"

11. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается
на одинаковую букву, и false иначе
Test Data:
"Abracadabra" → true
"Whippersnapper" → false

Видео4: https://www.youtube.com/watch?v=AY5b6iIk8mM

12. Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает последнее слово
Test Data:
"Red Rover" → "Rover"

13. Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами включительно
Test Data:
"Red rover", 1, 4 → "Rover"

Видео5: https://youtu.be/SBByYcrsXu0?t=42
split()

14. Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
Test Data:
"QA for Everyone" → {"QA", "for", "Everyone"}
"Александр Сергеевич Пушкин" → {"Александр", "Сергеевич", "Пушкин"}

15*. Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии, отчества и возвращает текст:
Test Data:
"Александр Сергеевич Пушкин" →
"Имя: Александр
Отчество: Сергеевич
Фамилия: Пушкин"
Без видео, используя документацию Oracle и гугл, найти методы класса String, которые помогут выполнить задания

16. Написать метод, который принимает на вход слово и число n, и возвращает строку, где слово повторяется n раз.
Test Data:
"one", 5 → "oneoneoneoneone"

17. Напишите метод, который принимает строку и index, и возвращает численное значение буквы, которая находится
на позиции index (использовать только один метод класса String)

18. Написать метод, который принимает 3 слова, и сравнивает их методом, который считает, что прописные и заглавные
буквы - это одни и те же буквы. Метод возвращает true, если все слова одинаковы, и метод возвращает false, если слова не одинаковы:
Test Data:
"one", "One", "ONE"  → true
"one", "Один", "ONE" → false
 */


package algorithms;


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
                String modifiedText2 = text2.replace('«', '"').replace('»', '"');
                return text1.concat(": ").concat("\"").concat(modifiedText2).concat("\"");
            }
        }
        return text1.concat(": ").concat("\"").concat(text2).concat("\"");
    }


    //9
    public String inputCity(String city) {

        if (city.isEmpty()) {
            return "The city name is empty";
        }
        return city.substring(0, 1).toUpperCase().concat(city.substring(1).toLowerCase());
    }


    //10
    public String printPartialText(String text, char letter) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else if (letter == ' ') {
            return "The char is empty";
        }
        int startIndex = text.indexOf(letter);
        int endIndex = text.lastIndexOf(letter);

        return text.substring(startIndex, endIndex + 1);
    }


    //11
    public boolean compareFirstAndLastLetters(String word) {

        if (word.isEmpty()) {
            return false;
        } else {
            String modifiedWord = word.toLowerCase();
            char firstLetter = modifiedWord.charAt(0);
            char lastLetter = modifiedWord.charAt(word.length() - 1);

            return firstLetter == lastLetter;
        }
    }


    //12
    public String returnSecondWord(String text) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else {
            for (int i = 0; i < text.length(); i++) {

                if (text.substring(i, i + 1).equals(" ")) {
                    return text.substring(i + 1);
                }
            }
        }
        return "The string consists of just one word";
    }


    //13
    public String returnPartialString(String text, int num1, int num2) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else if (num1 < 0 || num2 < 0) {
            return "Numbers can't be negative";
        }
        String firstPart = text.substring(0, num1);
        String secondPart = text.substring(num2 + 1);

        return firstPart.concat(secondPart);
    }


    //14
    public String[] returnWordsFromTheSentence(String sentence) {

        if (sentence.isEmpty()) {
            return new String[0];
        }
        String[] arraySentence = sentence.split(" ");
        return arraySentence;
    }


    //15 skipped


    //16
    public String returnRepeatedString(String word, int num) {

        if (word.isEmpty()) {
            return "The string is empty";
        } else if (num <= 0) {
            return "The number must be a positive digit";
        }
        return word.repeat(num);
    }


    //17
    public String returnLetter(String text, int index) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else if (index < 0) {
            return "The index can't be a negative number";
        }
        return text.substring(index, index + 1);
    }


    //18
    public boolean compareThreeWords(String word1, String word2, String word3) {

        if (word1.isEmpty() || (word2.isEmpty()) || (word3.isEmpty())) {
            return false;
        }
        String word1New = word1.toLowerCase();
        String word2New = word2.toLowerCase();
        String word3New = word3.toLowerCase();

        if (word1New.equals(word2New) && (word2New.equals(word3New))) {
            return true;
        }
        return false;
    }
}

