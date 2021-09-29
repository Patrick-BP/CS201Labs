package Lab2;

import java.security.Key;
import java.util.Locale;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fName = key.next();
        String mName = key.next();
        String lName = key.next();

        System.out.println(fName+ " " + mName.toUpperCase().charAt(0)+ ". " + lName);

    }
}
