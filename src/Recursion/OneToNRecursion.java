package Recursion;

import java.util.Scanner;

//1 to N array without loop
//RECURSION
//1.5 LEARN BASIC RECURSION
public class OneToNRecursion {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printNos(x);
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr = new int[x];
        return recurNum(arr,0,x);
    }
    private static int[] recurNum(int[] arr,int num, int x){
        arr[num] = num+1;
        if(num==x-1){
            return arr;
        }
        recurNum(arr, num+1,x);
        return arr;
    }

}

//CReate a empty array with x lenght
//create a new method and call it and pass arr,0,x
//it will add to the array till n elements and it will return array.

