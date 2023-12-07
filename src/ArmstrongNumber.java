//check armstrong coding ninjas

import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isArmstrong(n);
        System.out.println(isArmstrong(n));

    }
    public static boolean isArmstrong(int n){
        int temp = n;
        int toCompare = n;
        int len = 0;
        int sum = 0;
        while(temp>0){
            temp = temp/10;
            len++;
        }
        while(n>0){
            int current_digit = 0;
            current_digit = n%10;
            sum+=Math.pow(current_digit, len);
            n = n/10;
        }
        if(sum == toCompare) return true;
        return false;
        //System.out.println("this is lenght-->"+len);
    }
}

//get the length of the digits
//get the power of each number and add
//compare and return result
