package Lab2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner key =  new Scanner(System.in);
        System.out.println("Enter a word");
        String input = key.nextLine();
        int middleChar = input.length()/2;
            System.out.println(input.charAt(middleChar));
    }
}
