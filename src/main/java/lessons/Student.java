/*
HW1 Part 2
___________________________________________________
14. В проекте JavaForBeginners05 создать классы Student и Person

15. Выучить наизусть волшебные слова для запуска программы (смотрите урок и презентацию)

16. В классе Student создать точку входа в программу (метод main, который вы выучили наизусть)

17. В классе Student cоздать 2 “объекта”:
Ученик 5-го класса Вова Сидоров, 10 лет
Ученица 9-го класса Маша Семенова, 14 лет

18. Распечатать карточки студентов (aka учеников, “объектов”)
 */


package lessons;

//import lessons.Person;

public class Student extends Person {

    public static void main(String[] args) {

        System.out.println("************************************ \n"
                + "\tFirst name: \tDavid \n"
                + "\tLast name: \t\tGreenberg \n"
                + "\tAge: \t\t\t10 y.o. \n"
                + "\tGrade: \t\t\t5th \n"
                + "************************************");

            System.out.println("************************************ \n"
                    + "\tFirst name: \tAlice \n"
                    + "\tLast name: \t\tMcMahon \n"
                    + "\tAge: \t\t\t14 y.o. \n"
                    + "\tGrade: \t\t\t9th \n"
                    + "************************************");
    }
}
