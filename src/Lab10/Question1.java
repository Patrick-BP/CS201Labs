package Lab10;

import java.util.Arrays;
import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        double[] temps = new double[364];
        int[] months = {31,28,31,30,31,30,31,30,31,30,31,30};
        Random rand = new Random();
        int temp =0;

        for (int k = 0; k < months.length; k++) {

        for (int i = temp; i <= months[k]; i++) {
            temps[i+temp] = rand.nextInt(111)-5;
            temp += i;
        }

        }
        System.out.println(Arrays.toString(temps));
    }
}






/*
 if(i>=1 && i<=31 ){ // jan
                temps[i] = rand.nextInt(31)-20;
            }
            else if(i>32 && i<=59){ //feb
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>59 && i<=90){  //march
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>90 && i<=121){ //april
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>121 && i<=151){ //may
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>151 && i<=180){ //june
                temps[i] = rand.nextInt(31)-10;
            }else if(i>180 && i<=211){//july
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>211 && i<=241){ //aug
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>241 && i<=270){  //sept
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>270 && i<=301){ //oct
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>301 && i<=330){ //nov
                temps[i] = rand.nextInt(31)-10;
            }
            else if(i>330 && i<=361) { //dec
                temps[i] = rand.nextInt(31) - 10;
            }
 */