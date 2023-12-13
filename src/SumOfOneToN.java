//sum of first n numbers
//1.5 recursion
//coding ninjas
public class SumOfOneToN {
    //this is a fast solution
    public static long sumFirstNUsingFormula(long n) {
        long ans = n*(n+1)/2;
        return ans;
    }
    //this below methods will fail because of too many recursion calls
    public static long sumFirstN(long n) {
        // Write your code here.
        long ans = 0;
        if(n == 0 || n == 1) return n;
        return recurSum(n,ans);
    }

    public static long recurSum(long n, long ans){
        ans+=n;
        if(n-1<1) return ans;
        n--;
        return recurSum(n,ans);
    }
}

//declare global ans
//pass to recursion method ans and n
//add the n to the answer and decrement the n
//if n-1 becomes 0 then return ans
//otherwise call the recur function again

//the recursive way will fail due to more number of func calls
//so use formula instaed
//n(n+1)/2
