package BasicMaths;

//Prime number
//maths basic problems 1.4
//striver a-z
public class PrimeNumber {
    public static String isPrime(int num) {
        //Your code goes here
        if(num == 0) return "YES";
        if(num == 1) return "NO";
        for(int i=2;i < Math.sqrt(num);i++){
            if(num%i==0) return "NO";
        }
        return "YES";
    }
}

//1 is prime number , but for this problem it is false
//we need to check from 2 to n-1 ---> this is a brute force approach
//optimal solution --> need to chec from 2 to sqrt(n)
