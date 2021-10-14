package Lab12;

public class ReverseString {
    public static void main(String[] args) {
        String str = "patrick";
        int index = str.length();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        if (str.isEmpty()) return str;
        else
          return  reverseString(str.substring(1))+str.charAt(0);

    }
}
