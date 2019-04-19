package samples;

public class StringReplaceUsingRecursion {
    public static void main(String[] args) {
        String myStr = "Ilam";


        //create Method and pass and input parameter string
        String reversed = reverseString(myStr);
        System.out.println("The reversed string is: " + reversed);
    }

    static String reverseString(String myStr) {
        if (myStr.isEmpty()) {
            System.out.println("String in now Empty");
            return myStr;
        }
        //Calling Function Recursively
        System.out.println("String to be passed in Recursive Function: " + myStr.substring(1));
        String toBeReturned = reverseString(myStr.substring(1)) + myStr.charAt(0);
        System.out.println("myStr : " + myStr);
        System.out.println("toBeReturned : " + toBeReturned);
        return toBeReturned;
    }
}
