package Sorting;

public class NonRepeatingChar {

    public static String getNonRepeatingChar(String str){
        String uniqueChar = "";
        if(str.isEmpty() || str == null){
            return uniqueChar;
        }
        for(char s : str.toCharArray()){
            if(str.indexOf(s)==str.lastIndexOf(s)){
                uniqueChar = uniqueChar+s ;
            }
        }
        return uniqueChar;
    }

    public static void main(String arg[]){
    System.out.println("Non Repeating Char is "+getNonRepeatingChar("apple"));
    }
}
