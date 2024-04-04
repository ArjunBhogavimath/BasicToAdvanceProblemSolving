package ArrayMedium;
//https://leetcode.com/problems/maximum-subarray LC-53
//TC -O(N) SC - O(1)
//KADANE'S ALGORITHM
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        //take a int min
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}