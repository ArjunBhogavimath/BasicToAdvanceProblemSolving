package Hashing;
//Frequency IN Range
//Using hasH map

import java.util.HashMap;
import java.util.Map;

public class FrequencyInRangeMap {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        Map<Integer, Integer> hash_map = new HashMap<>();
        for(int i =0;i<n;i++){
            //only need to add 1 to x so thi if
            if(nums[i]>=1 && nums[i]<=x){
                hash_map.put(nums[i], hash_map.getOrDefault(nums[i],0)+1);
            }
            //1st value is key and 2nd is value
            //key should be the number, it will act as index
            //for value we use getordefault
            //by this if there is already value present then it will use that and increment
            //or it will just return default 0 and increment

        }
        int ans[] = new int[n];
        for(int i=1;i<=n;i++) {
            ans[i-1] = hash_map.getOrDefault(i, 0);
        }
        //Convert the map to array
        //on how to convert
        //create a array of n size
        //and add the data by getor Default

        return ans;

    }
}