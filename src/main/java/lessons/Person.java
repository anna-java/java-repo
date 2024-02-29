package lessons;

public class Person {

    public static void main(String[] args) {

        int yob = 1988;
        int yob2 = 2022;
        int yob3 = 1990;
        int yob4 = yob2 - 2;

        System.out.println("Если человек родился в " + yob + " году, то его возраст составляет " + (yob2 - yob));
        System.out.println("Если человек родился в " + yob3 + " году, то его возраст 2 года назад составлял " + (yob4 - yob3));

    }
}
