package Lab4;

public class WeightConverterMain {
    public static void main(String[] args) {
        WeightConverter moonWeight = new WeightConverter(0.167);
        double yourMoonWeight = moonWeight.convert(120);
        System.out.println("your weight on the Moon is " + yourMoonWeight);

        WeightConverter mercuryWeight = new WeightConverter(0.4);
        double yourMercuryWeight = moonWeight.convert(160);
        System.out.println("your weight on Mercury is " + yourMercuryWeight);

    }
}
