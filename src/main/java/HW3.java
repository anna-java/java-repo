package homework;

public class HW3 {

    public static void main(String[] args){

        int count = 1;
        String line = "----------";
        char letter = 'a';


        System.out.println("Task " + ++count); //Task 2

        byte a = 34;
        byte b = 88;


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 3

        short s = -32500;
        short t = 27500;


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 4

        int i = -2147483648;

        System.out.println("---------------------------------\n"
                + "|" + "\tint min\t" + "\t|\t" + i + "\t|");

        i = 2147483647;

        System.out.println("---------------------------------\n"
                + "|" + "\tint max\t" + "\t|\t" + i + "\t|");
        System.out.println("---------------------------------");


        System.out.println("Task " + ++count); //Task 5

        long phoneNumber = 13473690503L;


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 6

        float f = 100.101101F;
        double d = 100.101101;

        System.out.println("-------------------------------------\n"
                + "|" + "\tfloat f = \t" + "\t|\t" + f + "\t|\n"
                + "-------------------------------------\n"
                + "|" + "\tdouble d = \t" + "\t|\t" + d + "\t|\n"
                + "-------------------------------------");


        char countLetter = 'a'; //Task 7a

        System.out.println("Task " + ++count + countLetter);

        double dd = 10.09999 + 20.099999;

        System.out.println(dd);


        System.out.println(line);
        System.out.println("Task " + count + ++countLetter); //Task 7b

        float ff = 10.09999F + 20.099999F;

        System.out.println(ff);


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 8

        ff = 10F / 3F;
        dd = 10D / 3D;

        System.out.println("ff = " + ff);
        System.out.println("dd = " + dd);


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 9

        float floatSum = f + ff;
        float floatSub = f - ff;
        float floatProduct = f * ff;
        float floatQuotient = f / ff;
        float floatRemainder = f % ff;


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 10

        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 11

        String longLine = "---------------------------------------------------------------------------------------------------------";
        String verticalLine = "|";

        System.out.println(longLine + "\n" + verticalLine + "\t" + "f = " + f + "\t"
                + verticalLine + "\t" + "d = " + d + "\t"
                + verticalLine + "\t\t" + "ff = " + ff + "\t\t"
                + verticalLine + "\t\t" + "dd = " + dd + "\t\t" + verticalLine + "\n" + longLine + "\n"
                + verticalLine + "\t" + "floatSum = " + floatSum + "\t\t\t\t"
                + verticalLine + "\t\t" + "doubleSum = " + doubleSum + "\t\t\t\t\t\t\t" + verticalLine + "\n"
                + verticalLine + "\t" + "floatSub = " + floatSub + "\t\t\t\t\t"
                + verticalLine + "\t\t" + "doubleSub = " + doubleSub + "\t\t\t\t\t\t\t" + verticalLine + "\n"
                + verticalLine + "\t" + "floatProduct = " + floatProduct + "\t\t\t"
                + verticalLine + "\t\t" + "doubleProduct = " + doubleProduct + "\t\t\t\t\t\t" + verticalLine + "\n"
                + verticalLine + "\t" + "floatQuotient = " + floatQuotient + "\t\t\t"
                + verticalLine + "\t\t" + "doubleQuotient = " + doubleQuotient + "\t\t\t\t\t\t\t\t" + verticalLine + "\n"
                + verticalLine + "\t" + "floatRemainder = " + floatRemainder + "\t\t\t"
                + verticalLine + "\t\t" + "doubleRemainder = " + doubleRemainder + "\t\t\t\t\t" + verticalLine + "\n"
                + longLine);


        System.out.println("Task " + ++count); //Task 12
        System.out.println("*\t" + "*\t" + "*****\t" + "*\t\t" + "*\t" + "\t  *  "  // 1 Hello
                + "\t\t\t*****\t" + " *\t\t" + "*\t" + "*\t" + "  *\t" + "\t\t*\n"  // 1 Java
                + "*\t" + "*\t" + "*\t\t" + "*\t\t" + "*\t\t" + "*\t" + "*\t"       // 2 Hello
                + "\t\t  *\t" + "   *" + "   *\t" + "*\t" + "*\t" + "*   *\t\t*\n"  // 2 Java
                + "****" + "*\t" + "*****\t" + "*\t\t" + "*\t\t" + "*\t" + "*\t"    // 3 Hello
                + "\t\t  *\t" + "   *****\t" + "*\t" + "*\t" + "*****\t\t*\n"       // 3 Java
                + "*\t" + "*\t" + "*\t\t" + "*\t\t" + "*\t\t" + "*\t" + "*\t"       // 4 Hello
                + "\t  *\t  *\t" + "   *" + "   *\t" + "*\t" + "*\t" + "*   *\n"    // 4 Java
                + "*\t" + "*\t" + "*****\t" + "*****\t" + "*****\t" + "  *\t"       // 5 Hello
                + "\t\t  *****\t" + "   *" + "   *\t" + "  *\t" + "\t*   *\t\t*");  // 5 Java


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 13

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Float t7 = 2.66666666666666F;
        Double t8 = -1000000.001;
        Short t9 = 1010;

        System.out.println(t1 + ", " + t2 + ", " + t3 + ", " + t4 + ", " + t5 + ", " + t6 + ", " + t7 + ", "
                + t8 + ", " + t9);


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 14 (Skipped because it's just another table)


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 15

        Integer num1 = new Integer(25);
        Integer num2 = new Integer(25);
        boolean comparison = num1.equals(num2);

        System.out.println("Если num1 равно num2, то результат сравнения методом .equals() = " + comparison);

        num1 = 30;
        num2 = 40;
        boolean comparison2 = num1.equals(num2);

        System.out.println("Если num1 не равно num2, то результат сравнения методом .equals() = " + comparison2);


        System.out.println(line);
        System.out.println("Task " + ++count + letter); //Task 16a, should've used Integer.compare(number1, number2)

        int number1 = 20;
        int number2 = number1;
        //boolean comparison3 = (number1 == number2);

        System.out.println("Если number1 = number2, то результат сравнения методом equal to = " + Integer.compare(number1, number2));
        System.out.println(line);
        System.out.println("Task " + count + ++letter); //Task 16b

        number1 = 35; number2 = 65;
        //boolean comparison4 = (number1 < number2);

        System.out.println("Если number1 < number2, то результат сравнения методом less than = " + Integer.compare(number1, number2));
        System.out.println(line);
        System.out.println("Task " + count + ++letter); //Task 16c

        letter = 'a';
        number1 = 80;
        //boolean comparison5 = (number1 > number2);

        System.out.println("Если number1 > number2, то результат сравнения методом more than = " + Integer.compare(number1, number2));


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 17

        Float num = new Float(234.9999F);

        System.out.println(num.intValue());


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 18

        double x = 36.6;
        double y = 63.4;

        System.out.println(Double.sum(x, y));


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 19

        Float m = new Float(136.6F);
        Float n = new Float(163.4F);

        System.out.println(Integer.sum(m.intValue(), n.intValue()));


        System.out.println(line);
        System.out.println("Task " + ++count + letter); //Task 20a, could've used Short.compareUnsigned(short1, short2);

        Short short1 = new Short("12000");
        Short short2 = new Short("12300");

        System.out.println(short1 + " - " + short2 + " = " + short1.compareTo(short2));


        System.out.println(line);
        System.out.println("Task " + count + ++letter); //Task 20b

        short1 = 12500;

        System.out.println(short1 + " - " + short2 + " = " + short1.compareTo(short2));


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 21

        String str1 = new String("123.56");
        String str2 = new String("123.55");
        Double doub1 = new Double(123.56);
        Double doub2 = new Double(123.55);

        Double subDoub = (doub1 - doub2);
        Double subStr = (Double.valueOf(str1) - Double.valueOf(str2));

        System.out.println(subDoub);
        System.out.println(subStr);
        System.out.println(Double.compare(subDoub, subStr));


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 22,could've used just one variable

        Float maxTemperature = new Float("104.0F");
        Float minTemperature = new Float("99.0F");
        Float averageTemperature = (maxTemperature - minTemperature) / 2 + minTemperature;

        System.out.println(averageTemperature);


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 23

        Long wLong = new Long(9223372036854775807L);
        Integer wInt = new Integer(10);
        Double wDouble = new Double("10.999999999");

        System.out.println("Переменная w может принимать значения: \n"
                + "w = " + wLong + '\n'
                + "w = " + wInt + '\n'
                + "w = " + wDouble + '\n');


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 24

        Integer numberInteger = new Integer(100);

        System.out.println(numberInteger.getClass());
        System.out.println(numberInteger.toString().getClass());


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 25

        double kgTolbs = 2.205;
        float milesTometers = 1609.0F;

        System.out.println("50 kg = " + 50 * kgTolbs + " lbs, 50 lbs = " + 50 / kgTolbs + " kg");
        System.out.println("100 meters = " + 100 / milesTometers + " miles, 100 miles = " + 100 * milesTometers
                + " meters");


        System.out.println(line);
        System.out.println("Task " + ++count); //Task 26
        //thunderstorm with heavy rain
        System.out.println("\"weather\": [\n"
                + "        {\n"
                + "            \"id\": 202,\n"
                + "            \"main\": \"Rain\",\n"
                + "            \"description\": \"light rain\",\n"
                + "            \"icon\": \"11d\"\n"
                + "        }\n"
                + "    ],");
        //Overcast clouds: 85-100%, 04n as well
        System.out.println("\"weather\": [\n"
                + "        {\n"
                + "            \"id\": 804,\n"
                + "            \"main\": \"Rain\",\n"
                + "            \"description\": \"light rain\",\n"
                + "            \"icon\": \"04d\"\n"
                + "        }\n"
                + "    ],");
        //Shower sleet
        System.out.println("\"weather\": [\n"
                + "        {\n"
                + "            \"id\": 613,\n"
                + "            \"main\": \"Rain\",\n"
                + "            \"description\": \"light rain\",\n"
                + "            \"icon\": \"13d\"\n"
                + "        }\n"
                + "    ],");


    }



}
