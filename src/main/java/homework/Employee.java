/*
Задача №1

Необходимо создать класс Employee со следующими методами:
getBaseSalary - получить базовую ставку
setBaseSalary
getName - получить имя
setName
getSalary - получить зарплату
 */

package homework;

public class Employee {

    public static int baseSalary;

    public static int getBaseSalary(int baseSalary) {
        return Employee.baseSalary;
    }

    public int setBaseSalary(int baseSalary) {
        return baseSalary;
    }

    public String getName(String name) {
        return name;
    }

    public String setName(String name) {
        return name;
    }

    public int getSalary(int baseSalary) {
        return baseSalary;
    }

    public static void main(String[] args) {

        int baseSalary = 40;
        System.out.println(getBaseSalary(baseSalary));
    }
}
