//1.5 Recursion
//reverse array coding ninjas
public class ReveseArray {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int[] revArr = new int[n];
        return recurRevArray(revArr,nums,n,1);
    }
    public static int[] recurRevArray(int[] revArr, int nums[],int n,int i){
        if(i-1==nums.length) return revArr;
        revArr[i-1] = nums[--n];
        i++;
        return recurRevArray(revArr, nums, n, i);
    }
}

//create 1 empty array with lenght n
//call recursive method and pass new array nums array and n and 1(needed for indexing)
//in base case we check if the i-1 is = nums length if yes return array
//otherwise add last element of the array to the first place
// and increment and decremet i and n resp.
//and call recur function again with new values