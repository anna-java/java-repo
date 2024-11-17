package homework;

public class Manager {

    public static int numberOfSubordinates;

    public int getNumberOfSubordinates(int numberOfSubordinates) {
        return numberOfSubordinates;
    }

    public int setNumberOfSubordinates(int number) {
        return number;
    }

    public double getSslary() {
        if (numberOfSubordinates == 0) {
            return Employee.baseSalary;
        } else if (numberOfSubordinates > 0) {
            return (double) (Employee.baseSalary * numberOfSubordinates) / 100 * 3;
        }
        return 0;
    }
}
