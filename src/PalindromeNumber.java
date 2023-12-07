//1.4 basic maths problem
//9. palindrome (leetcode)
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int reverse_num = 0;
        if(x == 0) return true;

        //check for negatuive number
        if(x<0 || x%10 == 0) return false;

        while(x>reverse_num){
            int removed = x%10;
            reverse_num = (reverse_num*10)+removed;
            x/=10;
        }
        if(x==reverse_num ||  x==reverse_num/10){
            return true;
        }
        else{
            return false;
        }
    }
}
