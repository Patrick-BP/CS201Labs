package Lab4;

import java.util.Scanner;

public class CoffeeBagsMain {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter the weight per bag");
        double weightPerBag = key.nextDouble();
        System.out.println("Please enter the number of bags sold");
        int bagsSold = key.nextInt();

        CoffeeBags sale1 = new CoffeeBags(weightPerBag,bagsSold);
        sale1.printTotalPrice();

    }
}
