package ArrayMedium;
//LC --> https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
public class ReArrangeArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int positiveIndex = 0; //the positibe number will be in even places
        int negativeIndex = 1; // the negtaive will be in odd places
        for(int i =0; i<n; i++){
            if(nums[i] > 0){
                ans[positiveIndex] = nums[i];
                positiveIndex +=2;
            }
            else{
                ans[negativeIndex] = nums[i];
                negativeIndex +=2;
            }
        }
        return ans;
    }
}

/*
Algorithm
Brute force :
 take 2 arrays pos and neg of n/2 size
 fill them with corresonding value
 and later mix them in alternative manner
 takes TC -O(2N) SC -> O(N)

Optimal Solution:
 Take ans array of size n
 and take index for neg and pos as 1 and 0
 beause positive numbers will be in even and negative will be in odd index
 now start iterating array and check if the value pos or neg.
 if pos add at ans of posIndex and increment posIndex by 2
 and do the same for negIndex
 return ans
 TC -> O(N) SC ->O(N)
*/