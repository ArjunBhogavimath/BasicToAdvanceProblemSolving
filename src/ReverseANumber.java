//7. reverse a interger (leetcode)
public class ReverseANumber {
    public int reverse(int x) {
        int reverse = 0 ;
        int mod =0;
        while(x!=0){
            mod = x%10;
            x/=10;

            if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE/10 && mod>7) return 0;
            if(reverse < Integer.MIN_VALUE/10 || reverse == Integer.MIN_VALUE/10 && mod<-8) return 0;

            reverse = (reverse*10)+mod;
        }
        return reverse;
    }
}
