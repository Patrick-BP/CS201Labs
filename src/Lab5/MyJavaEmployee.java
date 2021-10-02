package Lab5;

public class MyJavaEmployee {
    private final double BASIC_HOURLY_WAGE = 7.25;
    private final double OVERTIME_RATE = 1.5;
    private  double numberOfHours;
    private double totalSales;

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
        if(numberOfHours<=8) {
             wage = numberOfHours * BASIC_HOURLY_WAGE;

            if(this.totalSales > 1 && this.totalSales<99.99) {
                wage += (totalSales*0.05);

            }
            else if(this.totalSales >=100 && this.totalSales <=299.99){
                wage += (this.totalSales*0.1);
            }
            else {
                wage += (this.totalSales*0.15);
            }
        }
        else{
           double overTime = (numberOfHours - 8 ) * OVERTIME_RATE;
           wage = ( 8 * BASIC_HOURLY_WAGE) + overTime;

            if( this.totalSales > 1 && this.totalSales < 99.99) {
                wage += (this.totalSales*0.05);
            }
            else if(this.totalSales >=100 && this.totalSales <=299.99){
                wage += (totalSales*0.1);
            }
            else {
                wage += (this.totalSales*0.15);
            }



        }
    }
}
