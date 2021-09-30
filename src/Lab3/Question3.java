/*Write a program that inputs temperature in degrees Celsius and prints out the temperature in
  degrees Fahrenheit. The formula to convert degrees Celsius to equivalent degrees Fahrenheit is
  Fahrenheit = 1.8 * Celsius + 32 */
package Lab3;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter temperature in Degree Celsius");
        double input = key.nextDouble();
        celsiusToFahrenheit(input);

    }
    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + " Degree Celsius = " +fahrenheit+ " Degree Fahrenheit" );
    }

}
