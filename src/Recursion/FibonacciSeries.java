package Recursion;

//509. Fibanocci Number
//leetcode
class FibonacciSeries{
    public int fib(int n) {
        if(n<=1) return n;
        int last = fib(n-1);
        int sec_last = fib(n-2);
        return last+sec_last;
    }
}

//Recursion
//multiplle recursion calls will be there
//fibanocci number is nothing but sum of last 2 number(n-1 & n-2);
//so we add the last 2 numbers  and return
