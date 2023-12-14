package Recursion;
//Coding Ninjas
//Fibonacci series
public class FibonacciSeriesCN {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        if(n<3) return arr;
        return recurFibonacciNumbers(arr,n,2);
    }
    public static int[] recurFibonacciNumbers(int []arr,int n,int i){
        if(i>=n) return arr;
        //i++;
        arr[i] = arr[i-1] + arr[i-2];
        //int last = recurFibonacciNumbers(arr,n-1,i);
        //int sec_last = recurFibonacciNumbers(arr,n-2,i);
        return recurFibonacciNumbers(arr,n,++i);
    }
}
