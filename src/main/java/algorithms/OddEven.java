/* В классе NeedToRename создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
если число нечетное, и “Even”, если число четное.

Test Data:
-345 →  “Odd”
0 →  “Even”
222222 →  “Even” */

package algorithms;

import java.util.Scanner;

public class OddEven {

    public String oddEven(int num) {

        System.out.println("Enter a number: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}


