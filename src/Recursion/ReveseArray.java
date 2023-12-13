package Recursion;

//1.5 Recursion
//reverse array coding ninjas
public class ReveseArray {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        return revFunc(n,nums,0);
    }
    public static int[] revFunc(int n,int[] nums, int i){
        if(i>=n/2) return nums;
        //swapping of numbers using xor operator
        nums[i] = nums[i]^nums[n-i-1];
        nums[n-i-1] = nums[i]^nums[n-i-1];
        nums[i] = nums[i]^nums[n-i-1];
        return revFunc(n, nums, ++i);
    }

}

//create 1 empty array with lenght n
//call recursive method and pass new array nums array and n and 1(needed for indexing)
//in base case we check if the i-1 is = nums length if yes return array
//otherwise add last element of the array to the first place
// and increment and decremet i and n resp.
//and call recur function again with new values
/*Not optimal solution
 int[] revArr = new int[n];
        return recurRevArray(revArr,nums,n,1);
    }
    public static int[] recurRevArray(int[] revArr, int nums[],int n,int i){
        if(i-1==nums.length) return revArr;
        revArr[i-1] = nums[--n];
        i++;
        return recurRevArray(revArr, nums, n, i);
    }
*/

//Optimal solution,
//take 2 pointers like left and right, left(0) right(n-1)
//but we can do it using 1 pointer it self
//i.e., i= 0 (first/left) i=n-i-1(right)
//we can swap the numbers in that place
//and base case will be it will run till n/2
