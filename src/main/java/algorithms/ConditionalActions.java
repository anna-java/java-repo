/*
7. Given an integer M perform the following conditional actions:
If M is multiple of 7 and 9 then return "Good Number".
If M is only multiple of 9 and not of 7  then return "Bad Number"
If M is only multiple of 11 then return "Poor Number"
If M doesn't satisfy any of the above conditions then return "-1"
 */


package algorithms;

public class ConditionalActions {

    public String conditionalActions(int M) {

        if (M != 0) {

            if ((M % 7 == 0) && (M % 9 == 0)) {
                return "Good Number";
            } else if ((M % 7 != 0) && (M % 9 == 0)) {
                return "Bad Number";
            } else if (M % 11 == 0) {
                return "Poor Number";
            }
            return "-1";
        }
        return "0";
    }
}
