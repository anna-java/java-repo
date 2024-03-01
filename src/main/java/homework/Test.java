//To verify my test's outcome

package homework;

public class Test {

    static String line = "______________________\n";
    static String text = "TC#";
    public static int taskNum = 1;
    static String line2 = "\t -- \t";
    public static void printTaskNum() {
        System.out.print(line + text + taskNum + line2);
        taskNum++;
    }


    //Method 1
    public static String comparison(int a, int b) {

        if (a >= b) {
            return "Pass";
        } return "Fail";
    }


    //Method 2
    public static double calculation(double a, double b, double c) {

        if (a * b - c > 0) {
            return a * b - c;
        } return 0;
    }


    public static String verifyEquals2(double expectedResult, double actualResult) {

        if (expectedResult == actualResult) {
            return "Pass";
        } return "False";
    }


    public static void main(String[] args) {

        printTaskNum(); //1
        System.out.println("N/A");

        double a = 7, b = 2, c = 4;
        double expectedResult = 10.0;

        double actualResult = calculation(a, b, c);

        verifyEquals2(expectedResult, actualResult);


        printTaskNum(); //2
        System.out.println(verifyEquals2(expectedResult, actualResult));

    }
}