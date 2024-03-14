package ArrayEasy;
//TC: o(n)
//SC : O(1)
public class ArrayLeftRotateBy1 {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.

        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }
}

/*
for rotating 1 place we dont need to do anything
1. just store the 1st element in temp variable
2. move 1 value down the array using for loop
3. replace the last index by temp variable
*/

