package homework;

public class Manager {

    double baseSalary;
    String name;
    int numberOfSubordinates;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return getBaseSalary() * numberOfSubordinates / 100 * 3;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates() {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}

//    public static int numberOfSubordinates;
//
//    public int getNumberOfSubordinates(int numberOfSubordinates) {
//        return numberOfSubordinates;
//    }
//
//    public int setNumberOfSubordinates(int number) {
//        return number;
//    }
//
//    public double getSalary() {
//        if (numberOfSubordinates == 0) {
//            return Employee.baseSalary;
//        } else if (numberOfSubordinates > 0) {
//            return (double) (Employee.baseSalary * numberOfSubordinates) / 100 * 3;
//        }
//        return 0;
//    }

