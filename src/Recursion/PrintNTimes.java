package Recursion;

//print N times string
//CODING NINJAS
//1.5 BASIC RECURSION STRIVER
public class PrintNTimes {
    public static void printNtimes(int n){
        // Write your code here.
        if(n<1){
            return;
        }
        System.out.print("Coding Ninjas ");
        n--;
        printNtimes(n);
    }
}

//declare basecase properly
//if the n becomes less than 1 we should return
//otherwise print the string and decrement n
//and call the function again
