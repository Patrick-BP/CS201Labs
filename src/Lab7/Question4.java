package Lab7;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        isPrime();

    }
    public static void isPrime(){
        Scanner key = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a number");
            n = key.nextInt();

            if(!(n>=1)) break;

            int count = 0;
            for (int i = 1; i <= 100; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println("not a prime");
            } else {
                System.out.println("prime");
            }
        }while(n>0);

    }
}
