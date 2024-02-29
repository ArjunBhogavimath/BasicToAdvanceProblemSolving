package ArrayEasy;
//CODING NINJAS -
//SECOND LARGEST AND SMALLEST ELEMENT IN THE ARRAY
//O(N)

    public class SecondLargest {
        public static int[] getSecondOrderElements(int n, int []a) {
            int largest = a[0];
            int second_largest = -1;
            int smallest = a[0];
            int second_smallest = Integer.MAX_VALUE;//need to take thebig number

            for(int i=1;i<n;i++){
                if(a[i]>largest){
                    second_largest = largest;
                    largest = a[i];
                }
                else if(a[i]<largest && a[i]>second_largest){
                    second_largest = a[i];
                }
                if(a[i]<smallest){
                    second_smallest = smallest;
                    smallest = a[i];
                }
                else if(a[i]>smallest && a[i]<second_smallest){
                    second_smallest = a[i];
                }
            }
            return new int[] {second_largest,second_smallest};

        }
    }

/*1st brute force approcch
Sort the array,
and check from n-2 for second larget element
This will take nlogn+N (sorting+traverse)

2nd better approach
trverse the array find the largest num and store it
and traverse again to check for second largest number
This will take 2n

3rd optimal solution is
traverse array fnd the largest
if you find new largest rpelace second largest with largest and largest with new number
This will take O(n)
*/
