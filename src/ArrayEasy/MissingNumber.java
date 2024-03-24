package ArrayEasy;
//L C -->268
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i =0;i<n;i++){
            sum2 += nums[i];
        }
        return total_sum - sum2;
    }
}

/*
B F : take 2 loops and check if the number is present from 1 to N
 TC- O(n2) SC -O(1)

Better : hashing

Optimal : sumation of n number and sum of array differnece will be the missing number.
summation of n number --> n(n+1)/2
TC: O(N) SC : O(1)
*/