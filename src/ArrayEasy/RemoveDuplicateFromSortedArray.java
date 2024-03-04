package ArrayEasy;

//LEETCODE - 26

class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i =0; //this will be first element
        for(int j = 1;j < nums.length; j++ ){
            if(nums[j] > nums[i]){
                nums[i+1] = nums[j]; //replace duplicate element with unique element
                i++; //increment i
            }
        }
        return i+1;
    }
}


/*
1st approach -> Using SET
add the elements to set.
and add the first n elements of set to array back.
This will take TC ->O(NlogN) + N [For storing in set and adding to array back]
SC -> O(N)

2nd approach -> 2 pointer approach
take 2 pointer i and j
i will be at first j will go till it gets the next number
once the next number gets it will replace the i+1 with that number and move i to the next place
do the same thing

TC -> O(n)
SC -> O(1)
*/

