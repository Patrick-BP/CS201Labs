package Lab8And9;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        do{
            System.out.println("Enter a word");
            String input = key.nextLine();
            String input2="";
            boolean ispalindrome;
            if(input.isEmpty()) break;

            for (int i=input.length()-1; i>=0; i--){
                input2 +=input.charAt(i);
            }
            if(input.equals(input2)) {
                System.out.println("true");
            }else System.out.println("false");
        }while(true);
    }
}
