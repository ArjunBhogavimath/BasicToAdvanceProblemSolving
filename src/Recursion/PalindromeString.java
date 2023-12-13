package Recursion;

//Palaindrome string
//Coding Ninjas problem
//Recursion
public class PalindromeString {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        if(str.length() == 1) return true;
        return recurString(str, 0);
    }
    public static boolean recurString(String str, int i){
        //base case
        //this will return if the i in the middle, which means 1st half and 2nd half is equal
        if(i>=str.length()/2) return true;

        //and now check if the left and right element is same if not return false
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;

        //now call the function again with incrementing index by 1
        return recurString(str, ++i);

    }
}

//