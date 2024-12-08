package homework;

public class TaxPayment {

    String name;
    static double incomeTax;
    static int numOfKids;

    public static double calculateIncomeTax(Employee2[] employees) {
        if (employees.length == 0) {
            System.out.println("No employees were found");
            return -1;
        }
        double salary = 0;
        if (salary <= 0) {
            System.out.println("Salary cannot be a negative number");
            return -1;
        } else if (salary > 0 && salary < 5000) {
            incomeTax = (salary - numOfKids * 1000) * 0.13;
            return incomeTax;
        } else if (salary >= 5000 && salary <= 10000) {
            incomeTax = (salary - numOfKids * 1000) * 0.18;
            return incomeTax;
        } else {
            incomeTax = (salary - numOfKids * 1000) * 0.23;
            return incomeTax;
        }
    }
}
