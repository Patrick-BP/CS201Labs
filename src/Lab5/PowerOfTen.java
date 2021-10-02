package Lab5;

import java.util.Scanner;

public class PowerOfTen {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a power of 10");
        int input = key.nextInt();

        if(input > 0 && input <6) System.out.println("Thousand");
        else if(input >=6 && input < 9) System.out.println("Million");
        else if(input >=9 && input < 12) System.out.println("Billion");
        else if(input >=12 && input < 15) System.out.println("Trillion");
        else if(input >=15 && input < 18) System.out.println("Quadrillion");
        else if(input >=18 && input < 21) System.out.println("Quintillion");
        else if(input >=21 && input < 30) System.out.println("sextillion");
        else if(input >=30 && input < 100) System.out.println("Nonillion");
        else System.out.println("Google it");

    }
}
