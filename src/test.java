public class test {
    public static void main(String[] args) {
        int[] arr = {8,2,9,4,7};
        int index = arr.length;

        System.out.println(minArray(arr,index));
    }
    public static int minArray(int[] x, int index) {
        if (index == 1) return x[0];
         else
             return Math.min(x[index-1], minArray(x, index-1)) ;

    }
    }

