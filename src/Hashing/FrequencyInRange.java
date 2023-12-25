package Hashing;

//Coding Ninjas Frequency in range
//1.6 HASHING

public class FrequencyInRange {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int hash_arr[] = new int[n];

        //pre-computing adding all the values to hash array
        for(int i=0;i<n;i++){
            if(nums[i]<=n){
                hash_arr[nums[i]-1]++;
            }
        }
        return hash_arr;
    }
}

//you only need to return the same length of the input array
//so only fill the array of length n not x

//1st we do pre computing
//which means created a hash array and stored the frequency of the elements
//and that to store till length is same as n
//and return the hash array