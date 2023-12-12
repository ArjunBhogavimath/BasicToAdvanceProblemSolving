//print 1 to n in reverse order
//1.5 BASIC RECURSION
//CODING NINJAS
//STRIVER SHEET
public class NtoOneRecursion {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int[x];
        return recurNum(arr, 0, x);
    }
    public static int[] recurNum(int arr[],int num, int x){
        arr[num] = x;
        if(x-1 == 0){
            return arr;
        }
        num++;
        x--;
        return recurNum(arr, num, x);
    }
}

//create a new recursive method which will have array, num and x as paramter
//now add x in 1st index of array
//write a proper base case where if x-1 becomes 0 then
// we are at the last position so return the array
//now increment num (index of array)
//decrement the number x
//call the recurNum method again
