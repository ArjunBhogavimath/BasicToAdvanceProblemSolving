package Recursion;

//Palindrome string
//125 Valid palindrome
//leetcode
class PlaindromeStringLC {
    public boolean isPalindrome(String s) {
        //cleaning of the string by removing everythig except charactres
        s = s.replaceAll("[^a-zA-Z0-9]+", "");
        s = s.toLowerCase();
        //if(s.length() <= 1) return true;
        return recurString(s,0);
    }
    public boolean recurString(String s, int i){
        if(i>=s.length()/2) return true;

        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        return recurString(s,++i);
    }
}

//first remove the special characters and spaces from the string
//now make string lowercase
//now call a recursivefunc with string and index 0
//check a base case --> i.e.,if i = half of string lenght return true
//otherwise check if the left most(i) and right most(str.len()-i-1) are not euqal and return false
//call the recursive method again with incremented index
