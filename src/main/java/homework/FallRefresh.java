package homework;

public class FallRefresh {

    public static void main(String[] args) {

        System.out.println("Task #1_1:");
        /*
        Написать программу, которая будет печатать/выводить следующий текст:
        3
        2
        1
        Поехали!!!
         */

        System.out.println("""
                            3
                            2
                            1
                            Go!
                            """);


        System.out.println("Task #1_2:");
        // Написать программу, которая будет печатать/выводить следующий текст:

        System.out.println("____888888______________________________\n" +
                "____888888______________________________\n" +
                "___8888888888___________________________\n" +
                "__888888888888__________________________\n" +
                "__8888111188888_________________________\n" +
                "_888881111188888___11___________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111118888_11____________________\n" +
                "_8888881111118888_11___11__8888888______\n" +
                "_8888881111118888__1__11__88888888888___\n" +
                "_8888888111111888____11__8888888888888__\n" +
                "__888888111111888_111___88888888888888__\n" +
                "__8888888111118881111__888881111118888__\n" +
                "___888888811188881111_8888811111111888__\n" +
                "____8888888188881111188888111111118888__\n" +
                "_____88888888888111118888111111118888___\n" +
                "______888888888111118888811111188888____\n" +
                "______8888888881111188888888888888______\n" +
                "_____888888888811111888888888888________\n" +
                "____88888888888111118888888888__________\n" +
                "___88881111888811111888888888___________\n" +
                "__8888111111888111118888888888__________\n" +
                "_888881111118881111188811118888_________\n" +
                "_8888881111888811111881111118888________\n" +
                "_8888888118888811111888111188888________\n" +
                "__888888888888_1111888881188888_________\n" +
                "___8888888888___111_8888888888__________\n" +
                "____88888888_____1___88888888___________\n" +
                "_____888888___________888888____________\n" +
                "_______________________8888_____________\n");


        System.out.println("Task #1_3:");
        // Вывести/напечатать смайлик, не :), а настоящий смайлик одним символом)

        System.out.println("""
                ( > ^ . ^ < )
                \t\t\t\tC( - ___ - C )
                ( 0 _._ 0 )""");
        System.out.println("\uD83D\uDE00\n");


        System.out.println("Task #2_1:");
        /*
        Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным
        на ваш выбор и вывести результаты следующих операций с этими переменными:
        сложение, умножение, вычитание, деление и остаток от деления.
        Также сделать проверку на четность этих переменных и вывести результат.
         */

        int a = 17;
        int b = 10;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;
        int odd = a % 2;
        int even = b % 2;

        System.out.println(STR."""
                            addition: \{addition}
                            subtraction: \{subtraction}
                            multiplication: \{multiplication}
                            division: \{division}
                            remainder: \{remainder}
                            a is an odd number, because the remainder is \{odd}
                            b is an even number, becasue the remainder is \{even}
                            """);

        System.out.println("Task #2_2:");
        /*
        Создать программу дележа добычи на пиратском корабле.
        По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
        остальное делится поровну между всеми членами команды, включая капитана.

        Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

        Вывести на экран кому сколько пиастров полагается.
        Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

        Дополнительное задание со звездочкой:
        Попробовать придумать как программа может проверить правильность дележа.
         */

        double trophy = 20000.0;
        int pirates = 11;
        // pirates quantity includes the shipowner and the captain

        double ownerShare = trophy / 2;
        double captainShare = (trophy - ownerShare) / 2;
        int crew = pirates - 1;
        // crew includes the captain, but not the shipowner
        double crewShare = (trophy - ownerShare - captainShare) / crew;
        double captainShareUpdated = captainShare + crewShare;

        System.out.println(STR."""
                            Shipowner gets $\{ownerShare}
                            Ship captain gets $\{captainShareUpdated}
                            Each crew member gets $\{crewShare}""");

        double shipOwnerIsAlsoTheCaptain = ownerShare + captainShareUpdated;
        System.out.println(STR."If the shipowner is also the captain, then his share will be $\{shipOwnerIsAlsoTheCaptain}");

        double shareCheck = ownerShare + captainShareUpdated + crewShare * (crew - 1);
        // crew - 1 is the crew without the captain because we've already calculated captainShareUpdated
        boolean check = (shareCheck == trophy);
        System.out.println(STR."Pirates check if all shares were calculated correctly: \{check}");


    }
}
