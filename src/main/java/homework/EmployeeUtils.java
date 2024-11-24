/*
Задача №3

Необходимо создать утилитарный класс (класс только со статическими полями и методами) со следующими методами:
поиск сотрудника в массиве по его имени
поиск сотрудника в массиве по вхождению указанной строки в его имени
подсчет зарплатного бюджета для всех сотрудников в массиве
поиск наименьшей зарплаты в массиве
поиск наибольшей зарплаты в массиве
поиск наименьшего количества подчиненных в массиве менеджеров
поиск наибольшего количества подчиненных в массиве менеджеров
поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
 */

package homework;

public class EmployeeUtils {

    public static Employee findByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }


    public static Employee findBySubstring(Employee[] employees, String substring) {
        for (Employee employee : employees) {
            if (employee.getName().contains(substring)) {
                return employee;
            }
        }
        return null;
    }


    public static double countAllSalaries(Employee[] employees, String name) {

        double total = 0;

        for (Employee employee : employees) {
            total += employee.getSalary();
            }
        return total;
    }


    public static double minSalary(Employee[] employees, String name) {

        if (employees.length == 0) {
            System.out.println("Can't find minimum if the array is empty");
            return -1;
        }
        double min = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }


    public static double maxSalary(Employee[] employees, String name) {

        if (employees.length == 0) {
            System.out.println("Can't find maximum if the array is empty");
            return -1;
        }
        double max = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < max) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

}
