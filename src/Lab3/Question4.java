/*Write a program that accepts a person’s weight and displays the number of calories the
  person needs in one day. A person needs 19 calories per pound of body weight, so the formula
  expressed in Java is calories = bodyWeight * 19; */
package Lab3;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your weight");
        double input = key.nextDouble();
        NumOfCaloriesPerDay(input);

    }
    public static void NumOfCaloriesPerDay(double weight){
        double calories = weight *19;
        System.out.println("You need " +calories+ " per day" );
    }
}
