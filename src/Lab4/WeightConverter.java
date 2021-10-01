package Lab4;

public class WeightConverter {
    private double gravity;

    public WeightConverter(){
    }
    public WeightConverter(double gravity){
        this.gravity = gravity;
    }

    public double convert(double x){
        double weight = x * this.gravity;
        return weight;
    }

}
