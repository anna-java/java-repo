package homework;

public class TaxCalc {

    /*
    static double incomeTax;
    static int numOfKids;

    public static double calculateIncomeTax(Staff[] staff) {
        if (staff.length == 0) {
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
    */


    // Variant #2
    public static TaxPayment[] calculateTaxForAll(Staff[] staff) {
        TaxPayment[] taxPayments = new TaxPayment[staff.length];

        for (int i = 0; i < staff.length; i++) {
            taxPayments[i] = taxForStaff(staff[i]);
        }
        return taxPayments;
    }


    public static TaxPayment taxForStaff(Staff staff) {
        double effectiveSalary = staff.salary - staff.numOfKids * 1000;
        double taxRate;

        if (effectiveSalary > 10000) {
            taxRate = 0.23;
        } else if (effectiveSalary > 5000) {
            taxRate = 0.18;
        } else {
            taxRate = 0.13;
        }
        TaxPayment taxPayment = new TaxPayment();
        taxPayment.name = staff.name;
        taxPayment.tax = effectiveSalary * taxRate;
        return taxPayment;
    }
}
