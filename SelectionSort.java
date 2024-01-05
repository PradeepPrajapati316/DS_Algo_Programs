package Sorting_Algorithms;

public class SelectionSort {
    public static void main(String[] args){
        //Initialized and int type array.
        int[] arr = {74, 34, 57, 12, 28, 84, 24};

        //Storing length of array in n variable
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int min_index = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[min_index] > arr[j])
                    min_index = j;
            }

            //Swapping the value of smallest number in array
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        //Printing the sorted array
        System.out.print("Sorted Array is : ");
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
