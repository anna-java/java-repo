/*
HW1 Part 3
___________________________________________________
 27. В проекте JavaForBeginners05 создайте пакет weather. Затем создайте необходимый класс, переменные, и выведите на печать
- текущую погоду
- погоду на завтра
в любом городе.
(Желательно использовать сайт https://openweathermap.org/ для поиска данных)
 */


package lessons;

public class USweather {

    public static void main(String[] args) {

        String city1 = "San Antonio, TX";
        int temp1 = 90;

        String city2 = "Brooklyn, NY";
        int temp2 = 75;

        System.out.println("The weather in " + city1 + " is " + temp1 + "F" + " today");
        System.out.println("The weather in " + city2 + " will be " + temp2 + "F" + " tomorrow");
    }
}
