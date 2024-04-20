package lessons;

public class Lesson10 {

    public static void main(String[] args) {

//        int[] arr1 = new int[]{1, 2, 3};
//        int[] arr2 = {1, 2, 3};

//        System.out.println(arr1 == arr2);
        //Создаются новые объекты
        // System.out.println(arr1.equals(arr2));
//        System.out.println(Arrays.equals(arr1, arr2));
//        //чтобы правильно сравнить массивы, нужно сравнивать каждое значение с каждым

//        int[] arr = arr2;
//        System.out.println(arr == arr2);
//        System.out.println(arr.equals(arr2));
//
//        int[] arr11 = {1, 2, 3};
//        System.out.println(arr11 == arr2);
//        System.out.println(arr11.equals(arr2));

//
//
//        int[] arr3 = new int[0];
//        int[] arr4 = {};
//        //Пустой массив
//        System.out.println(arr3.equals(arr4));
//        System.out.println(Arrays.equals(arr3, arr4));
//
//        int[] arr5 = new int[1];
//        int[] arr6 = {0};
//        //Массив длины 1, значение по умолчанию 0
//        System.out.println(Arrays.equals(arr5, arr6));
//
//        int[] arr7 = new int[3];
//        int[] arr8 = {0, 0, 0};
//
//        System.out.println(Arrays.equals(arr7, arr8));

//        int a = 4;
//        int a1 = 4;
//        double b = 5.5;
//        double b1 = b;
//        //Объекты не создаются, значения берутся из пула констант
//        System.out.println(a == a1);
//        System.out.println(b == b1);

        Integer intRef = 4;
//        Integer intRef1 = 4;
//        Double doubleRef = 5.5;
        Double doubleRef1 = 5.5;
//        Double doubleRef2 = doubleRef;
//
//        System.out.println(intRef == intRef1);
//        System.out.println(doubleRef == doubleRef1);
//        System.out.println(doubleRef == doubleRef2);
//        System.out.println(doubleRef.equals(doubleRef1));
//
//
//        Integer intObject = new Integer(4);
//        Double doubObject = new Double(doubleRef1);
//
//        System.out.println(intRef == intObject);
//        System.out.println(intRef.equals(intObject));
//        System.out.println(doubObject == doubleRef1);
//
//        System.out.println(intRef.equals(intObject));
//        System.out.println(doubObject.equals(doubleRef1));


//        String str1 = "Hello";
//        String str2 = "Hello";
////
//        String strObject = new String("Hello");
////
//        System.out.println(str1 == str2);
//        System.out.println(str1 == strObject);
//
//        String cat1 = "Cat";
//        String cat2 = "Cat";
//        String cat3 = new String("Cat");
//        String cat4 = new String("Cat");
//        String dog1 = new String("Dog");
//        String dog2 = "Dog";
////
//        System.out.println(cat1 == cat2);
//        System.out.println(cat3 == cat4);
//
//        System.out.println(cat1.equals(cat2));
//        System.out.println(cat1.equals(cat3));
//        System.out.println(cat3.equals(cat4));

        //_________________________________char______________________________________________________-

//        char ch = 'a';
//        Character ch1 = 'a';
//        Character chObject = new Character('a');
////        System.out.println(ch == ch1);
////        System.out.println(ch1 == chObject);
////        System.out.println(ch1.equals(chObject));
////
//        String strA = "a";
//        //System.out.println(ch == strA);
//        System.out.println(ch1.equals(strA));
//        System.out.println(ch1.equals(strA.charAt(0)));

//____________________________String vs char___________________________________
//        String str1 = "Java";
//        String str2 = "is";
//        String str3 = "fun";
//        String space = " ";
////        System.out.println(str1 + space + str2 + space + str3);
////
//        String str4 = str1 + space + str2 + space + str3;
////        System.out.println(str4);
////
////        System.out.println(str4 == (str1 + space + str2 + space + str3));
////        System.out.println(str4.equals(str1 + space + str2 + space + str3));
////
////        System.out.println(str4.charAt(0));
////        System.out.println(str4.charAt(5));
//        //System.out.println(str1.charAt(4)); //StringIndexOutOfBoundsException
//
//
////        for(int i = 0; i < 4; i ++) {
////            System.out.println(str4.charAt(i));
////        }
////
////        for (int i = 0; i < str4.length(); i ++) {
////            if (str4.charAt(i) == 'a') {
////                //array[i]
////                System.out.println(i); // печатаем индекс
////                System.out.println(str4.charAt(i)); //печатаем букву
////            } else {
////                System.out.println("Letter is not a");
////            }
////        }
//
//
////        for (int i = 0; i < str4.length(); i ++) {
////            if (str4.charAt(i) >= 'm') {
////                System.out.println(str4.charAt(i)); //печатаем букву
////            } else {
////                System.out.println(str4.charAt(i) + " < m");
////            }
////        }
////        System.out.println('m');
////        System.out.println('m' - 1);
////        System.out.println((char)('m' + 1));
//////
////        System.out.println("_______________________________________");
////        System.out.println(Character.toString('m' - 1));
////        System.out.println('m');
////        System.out.println(Character.toString('m' + 1));
//
//        // перевели строку в массив char
//        char[] arrayChar = str4.toCharArray();
//        System.out.println(Arrays.toString(arrayChar));
////
//        for (int i = 0; i < arrayChar.length; i ++) {
//            System.out.print(arrayChar[i]);
//        }
//
//        System.out.println();
//        // перевели строку в массив букв
//        String[] arrayStr = new String[str4.length()];
//
//        for (int i = 0; i < str4.length(); i++) {
//            arrayStr[i] = Character.toString(str4.charAt(i));
//        }
//
//        System.out.println(Arrays.toString(arrayStr));
//        for (int i = 0; i < arrayStr.length; i ++) {
//            System.out.print(arrayStr[i]);
//        }
//
//        System.out.println("\n______________________________________________-");
//        System.out.println(arrayStr[0].equals(arrayChar[0]));
//
//        System.out.println(arrayStr[0].equals(Character.toString(arrayChar[0])));
//
//        System.out.println(str4);
//        System.out.println(str4.toLowerCase());
//        System.out.println(str4.toUpperCase());
//        String str5 = str4.toUpperCase();
//        System.out.println(str4.equalsIgnoreCase(str5));
//        System.out.println(str4.compareToIgnoreCase(str5));
//
//


//_________________________String Concatenation vs .concat() vs StringBuilder vs StringBuffer___________________________
//        String line = "_________________________________________________________";
//        String ll = "|\t";
//        String lr = "\t|";
//
//        String str1 = "QA";
//        int num1 = 4;
//        String str2 = "Every";
//        int num2 = 1;
//
//        long start = 0;
//        long end = 0;
////
//        String resultPlus = "";
//        start = System.nanoTime();
//        resultPlus = str1 + num1 + str2 + num2;
//        end = System.nanoTime();
//
//        System.out.println(line);
//        System.out.println(ll + "result\t\t" + lr + ll + "Concatenation" + lr + ll + "Time" + "\t" + lr);
//        System.out.println(line);
//        System.out.println(ll + "resultPlus\t" + lr + ll + resultPlus + "\t" + lr + ll + (end - start) + lr);
//        System.out.println(line);
//
//        String resultConcat = "";
//        start = 0;
//        start = System.nanoTime();
//
//        resultConcat = resultConcat
//                .concat(str1)
//                .concat(String.valueOf(num1))
//                .concat(str2)
//                .concat(String.valueOf(num2));
//
//        end = System.nanoTime();
////
//        System.out.println(ll + "resultConcat" + lr + ll + resultConcat + "\t" + lr + ll + (end - start) + "\t" + lr);
//        System.out.println(line);
//
//
//
//        StringBuilder resultSB = new StringBuilder();
//
//        start = System.nanoTime();
//
//        resultSB
//                .append(str1)
//                .append(num1)
//                .append(str2)
//                .append(num2);
//
//        end = System.nanoTime();
//
//        System.out.println(ll + "resultSB" + "\t" + lr + ll + resultSB + "\t" + lr + ll + (end - start) + "\t" + lr);
//        System.out.println(line);
//
//
//
//        StringBuffer resultSBuf = new StringBuffer();
//        start = System.nanoTime();
//
//        resultSBuf
//                .append(str1)
//                .append(num1)
//                .append(str2)
//                .append(num2);
//
//        end = System.nanoTime();
//
//        System.out.println(ll + "resultSBuf" + "\t" + lr + ll + resultSBuf + "\t" + lr + ll + (end - start) + "\t" + lr);
//        System.out.println(line);
//
//        System.out.println(resultPlus.equals(resultConcat));
//        System.out.println(resultPlus.equals(resultSB.toString()));
//    }
//}

//        long t1 = System.nanoTime();
//        str1.concat(str2);
//        long t2 = System.nanoTime();
//        System.out.println(t2 - t1);
//
//        long t5 = System.nanoTime();
//        str = str1 + str2;
//        long t6 = System.nanoTime();
//        System.out.println(t6 - t5);
//
//        long t3 = System.nanoTime();
//        sb1.append(sb2);
//        long t4 = System.nanoTime();
//        System.out.println(t4 - t3);
    }
}