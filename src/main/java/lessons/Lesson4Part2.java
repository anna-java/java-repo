package lessons;

public class Lesson4Part2 {

    static String task = "\nTask # ";
    static int number = 2;

    public static void printTask() {
        System.out.println(task + (number ++));
    }

    public static void printTask(String text, int num) {
        System.out.println(text + num);
        num ++;
    }

    public static void main(String[] args) {
        //Андрей старше Светы и Наташа старше Светы

        int ageA;
        int ageN;
        int ageS;

        // (ageA > ageS) && (ageN > ageS);

        int a = 0;
        int b = 7;

        System.out.println(5 > 7);
        System.out.println((a >= b) || (a < b));

        System.out.println(a != b);
        System.out.println(!(a == b));

//_________________________________________________________________________
//if-then
//        if () {
//
//        }

        // если а равно b, то сложить а и b

        if (a == b) {
            System.out.println(a + b);
        }


//_________________________________________________________________________
        //if-else

//        if () {
//
//        } else {
//
//        }

        // если а равно b, то сложить а и b,  а иначе вычесть из a  значение b

        if (a == b) {
            System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }


//_________________________________________________________________________
        //if - else if - else

//        if () {
//
//        } else  if () {
//
//        } else {
//
//        }

        // если а равно b, то сложить а и b,  если же a > b, то присвоить a  значение b,
        // а иначе вычесть из a  значение b

        if (a == b) {
            System.out.println(a + b);
        } else if (a > b) {
            a = b;
            System.out.println(a);
        } else {
            System.out.println(a - b);
        }
//_________________________________________________________________________

        //Если a > b или b < c, то присвоить a значание 7, и сложить  b и c,
        // иначе присвоить а значение 10
        a = 0;
        b = 77;
        int c = 25;

        if ((a > b) || (b < c)) {
            a = 7;
            int sum = b + c;
            System.out.println("a = " + a);
            System.out.println("sum = " + sum);
        } else {
            a = 10;
            System.out.println("a = " + a);
        }

//!!! Первый тест !!!

// Проверьте число n .
// Если число n нечетное и кратно трем, то присвойте n значение 0.
// Если число n нечетное и не кратно трем, то присвойте n значение 10.
// Если число n четное, и 100 делится на число n без остатка, то присвойте n значение 100

// Напишите тест, который проверит работу вашего кода и выведет
// на печать результат проверки.
// Тестовые данные 21, 43, 20

        int n = 20;

        if ((n % 2 != 0) && (n % 3 == 0)) {
            n = 0;
        } else if ((n % 2 != 0) && (n % 3 != 0)) {
            n = 10;
        } else if ((n % 2 == 0) && (100 % n == 0)) {
            n = 100;
        }

        //Test
        int expectedResult = 100;
        int actualResult = n;

        if (actualResult == expectedResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        Integer x = 12;
        Integer y = 20;

        System.out.println(x.equals(y));

        System.out.println(!(x.equals(y)));

        String hi1 = "Hi";
        String hi2 = "Hi";
        System.out.println(hi1.equals(hi2));


// AAA


//    Коды для печати текста разными цветами
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
    }
}

