//To print out weather in two different locations

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
