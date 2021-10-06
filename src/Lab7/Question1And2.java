package Lab7;
/* a) infinity loop
*  b) while(sum > 10000)
*  c) missing incrementation of the loop and initialization
*  d) missing incrementation of the loop and initialization
* */
public class Question1And2 {

    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("for Loop");
        int sum =0;
        for(int i = 1; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);

        System.out.println("Do... while Loop");
        int sum1 = 0;
        int k=0;
        do{
            sum1 += k;
            k++;

        }while(k<=100);
        System.out.println(sum1);

        System.out.println("while Loop");
        int sum3 = 0;
        int l=1;
        while(l<=100){
            sum3 += l;
            l++;
        }
        System.out.println(sum3);

        System.out.println("B");
        int sum2 =0;
        for(int i = 5; i<=50; i+=5){
            sum2 += i;
        }
        System.out.println(sum2);

        System.out.println("Do... while Loop");
        int sum12 = 0;
        int r=5;
        do{
            sum12 += r;
            r +=5;

        }while(r<=50);
        System.out.println(sum12);


        System.out.println("while Loop");
        int sum33 = 0;
        int u=5;
        while(u<=50){
            sum33 += u;
            u+=5;
        }
        System.out.println(sum33);



    }
    
    

}
