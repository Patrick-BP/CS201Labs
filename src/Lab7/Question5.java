package Lab7;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        numOfPrime();
    }

    public static void numOfPrime(){
        Scanner key = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a number");
            n = key.nextInt();

            if(!(n>2)) break;

            int count = 0;
            int count2 = 0;
            for (int i = 2; i <= n; i++) {
                for(int j=2; j<=n; j++){
                if (i % j == 0) count++;

            }
                if(count==1) {
                    count2++;
                    count=0;
                }
                count=0;

            }

                System.out.println(count2);

        }while(n>2);

    }
}
