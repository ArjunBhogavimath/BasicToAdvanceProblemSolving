package ArrayEasy;

//L C - 283
public class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0){
                j = i;
                break;//need to exit after getting the 0 index
            }
        }
        if(j != -1) {
            for(int i=j+1;i<n;i++){
                if(nums[i] != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                }
            }
        }
    }
}

/*
brute foruce :
store non zero in new array. and store it back in original array from beginning
and remaning fill by 0
/

optimal :
2 pointer
take i and j . j to store index.
swap if we get 0
*/