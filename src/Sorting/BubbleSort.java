package Sorting;

import java.util.Scanner;

//Bubble sort :
//comparing adjacent items and swap if the 2nd element is smaller
//do it from 0 to n-1 to 0 to 1,
//T C- O(n2) //(square) -->worst case ||| Best case -->O(n)
public class BubbleSort {
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
        bubbleSort(arr, arr_size);
    }
    public static void bubbleSort(int arr[], int size){
        for(int i=size-1;i>=1;i--){
            int swapHappened = 0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapHappened = 1;
                }
            }
            if(swapHappened == 0)break; //optimization for best time complexity
            //the loop will only run for once and not swap. so the time compl. is O(n) in best case
            System.out.println("runs now");
        }
        for (int num : arr){
            System.out.println(num);
        }
    }
}
