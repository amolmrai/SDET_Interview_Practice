package Sorting;

public class StringSorting {

    public void softString(String strUnsort) {
        /*String stortedString = "";
        System.out.println("Unsorted String --- " + strUnsort);
        char tempArray[] = strUnsort.toCharArray();
        Arrays.sort(tempArray);
        System.out.println("Unsorted array --- " + tempArray);
        return new String(tempArray);*/

        String str = strUnsort;
        char temp = 0;

        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] > arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(arr);
    }

    public static void main (String arg[]){
        StringSorting stringSorting = new StringSorting();
        //String str = stringSorting.softString("asdfg");
       stringSorting.softString("142365");
    }
}
