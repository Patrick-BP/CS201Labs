package Lab8And9;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        do{
            System.out.println("Enter a sentence");
            String input = key.nextLine();
            if(input.isEmpty()) break;
            int count=0, count1=0, count2=0, count3=0, count4=0;
             for (int i=0; i<input.length(); i++){
                 if(input.charAt(i) == 'a') count++;
                 if(input.charAt(i) == 'e') count1++;
                 if(input.charAt(i) == 'i') count2++;
                 if(input.charAt(i) == 'o') count3++;
                 if(input.charAt(i) == 'u') count4++;

             }

            System.out.println("# of 'a' : " + count);
            System.out.println("# of 'e' : " + count1);
            System.out.println("# of 'i' : " + count2);
            System.out.println("# of 'o' : " + count3);
            System.out.println("# of 'u' : " + count4);


        }while(true);



    }
}
