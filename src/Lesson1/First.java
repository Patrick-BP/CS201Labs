package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
Scanner key = new Scanner(System.in);
System.out.println("how many time you wanna roll the dice? ");
int input = key.nextInt();
        Random random = new Random();
for(int i=1; i<=input; i++){
    int r1 = random.nextInt(6)+1;
    int  r2 = random.nextInt(6)+1;
    System.out.println("("+r1+","+r2+")");

}


    }
}
