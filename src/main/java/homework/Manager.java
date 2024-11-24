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


    public double getBonus() {
        return getSalary() - getBaseSalary();
    }
}

