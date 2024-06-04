package lessons;

public class Lesson3Part1 {

    //14
//    xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))



//               (5x + 7y)
//            ( __________ )
//              (8x + 10y)                    5x + 7y            3x - y             xⁿ * (5x + 7y)(x + y)
//  xⁿ *   ___________________   =    xⁿ *  ___________   :    __________    =    ________________________
//​              (3x - y)                     8x + 10y            x + y              (8x + 10y) (3x - y)
//           ( ____________ )
//               (x + y)

//
//    если
//    x = 7
//    y = 18
//    n = 3


    public static void main(String[] args) {

        System.out.println(10 / 7 / 5 / 4);
        System.out.println((10 / 7) / (5 / 4));
        System.out.println((10 * 4) /  (7 * 5));


//        int x = 7;
//        int y = 18;
//        int powerOfX = x * x * x;
//
//        int result1 = powerOfX * ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)/(x + y));
//        System.out.println(result1);
//
//
//        int result = powerOfX * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y));
//        System.out.println(result);
//
//
//
//        double x = 7;
//        double y = 18;
//        double powerOfX = x * x * x;
//
//        double result2 = powerOfX * ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)/(x + y));
//
//        double result3 = powerOfX * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y));
//
//        System.out.println(result2);
//        System.out.println(result3);
//
//
//
//
//
//        int x = 20;
//        int y = 10;
//        //int n = 3;
//
//        int powerOfX = x * x * x;
//
//        int result1 = powerOfX * ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)/ (x + y));
//        System.out.println(result1);
//
//        int result = powerOfX * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y));
//        System.out.println(result);
//
//
//
//
//        double x = 20;
//        double y = 10;
//        double powerOfX = x * x * x;
//
//        double result2 = powerOfX * ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)/(x + y));
//
//        double result3 = powerOfX * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y));
//
//        System.out.println(result2);
//        System.out.println(result3);
//
//
//        int x = 200;
//        int y = 1;
//        //int n = 3;
//
//        int powerOfX = x * x * x;
//
//        int result1 = powerOfX * ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)/ (x + y));
//        System.out.println(result1);
//
//        int result = powerOfX * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y));
//        System.out.println(result);
//
//
//        double x = 200;
//        double y = 1;
//        double powerOfX = x * x * x;
//
//        double result2 = powerOfX * ((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y)/(x + y));
//
//        double result3 = powerOfX * ((5 * x + 7 * y) * (x + y)) / ((8 * x + 10 * y) * (3 * x - y));
//
//        System.out.println(result2);
//        System.out.println(result3);
//



//13

        int k = 5;
        int l = 10;
        int m = 15;

        String line = "\t________________________________________________________________________________\n";
        String vLine = "\t|\t";
        String endLine = "\t|";
        String tab = "\t";

        System.out.println(
                line
                        + vLine + tab
                        + vLine + "+10"
                        + vLine + "-5"
                        + vLine + "*100"
                        + vLine + "/2"
                        + vLine + "%2"
                        + vLine + "^2"
                        + vLine + "++"
                        + vLine + "--"
                        + endLine
        );
        System.out.print(
                line
                        + vLine + "k = " + k
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100) + " "
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);

        k = l;

        System.out.print(
                line
                        + vLine + "l = " + l
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100)
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);

        k = m;

        System.out.print(
                line
                        + vLine + "m = 15"
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100)
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);
        System.out.println(line);
    }
}
