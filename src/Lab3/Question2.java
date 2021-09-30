//Write a program to convert centimeters (input) to feet and inches (output). 1 in = 2.54 cm
package Lab3;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {

        Scanner key =  new Scanner(System.in);
        System.out.println("Enter a number in centimeter ");
        double input = key.nextInt();

        cmToFeetConvertor(input);

    }
    public static void cmToFeetConvertor(double centimeters){
        double conv = centimeters /2.54;
        int feet = (int)conv/12;
        double inches = conv%12;
        System.out.println(centimeters + " Centimeters = " + feet+ " feet " + inches+ " inches" );

    }

}
