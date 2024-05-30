package lessons;

public class Lesson4Part1 {

//    public static void methodName() {
//
//    }

//    public static void methodName(type argsName, type argsName) {
//
//    }

    static String line = "\t_____________________________________________________________________________________\n";
    static String vLine = "\t|\t";
    static String endLine = "\t|";
    static String tab = "\t";

    static String task = "\nTask # ";
    static int number = 2;

    public static void printTask() {
        System.out.println(task + (number ++));
    }

    public static void printTask(String text, int num) {
        System.out.println(text + num);
        num ++;
    }

    public static void printLine() {
        System.out.println("\t________________________________________________________________________________\n");
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printNumber(int a) {
        System.out.println(a);
    }

    public static void printNumberAndText(double number, String text) {
        System.out.println(line);
        System.out.print(number);
        System.out.println(" " + text);
    }

    public static void printAnything(Object obj) {
        System.out.println(obj);
    }

    public static void printHeader() {
        System.out.println(
                line
                        + vLine + tab
                        + vLine + "+10"
                        + vLine + "-5"
                        + vLine + "*100" + tab
                        + vLine + "/2"
                        + vLine + "%2"
                        + vLine + "^2"
                        + vLine + "++"
                        + vLine + "--"
                        + endLine
        );
    }

    public static void printRow(String varName, int varValue) {
        System.out.print(
                line
                        + vLine + varName + " = " + varValue
                        + vLine + (varValue + 10)
                        + vLine + (varValue - 5)
                        + vLine + (varValue * 100) + tab + " "
                        + vLine + (varValue / 2)
                        + vLine + (varValue % 2)
                        + vLine + (varValue * varValue++)
                        + vLine + (varValue--)
        );

        varValue--;

        System.out.println(vLine + varValue + endLine);
    }



    public static void main(String[] args) {



//        String hi = "Hello!";
//
//        printAnything("this is my object");
//        printNumberAndText(25.5, "- цена киллограмма яблок");
//        printLine();
//        print("3");
//        //print(3); - так сделать не возможно, тк метод print()  принимает аргументы типа String
//        printNumber(234);
//        print(line);
//        print("\t________________________________________________________________________________\n");
//        print("Task #");
//        print("book");
//        print(hi);
//        print(vLine);
//        print("Java");



        // __________________________________________________________________________________________
        //13, HW2
        int k = 25;
        int l = 10;
        int m = 15;
        int n = 3;

        printHeader();
        printRow("k", k);
        printRow("l", l);
        printRow("m", m);
        printRow("n", n);
        printLine();
    }

    {
        System.out.println(line);
    }
}


