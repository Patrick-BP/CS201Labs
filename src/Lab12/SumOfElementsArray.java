package Lab12;

public class SumOfElementsArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int index = arr.length;
        System.out.println(sumOfElementsInArray(arr, index));
    }
  public static int  sumOfElementsInArray(int[] arr, int index){

        if(index == 1)
            return arr[0];
        else
            return arr[index-1] + sumOfElementsInArray(arr,index-1);

  }
}
