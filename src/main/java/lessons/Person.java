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
