package Sorting;

import java.util.Scanner;

//Merge sort is basically a divide and merge sort
//the array will be divided into half and do the same thing till only 1 element is left
//and after that we can merge back from last in sorted way
//this all should be done based on indexing
//so there is no extra array will be created to divide array

//first the array will be halved,
//if the array is odd we can assume 2 is greater

//Time complexity -> O(nlogn)
//Space Complexity -> O(N)

public class MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr_size = 0;
        System.out.println("Enter the array size : ");
        if(sc.hasNextInt()){
            arr_size = sc.nextInt();
        }
        System.out.println("Enter the array elements : ");
        //sc.nextLine();
        int[] arr = new int[arr_size];
        for(int i = 0;i<arr_size;i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
                System.out.println(" element added to the array :  "+arr[i]);
            }
        }
        System.out.println("This is the sorted array--->");
        mergeSort(arr, 0,arr.length);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        //base case
        if(low >= high) return; //the low and high will be equal when only 1 element is there

        //we need mid point
        int mid = (low+high)/2;
        mergeSort(arr,0,mid); //this will take care of the left part
        mergeSort(arr,mid+1,high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high];

        //i need 2 variables to identify 2 arrays as left and right array
        int left = low;
        int right = mid+1;

        //I need to merge both arrays and store it in temp array

        while(left<=mid && right<=high){ //the loop will run till both array have elements
            int i = low;
            if(arr[left]<=arr[right]){
                temp[i] = arr[left];
                i++;
                left++;
            } else{
                temp[i] = arr[right];
                i++;
                right++;
            }
        }
        for(int i = low;i<=high;i++){
            arr[i] = temp[i];
        }

        //not completed

    }
}
