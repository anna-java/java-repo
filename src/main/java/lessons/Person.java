/*
HW1 Part 3
___________________________________________________
28. В классе Person создать переменную yob (year of birth), присвоить ей значение (любое, например, 1990) и вывести на печать сообщение:

“Если человек родился в 1990 году, то его возраст - разница между 2022 и 1990”.

Значение 1990 должно выводиться в виде переменной, вы не должны его печатать цифрами. Остальные слова вы должны распечатать в виде текста.

29. Присвойте новое значение переменной yob и выведите на печать фразу:
“Если человек родился в … году, то его возраст 2 года назад - разница между … и …”.
 */


package lessons;

public class Person {

    public static void main(String[] args) {

        int yob = 1988;
        int yob2 = 2024;
        int yob3 = 1990;
        int yob4 = yob2 - 2;

        System.out.println("If a person was born in " + yob + " year, his/her age is " + (yob2 - yob));
        System.out.println("If a person was born in " + yob3 + " year, his/her age two years ago was " + (yob4 - yob3));
    }
}
