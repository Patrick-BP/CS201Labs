/*Write a program that inputs the year a person is born and outputs the age of the person in the
  following format: You were born in 1990 and will be (are) 18 this year.*/
package Lab3;
import java.util.*;
import java.time.Year;
public class Question5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the year you were born");
        int input = key.nextInt();
        ageCalculator(input);

    }
    public static void ageCalculator(int year){
        int currentYear= Year.now().getValue();
        int age = currentYear - year ;
        System.out.println("You are " +age+ " years old" );



    }
}
