package ArrayEasy;
//Largest element in array
//Cpding Ninjas

import java.util.* ;
import java.io.*;

public class LargestElement {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest = 0;
        for (int i =0; i<n; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;

    }
}
//the time compexity = O(n), Space Complexity = O(1)
// this is the optimal solution

//the brute force approach for this problem will be sorting the array first
//and getting the last element
// the time complexity for this will be O(nlogn) SC = O(1)
