package Sorting;

import java.util.Scanner;

//Selection sort is a basic algorithm
//it takes each element form beginning and swap it with the lowest number in the array, 1 at a time
//it will swap till n-2

//Time Complexity : O(n2) nsquare
public class SelectionSort {
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
        selectionSortImplementation(arr, arr_size);
    }

    private static void selectionSortImplementation(int[] arr, int size) {
        //need to create a for loop to traverse in array till n-2
        for(int i=0;i<size-2;i++){
            //lets consider arr[i] as smallest number
            int min = i;
            //run a second loop from i to n-1 so we can check for smallest number and swap it with the current number
            for (int j=i;j<=size-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            //need to swap the numbers now
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int num : arr){
            System.out.println(num);
        }
    }
}
