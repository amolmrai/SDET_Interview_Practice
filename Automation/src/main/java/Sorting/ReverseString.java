package Sorting;


public class ReverseString {

    public static String reverseString( String str){
        String reverseStr = new String();
    // Convert String into the Array
        char [] temp = str.toCharArray();
    // Iterate array in reverse order
        for(int i = temp.length-1;i>=0;i--){
            // add char array into reverseString.
            reverseStr=reverseStr+temp[i]+"";
        }
        return reverseStr;
    }
    public static void main(String arg[]){
        String str = "Amol";
        System.out.println(reverseString(str));
    }
}
