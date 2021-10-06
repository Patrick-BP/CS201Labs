package Lab8And9;

import java.util.Scanner;
import java.lang.*;
public class UppercaseCounter {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        do{
            System.out.println("Enter a string");
            String input = key.nextLine();
            if(input.isEmpty()) break;
            int count=0;
            for (int i=0; i<input.length(); i++){
                if(Character.isUpperCase(input.charAt(i))) count++;
            }
            System.out.println(count);

        }while(true);



    }
}
