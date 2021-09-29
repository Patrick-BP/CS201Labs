package Lab2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = key.nextLine();

        System.out.println(input.length());
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length()-1));
    }
}
