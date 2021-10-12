package Lab8And9;

import java.util.Scanner;

public class DnaStrands {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        do{
            System.out.println("Enter a DNA Strand");
            String input = key.nextLine();
            if(input.isEmpty()) break;
            String newStrand= "";
            for (int i=0; i<input.length(); i++){
                if(input.charAt(i) == 'T')
                    newStrand += "A";
                if(input.charAt(i) == 'G')
                    newStrand += "C";
                if(input.charAt(i) == 'A')
                    newStrand += "T";
                if(input.charAt(i) == 'C')
                    newStrand += "G";

            }
            System.out.println(newStrand);


        }while(true);
    }
}
