package homework;

//import java.text.DecimalFormat;

public class HW5 {
    static String line = "_________________________________________\n";
    static String line2 = "\t -- \t";
    static String text = "TC ";
    static int num = 1;
    static char letter = 'a';

    //static DecimalFormat df = new DecimalFormat("0.00");


    public static void printTCNumber() {
        System.out.print(line + text + num + line2);
        num++;
    }


    public static void printLetter() {
        System.out.print(line + text + num + letter + line2);
        letter++;
    }


    //Method 1
    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            return "Pass";
        }
            return "Fail";
        }


    public static String verifyEquals1(String expectedResult1, String actualResult1) {
        if (expectedResult1.equals(actualResult1)) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 2
    public static String dayOfWeek(int number) {
        if (number > 0 && number < 8) {
            if (number == 1) {
                return "Monday";
            } else if (number == 2) {
                return "Tuesday";
            } else if (number == 3) {
                return "Wednesday";
            } else if (number == 4) {
                return "Thursday";
            } else if (number == 5) {
                return "Friday";
            } else if (number == 6) {
                return "Saturday";
            } else if (number == 7) {
                return "Sunday";
            }
                return "Error";
            }
        return "Error";
    }


    public static String verifyEquals2(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 3a
    public static int averageAge(int age1, int age2, int age3) {
        if (age1 > 0 && age1 <= 150 && age2 > 0 && age2 <= 150 && age3 > 0 && age3 <= 150) {
            return (int) Math.floor((age1 + age2 + age3) / 3);
        }
            return Integer.MIN_VALUE;
        }


    public static String verifyEquals3(int expectedResult3, int actualResult3) {
        if (expectedResult3 == actualResult3) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 4a
    public static int findMinOutOf2(int k, int l) {
        return Math.min(k, l);
    }


    public static String verifyEquals4a(int expectedResult4a, int actualResult4a) {
        if (expectedResult4a == actualResult4a) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 4b
    public static int findMinOutOf3(int k, int l, int m) {
        return Math.min(k, Math.min(l, m));
    }


    public static String verifyEquals4b(int expectedResult4b, int actualResult4b) {
        if (expectedResult4b == actualResult4b) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 4c
    public static int findMinOutOf4(int k, int l, int m, int n) {
        return Math.min(k, findMinOutOf3(k, l, m));
    }


    public static String verifyEquals4c(int expectedResult4c, int actualResult4c) {
        if (expectedResult4c == actualResult4c) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 5
    public static double averageTemp(double t1, double t2, double t3, double t4, double t5) {
        if (t1 < 25 || t1 > 45 || t2 < 25 || t2 > 45 || t3 < 25 || t3 > 45 || t4 < 25 || t4 > 45 | t5 < 25 || t5 > 45) {
            return -1;
        }
            return (t1 + t2 + t3 + t4 + t5) / 5;
        }


    public static String verifyEquals5(double expectedResult5, double actualResult5) {
        if (expectedResult5 == actualResult5) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 6
    public static int monthlySalary(int dailyHours, double hrRate, int daysInMonth) {
        if (hrRate >= 12.0 || dailyHours > 0 || dailyHours < 24 || daysInMonth > 0 || daysInMonth < 31) {
            return (int) (dailyHours * hrRate * daysInMonth);
        }
            return -1;
        }


    public static String verifyEquals6(int expectedResult6, int actualResult6) {
        if (expectedResult6 == actualResult6) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 7
    public static double purchaseCost(double price, int amount) {
        if (price > 0 || amount > 0) {
            return price * amount;
        }
            return -1;
        }


    public static String verifyEquals7(double expectedResult7, double actualResult7) {
        if (expectedResult7 == actualResult7) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 8
    public static String paidSalary(String firstName, String lastName, double salary) {
        double cents = (salary - (int) salary) * 100;

        if (firstName.equals("") || (lastName.equals("")) || (firstName == null) || (lastName == null) || (salary <= 0)) {
            return "";
        } else if (cents > 9) {
            return firstName + " " + lastName + "\t\t" + (int) salary + " dollars "
                    + (int) ((salary - (int) salary) * 100) + " cent(s)";
        }
        return firstName + " " + lastName + "\t\t" + (int) salary + " dollars 0"
                + (int) ((salary - (int) salary) * 100) + " cent(s)";
    }


    public static String verifyEquals8(String expectedResult8, String actualResult8) {
        if (expectedResult8.equals(actualResult8)) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 9
    public static void paidSalary2(String firstName, String lastName, double salary) {
        if (firstName.equals("") || firstName == null || salary <= 0) {
            System.out.println("");
        } else if (lastName.equals("") || lastName == null || salary <= 0) {
            System.out.println("");
        }
            System.out.println(paidSalary(firstName, lastName, salary));
        }


    //Method 10
    public static String xFlow(int x) {
        if (x < 0) {
            return "x is negative";
        } else if (x > 0) {
            return "x is positive";
        }
            return "x is zero";
        }


    public static String verifyEquals10(String expectedResult10, String actualResult10) {
        if (expectedResult10.equals(actualResult10)) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 11
    public static String doubleNumberToString(double doubleNumber) {
        double centsLeft = doubleNumber % Math.floor(doubleNumber) * 100;

        if (centsLeft > 9) {
            return (int) Math.floor(doubleNumber) + " dollar(s) " + (int) Math.round(centsLeft) + " cent(s)";
        }
            return (int) Math.floor(doubleNumber) + " dollar(s) 0" + (int) Math.round(centsLeft) + " cent(s)";
        }


    public static String verifyEquals11(String expectedResult11, String actualResult11) {
        if (expectedResult11.equals(actualResult11)) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 12
    public static String doubleToString2(double doubleNumber) {
        return (int) Math.floor(doubleNumber) + " kg "
                + Math.round(doubleNumber % Math.floor(doubleNumber) * 1000) + " g";
    }


    public static String verifyEquals12(String expectedResult12, String actualResult12) {
        if (expectedResult12.equals(actualResult12)) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 13
    public static void storeReceipt(String groceryItem, double itemPrice, double itemWeight) {

        String newItemPrice = "Price per 1 kg\t\t"
                + (int) Math.floor(itemPrice) + " dollar(s) "
                + (int) (itemPrice % Math.floor(itemPrice) * 100) + " cent(s)";

        String newItemWeight = "Weight\t\t\t\t"
                + (int) Math.floor(itemWeight) + " kg "
                + Math.round(itemWeight % Math.floor(itemWeight) * 1000) + " g";

        double itemTotal = itemPrice * itemWeight;

        String itemTotalStr = "Total cost\t\t\t"
                + (int) Math.floor(itemTotal) + " dollar(s) "
                + (int) (itemTotal % Math.floor(itemTotal) * 100) + " cent(s)";

        System.out.println("\n" + groceryItem + "\n"
                + newItemPrice + "\n"
                + newItemWeight + "\n"
                + line + itemTotalStr);
    }


    //Method 14
    public static int luckyNumber(int yearOfBirth) {
        int digit1 = yearOfBirth  / 1000;
        int digit2 = yearOfBirth % 1000 / 100;
        int digit3 = (yearOfBirth % 1000 - 100 * digit2) % 10;
        int digit4 = yearOfBirth % 1000 - 100 * digit2 - 10 * digit3;

        int sumDigit = digit1 + digit2 + digit3 + digit4;

        int digit5 = sumDigit / 10;
        int digit6 = sumDigit - 10 * digit5;

        int expectedResult14 = digit5 + digit6;

        if (expectedResult14 <= 9) {
            return expectedResult14;
        }
            int digit7 = expectedResult14 / 10;
            int digit8 = expectedResult14 - 10 * digit7;
            expectedResult14 = digit7 + digit8;
            return expectedResult14;
        }


    public static String verifyEquals14(int expectedResult14, int actualResult14) {
        if (expectedResult14 == actualResult14) {
            return "Pass";
        }
            return "Fail";
        }


    //Method 15
      public static String averageMinusMedian(int a, int b, int c) {

        int median = 0;

          if (a > b && a > c) {
              if (b > c) {
                  median = b;
              } else {
                  median = c;
              }
          } else if (a > b && a < c) {
              median = a;
          } else if (a < b && a < c) {
              if (b < c) {
                  median = b;
              } else {
                  median = c;
              }
          } else {
              median = a;
          }

          int averageValue = (a + b + c) / 3;
          int remainder = averageValue - median;

          if (remainder > 2) {
              return "The average value is bigger than the median for " + remainder;
          }
              return "The average value = " + averageValue + ", the median = " + median;
          }


    public static String verifyEquals15(String expectedResult15, String actualResult15) {

        if (expectedResult15.equals(actualResult15)) {
            return "Pass";
        }
            return "Fail";
        }


    //printing all tests' results
    public static void printTestResult(String value) {
        System.out.print(value);
        System.out.println();
    }


    //main method
    public static void main(String[] args) {


        //TC 1
        printTCNumber();
        System.out.println("Test");


        //TC 2
        int number = 5;
        String expectedResult = "Friday";

        String actualResult = dayOfWeek(number);

        verifyEquals2(expectedResult, actualResult);

        printTCNumber();
        printTestResult(verifyEquals2(expectedResult, actualResult));


        //TC 3a
        int age1 = 20;
        int age2 = 47;
        int age3 = 60;
        int expectedResult3 = 42;

        int actualResult3 = averageAge(age1, age2, age3);

        verifyEquals3(expectedResult3, actualResult3);

        printLetter();
        printTestResult(verifyEquals3(expectedResult3, actualResult3));


        //TC 3b
        age1 = -5;
        age2 = -30;
        age3 = -3;
        expectedResult3 = Integer.MIN_VALUE;

        actualResult3 = averageAge(age1, age2, age3);

        verifyEquals3(expectedResult3, actualResult3);

        printLetter();
        printTestResult(verifyEquals3(expectedResult3, actualResult3));


        //TC 4a
        letter = 'a';
        num = 4;

        int k = 3;
        int l = 30;
        int expectedResult4a = 3;

        int actualResult4a = findMinOutOf2(k, l);

        verifyEquals4a(expectedResult4a, actualResult4a);

        printLetter();
        printTestResult(verifyEquals4a(expectedResult4a, actualResult4a));


        //TC 4b
        int m = 300;
        int expectedResult4b = 3;

        int actualResult4b = findMinOutOf3(k, l, m);

        verifyEquals4b(expectedResult4b, actualResult4b);

        printLetter();
        printTestResult(verifyEquals4b(expectedResult4b, actualResult4b));


        //TC 4c
        int n = 3000;
        int expectedResult4c = 3;

        int actualResult4c = findMinOutOf4(k, l, m, n);

        verifyEquals4c(expectedResult4c, actualResult4c);

        printLetter();
        printTestResult(verifyEquals4c(expectedResult4c, actualResult4c));


        //TC 5
        num++;

        double t1 = 25.0;
        double t2 = 30.0;
        double t3 = 35.0;
        double t4 = 40.0;
        double t5 = 45.0;
        double expectedResult5 = 35.0;

        double actualResult5 = averageTemp(t1, t2, t3, t4, t5);

        verifyEquals5(expectedResult5, actualResult5);

        printTCNumber();
        printTestResult(verifyEquals5(expectedResult5, actualResult5));


        //TC 6
        int dailyHours = 8;
        double hrRate = 12.0;
        int daysInMonth = 20;
        int expectedResult6 = 1920;

        int actualResult6 = monthlySalary(dailyHours, hrRate, daysInMonth);

        verifyEquals6(expectedResult6, actualResult6);

        printTCNumber();
        printTestResult(verifyEquals6(expectedResult6, actualResult6));


        //TC 7
        double price = 25.5;
        int amount = 5;
        double expectedResult7 = 127.5;

        double actualResult7 = purchaseCost(price, amount);

        verifyEquals7(expectedResult7, actualResult7);

        printTCNumber();
        printTestResult(verifyEquals7(expectedResult7, actualResult7));


        //TC 8
        String firstName = "David";
        String lastName = "Greenberg";
        double salary = 10000.03;
        String expectedResult8 = "David Greenberg\t\t10000 dollars 03 cent(s)";

        String actualResult8 = paidSalary(firstName, lastName, salary);

        verifyEquals8(expectedResult8, actualResult8);

        printTCNumber();
        printTestResult(verifyEquals8(expectedResult8, actualResult8));


        /*formula test
        double price10 = 10000.05;
        System.out.println((int) price10);
        System.out.println(Math.round((price10 % Math.floor(price10)) * 100));*/


        //TC9
        printTCNumber();
        System.out.println("To print:");

        paidSalary2("Solomon", "Cohen", 10000.01);
        paidSalary2("David", "Greenberg", 13000.43);
        paidSalary2("Hannah","Gurevich", 1500.99);


        //TC 10
        int x = -3;
        String expectedResult10 = "x is negative";

        String actualResult10 = xFlow(x);

        verifyEquals10(expectedResult10, actualResult10);

        printTCNumber();
        printTestResult(verifyEquals10(expectedResult10, actualResult10));


        //TC 11
        double doubleNumber = 10.01;
        String expectedResult11 = "10 dollar(s) 01 cent(s)";

        String actualResult11 = doubleNumberToString(doubleNumber);

        verifyEquals11(expectedResult11, actualResult11);

        printTCNumber();
        printTestResult(verifyEquals11(expectedResult11, actualResult11));

        /* debugging
        double centsLeft = doubleNumber % Math.floor(doubleNumber);
        System.out.println((int) Math.floor(doubleNumber) + " dollars " + (int) (centsLeft * 100) + " cent(s)"); */


        //TC 12
        doubleNumber = 10.099;
        String expectedResult12 = "10 kg 99 g";

        String actualResult12 = doubleToString2(doubleNumber);

        verifyEquals12(expectedResult12, actualResult12);

        printTCNumber();
        printTestResult(verifyEquals12(expectedResult12, actualResult12));


        //TC 13
        printTCNumber();
        System.out.println("To print:");

        storeReceipt("Apples", 2.0, 4.99);
        storeReceipt("Potatoes", 3.75, 2.0);


        //TC 14
        int yearOfBirth = 2222;
        int expectedResult14 = 8;

        int actualResult14 = luckyNumber(yearOfBirth);

        printTCNumber();
        printTestResult(verifyEquals14(expectedResult14, actualResult14));


        //TC 15
        int a = 7;
        int b = 9;
        int c = 2;
        String expectedResult15 = "The average value = 6, the median = 7";

        String actualResult15 = averageMinusMedian(a, b, c);

        verifyEquals15(expectedResult15, actualResult15);

        letter = 'a';
        printLetter();
        printTestResult(verifyEquals15(expectedResult15, actualResult15));

    }
}
