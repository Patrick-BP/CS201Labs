package Lab5;

public class MyJavaEmployee {
    private final double BASIC_HOURLY_WAGE = 7.25;
    private final double OVERTIME_RATE = 1.5;
    private final int REGULAR_WORKING_HOURS = 40;
    private  double numberOfHours;
    private double totalSales;


    public MyJavaEmployee() {}

    public MyJavaEmployee(double numberOfHours, double totalSales) {
        this.numberOfHours = numberOfHours;
        this.totalSales = totalSales;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    double wage;
    public void wage(){
        if(numberOfHours <= REGULAR_WORKING_HOURS) {
             wage = numberOfHours * BASIC_HOURLY_WAGE;
            System.out.println("Wage no over time and no commission " +wage +" $");
        }
        else{
            wage = ( REGULAR_WORKING_HOURS * BASIC_HOURLY_WAGE);
            System.out.println("Wage  = " +wage+" $");
            double overTime = (numberOfHours - REGULAR_WORKING_HOURS ) * (OVERTIME_RATE * BASIC_HOURLY_WAGE);
            System.out.println("Overtime = " + overTime +" $");

            wage +=  overTime;
            System.out.println("Wage + overtime = " +wage+" $");
        }
        if( this.totalSales > 1 && this.totalSales < 99.99) {
            wage += (this.totalSales*0.05);
            System.out.println("Wage + 5% commission  = "+wage +" $");
        }
        else if(this.totalSales >=100 && this.totalSales <=299.99){
            wage += (totalSales*0.1);
            System.out.println("Wage + 10% commission  = " + wage +" $");
        }
        else {
            wage += (this.totalSales*0.15);
            System.out.println("Wage + 15% commission  =  " +wage +" $");
        }
        System.out.println("\nFinal wage "+wage +" $");
    }
}
