package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String fname = key.next();
        String lname = key.next();



        System.out.print("your initials are: " + fname.charAt(0) + lname.charAt(0));

    }
}
