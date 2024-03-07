package homework;

import java.text.DecimalFormat;

public class HW6 {

    static String line = "__________________________________________________________\n";
    static String text = "TC ";
    static int num = 1;
    static DecimalFormat df = new DecimalFormat("0.0");
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";


    public static void printTaskNum() {
        System.out.println(line + text + num);
        num++;
    }


    //Method 10
    public static void method10(double start, double end, double step) {
        if (step != 0) {
            if (start <= end && step > 0) {
                for (double i = start; i <= end; i += step) {
                    System.out.print(i + " ");
                }
            } else if (start >= end && step < 0) {
                for (double i = start; i >= end; i += step) {
                    System.out.print(i + " ");
                }
            }
        }
    }


    //Method 11
    public static void method11(char m, char n) {
        if ((m >= 97 && m <= 122) && (n >= 97 && n <= 122) || (m >= 65 && m <= 90) && (n >= 65 && n <= 90)) {
            //refer to ASCII character table range for lowercase and uppercase letters
            if (m <= n) {
                for (char i = m; i <= n; i++) {
                    System.out.print(i + " ");
                }
            } else {
                for (char i = m; i >= n; i--) {
                    System.out.print(i + " ");
                }
            }
        }
    }


    //Method 12
    public static void method12(int l) {
        if (l > 0) {
            for (int i = 0; l > 0; i += 2, l--) {
                System.out.print(i + " ");
            }
        } else {
                System.out.println("Error - sequence can't be a negative number");
            }
        }


    public static void method13(int n) {
        for (int i = 1; i < n + 1; i++) {
            System.out.print((int) (Math.pow(2, i)) + " ");
        }
    }


    public static void method14() {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(String.valueOf(j).repeat(i));
            }
        }
    }


    public static String method15(int n) {

        String result = "0";

        for (int i = 1; i < n + 1; i++) {
            result = result + ", " + i + ", " + (-i);
        }
        System.out.println(result);
        return result;
    }


    public static String verifyEquals15(String expectedResult15, String actualResult15) {
        if (expectedResult15.equals(actualResult15)) {
            return "Pass";
        }
            return "Fail";
    }


    public static void method17(int n, int m, int l) {

        int count = 0;

        if ((n + m) % 2 != 0 && l > 0) {
            for (int i = n; count < l; i += m) {
                if (i % 2 != 0) {
                    count++;
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.print("n + m" + " is not an odd number");
        }
    }


    //Method 18
    public static int countRandom(int n, int m) {
        int num = (int)((Math.random() * (m - n + 1) + n));
        return num;
    }


    public static void method18(int n, int m, int l) {

        if (l > 0) {
            for (int i = l; i > 0; i--) {
                System.out.print(countRandom(n, m) + " ");
            }
        }
    }


    public static void method19(int n, int l) {

        if (n > 1) {
            for (int i = n; l > 0; i++, l--) {
                double y = Math.ceil((Math.pow(i, 2) + 1) / (2 * n - 1) * 100) / 100;
                System.out.print(y + " ");
            }
        } else {
            System.out.println(0);
        }
    }


    public static void method20(int l, int n) {

        double y1 = 1;
        //System.out.print(y1 + " ");

        double y2 = 2;
        //System.out.print(y2 + " ");

        double yn = 0;
        for (int i = 1; i < l + n; i++) {
            yn = 2 * y2 + y1;
            System.out.print(yn + " ");
            y1 = y2;
            y2 = yn;
        }
    }


    public static void method21() {

        for (int i = 10; i < 100; i++) {
            if (Math.abs((i / 10) - (i % 10)) <= 3) {
                System.out.print(i + " ");
            }
        }
    }


    public static void method22(double x) {
        if (x > 1.5) {
            System.out.print("y = " + (2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30));
        } else if (x >= 0) {
            System.out.print("y = " + (x + 1));
        } else {
            System.out.print("y = " + x);
        }
    }


    public static void method23(int limit) {

        for (int i = 2; i < limit + 1; i++) {

            int count = 0;

            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }


    //The code for #24 needs to be revised since it doesn't always work as intended
    public static String returnDayOfTheWeek(int number) {
        if (number > 0 && number < 8) {
            if (number == 1) {
                return "Mon";
            } else if (number == 2) {
                return "Tue";
            } else if (number == 3) {
                return "Wed";
            } else if (number == 4) {
                return "Thu";
            } else if (number == 5) {
                return "Fri";
            } else if (number == 6) {
                return "Sat";
            } else if (number == 7) {
                return "Sun";
            }
        }
        return "Enter the correct day";
    }


    public static int returnDayOfTheWeek(String day) {
        if (day.equals("Mon")) {
            return 1;
        } else if (day.equals("Tue")) {
            return 2;
        } else if (day.equals("Wed")) {
            return 3;
        } else if (day.equals("Thu")) {
            return 4;
        } else if (day.equals("Fri")) {
            return 5;
        } else if (day.equals("Sat")) {
            return 6;
        } else if (day.equals("Sun")) {
            return 7;
        }
        return 0;
    }


    public static String returnMonth(int month) {
        if (month == 1) {
            return "Jan";
        } else if (month == 2) {
            return "Feb";
        } else if (month == 3) {
            return "Mar";
        } else if (month == 4) {
            return "Apr";
        } else if (month == 5) {
            return "May";
        } else if (month == 6) {
            return "Jun";
        } else if (month == 7) {
            return "Jul";
        } else if (month == 8) {
            return "Aug";
        } else if (month == 9) {
            return "Sep";
        } else if (month == 10) {
            return "Oct";
        } else if (month == 11) {
            return "Nov";
        } else if (month == 12) {
            return "Dec";
        }
        return "Enter the correct month";
    }


    public static int returnDate(int date) {
        if (date > 0 && date < 32) {
            return date;
        }
        return 0;
    }


    public static void method24(String day, int month, int date) {

        int l = 8;

        if (returnDayOfTheWeek(day) == 0 || returnMonth(month).equals("Error") || month <= 0 || date <= 0) {
            System.out.println("Please enter the correct date");
        } else if (month <= 7 && month % 2 == 1 && date > 31) {
            System.out.println("Please enter the correct date");
        } else if (month >= 8 && month <= 12 && month % 2 == 0 && date > 31) {
            System.out.println("Please enter the correct date");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
            System.out.println("Please enter the correct date");
        } else if (month == 2 && date > 28) {
            System.out.println("Please enter the correct date");
        } else {
            for (int i = returnDayOfTheWeek(day); i <= 7 && l > 0; i++, date++, l--) {
                if (i != 7) {
                    if ((month <= 7 && month % 2 != 0 && returnDate(date) >= 32)
                        || ((month == 9 || month == 11) && returnDate(date) >= 31)
                        || ((month == 4 || month == 6) && returnDate(date) >= 31)
                        || ((month >= 8 || month <= 12) && month % 2 == 0 && returnDate(date) >= 32)
                        || (month == 2 && returnDate(date) >= 29)) {

                        date = 1;
                        month += 1;
                    }

                    System.out.println(returnDayOfTheWeek(i) + ", " + returnMonth(month) + " " + returnDate(date));
                } else {
                    System.out.println(returnDayOfTheWeek(i) + ", " + returnMonth(month) + " " + returnDate(date));
                    i = 0;
                }
            }

        }
    }


    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }


    public static void main(String[] args) {

        printTaskNum(); //1

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();


        printTaskNum(); //2

        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();


        printTaskNum(); //3

        for (int i = 50; i < 56; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();


        printTaskNum(); //4

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //2nd solution
        /*
        int beginning = 326;
        int end = 300 + 1;
        int start = beginning - beginning % 7;

        for (int k = start; k >= end; k -= 7) {
            System.out.println(k);
        }
        */


        printTaskNum(); //5

        for (double i = 12.0; i <= 13.0; i += 0.1) {
            System.out.print(df.format(i) + " ");
        }

        System.out.println();


        printTaskNum(); //6

        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        //2nd solution
        /*
        int num1 = 215;
        int num2 = 238 - 1;
        int start = num1 + num2 % 2;

        for (int l = start; l <= num2; l += 2) {
            System.out.println(l);
        }
        */


        printTaskNum(); //7

        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }


        //2nd solution
        /*
        int num1 = 7 + 1;
        int num2 = 14 - 1;
        int start = num1 + num2 % 7;

        for (int m = start; m <= num2; m += 7) {
            System.out.println(m);
        }
        */


        printTaskNum(); //8

        for (int i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        //2nd solution
        /*
        int num1 = Short.MIN_VALUE;
        int num2 = Short.MAX_VALUE;
        int start = num1 - num1 % 15001;

        for (int n = start; n <= num2; n += 15001) {
            System.out.println(n);
        }
        */

        printTaskNum(); //9

        for (int i = -10; i < 35; i++) {
            if (i % 11 == 0 && i != 0) {
                System.out.print(ANSI_BLUE + i + ANSI_RESET + " ");
            } else if (i % 12 == 0 && i != 0) {
                System.out.print(ANSI_RED + i + ANSI_RESET + " ");
            } else if (i == 0) {
                System.out.print("ZERO" + " ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();


        printTaskNum(); //10

        //loop10(1, 10, 2);
        method10(10.0, 1.0, -1);
        System.out.println();


        printTaskNum(); //11

        method11('Z', 'A');
        System.out.println();


        printTaskNum(); //12

        method12(5);
        System.out.println();


        printTaskNum(); //13

        method13(4);
        System.out.println();


        printTaskNum(); //14

        method14();
        System.out.println();


        printTaskNum(); //15

        int n = 5;
        String expectedResult15 = "0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5";

        String actualResult15 = method15(n);

        verifyEquals15(expectedResult15, actualResult15);

        printTestResult(verifyEquals15(expectedResult15, actualResult15));


        printTaskNum(); //16

        System.out.print("0");

        for (int i = 1; i < 25 + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(", " + i);
            } else if (i % 3 == 0) {
                System.out.print(", " + i);
            } else if (i % 5 == 0) {
                System.out.print(", " + i);
            }
        }

        System.out.println();


        printTaskNum(); //17

        method17(0, 5, 5);
        System.out.println();


        printTaskNum(); //18

        method18(2, 10, 5);
        System.out.println();


        printTaskNum(); //19

        method19(8, 5);
        System.out.println();


        printTaskNum(); //20

        method20(6, 1);
        System.out.println();


        printTaskNum(); //21

        method21();
        System.out.println();


        printTaskNum(); //22

        method22(0.5);
        System.out.println();


        printTaskNum(); //23

        method23(200);
        System.out.println();


        printTaskNum(); //24

        /*method24("Sun", 10, 28);
        System.out.println("\nError in the month");

        method24("Sun", 14, 2);
        System.out.println("\nError in the day");*/

        method24("Sat", 7, 22);

        method24("Jan", 1, 11);

    }
}
