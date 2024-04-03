package ArrayMedium;
//LC --> https://leetcode.com/problems/majority-element/description/ 169
public class MajorityElement {
        public int majorityElement(int[] nums) {
            //Moore's voting alogrithm
            int major_ele = -1;
            int count = 0;
            for(int i =0;i<nums.length;i++){
                if(count == 0 ){
                    major_ele = nums[i];
                    count++;
                }
                else if(nums[i] == major_ele){
                    count++;
                }
                else{
                    count--;
                }
            }

            return major_ele;

        }
    }

/*
brute force
int count;
        int ans = 0;
        for(int i =0;i<nums.length;i++){
            count = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                     count++;
                }
            }
            if(count > nums.length/2) {
                ans = nums[i];
                break;
            }
        }
        return ans;
        */

/*
Better solution --> Using Hashing

Optimal solution --> Usig Moore's voting Algorithm
simple rule
iterate throught array
take a element start counting when same element appers
decrement when othe element came
when count is 0 assign arr[i] to majority element
at last the majority element wont cancel
and we return it

T C -> O(N) SC ->O(1)
 */