
//Create a class TemperatureConverter with a method convert To Fahrenheit that takes a temperature in Celsius as input 
//and converts it to Fahrenheit. Handle the InputMismatchException 
//if the user enters a non-numeric value when providing the temperature.F = (9/5)C + 32.
import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Celsius value");
            double d = sc.nextDouble();
            converttoFahrenheit(d);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a non-numeric value");
        }
    }

    static void converttoFahrenheit(double c) {
        double f;
        f = (9 / 5) * c + 32;
        System.out.println("The value in fahrenheit is " + f);
    }
}