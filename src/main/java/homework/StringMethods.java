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

 */


package homework;

//1
public class StringMethods {

    public String removeSpaces(String text) {

        if (!(text.isEmpty())) {

            if (text.length() != 16) {
                return text.trim() + "; extra spaces are removed";
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


    public String removeAllSpaces(String text) {

        if (text.isEmpty()) {
            return "The string is empty";
        } else {
            String modifiedText = text.replace(" ", "");
            return modifiedText.trim();
        }
    }

}
