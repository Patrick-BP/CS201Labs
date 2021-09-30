package Lab4;

import java.text.DecimalFormat;

public class CoffeeBags {
    private double unitWeight;
    private int numberOfBagsSold ;
    private static final double TAX_RATE = 0.0725;
    private static final double PRICE_PER_POUND = 5.99;

public CoffeeBags(double unitWeight, int numberOfBagsSold){
    this.unitWeight = unitWeight;
    this.numberOfBagsSold = numberOfBagsSold;
}
public double totalPrice(){
    double totalPrice = this.unitWeight * this.numberOfBagsSold * this.PRICE_PER_POUND;
    double totalPriceWithTax = totalPrice + totalPrice * this.TAX_RATE;
    //totalPriceWithTax = Math.rou;

    return totalPriceWithTax;
}
public void printTotalPrice(){
    DecimalFormat df = new DecimalFormat("###.##");
    System.out.println("Number of bags sold: " + this.numberOfBagsSold);
    System.out.println("Weight per bag: " + this.unitWeight+ " lb");
    System.out.println("Price per pound: " + this.PRICE_PER_POUND+ " $");
    System.out.println("Sales tax: " + this.TAX_RATE*100+ " %");
    System.out.println("Total price: " + df.format(this.totalPrice())+ " $");
}
}
