package BasicMaths;

//1.4 Basic Maths striver problems
//count digits problem coding ninjas
public class CountDigits {
    public static int countDigits(int n){
        // Write your code here.
        int temp = n;
        int count = 0;

        //while loop will run till the digits become zero
        while(temp > 0){
            //rem will have the current digit value
            int rem = 0;
            rem = temp%10;
            //this if will check if the divisor is 0 or not
            if(rem != 0 && n%rem == 0){
                count++;
            }
            //removing the last digit from number
            temp/=10;
        }
        return count;
    }
}

