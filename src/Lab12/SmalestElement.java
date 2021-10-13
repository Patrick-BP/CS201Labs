package Lab12;

public class SmalestElement {
    public static void main(String[] args) {
        int[] x = {3,4,6};
        int i = x.length;
        System.out.println(findTheSmalest(x,i));
    }
    public static int findTheSmalest(int[] x , int i){
        if(i == 1)
        return x[0] ;
        else
            return Math.min(x[i-1], findTheSmalest(x,i-1));
    }
}
