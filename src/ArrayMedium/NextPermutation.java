package ArrayMedium;
//LC --> https://leetcode.com/problems/next-permutation/
//TC --> O(3N) SC -> O(1)
public class NextPermutation {
        public void nextPermutation(int[] nums) {
            int index = -1; //breakpoint
            int n = nums.length;

            //1st step
            for(int i = n-2;i>=0;i--){
                if(nums[i] < nums[i+1]){
                    index = i;
                    break;
                }
            }
            if(index == -1) {//if there is no breakpoint then this is the last perm. so reverse and return
                //reverse
                for (int i = 0; i < n / 2; i++) {
                    int temp = nums[i];
                    nums[i] = nums[n - i - 1];
                    nums[n - i - 1] = temp;
                }
                return;
            }

            //2nd step
            for(int i = n-1;i>index;i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }

            //3rd step
            int start = index+1;
            int end = n-1;

            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }
    }

/*
Steps:
1. Find longest prefix match (a point form start)
a[i]<a[i+1]
store the index
if not there then reverse the array and return. (because it will be the last permutation

2. Find someone who is greater than a[i] in 2nd half
the 2nd half will be in increasing order from end
we need to find the number which is next greter than a[i] and maybe greater than that element can exist
swap(a[i] , found_element in 2nd half)

3. reverse the 2nd half from index , so it will become smaller.

*/




