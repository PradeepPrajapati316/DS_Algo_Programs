package Sorting_Algorithms;

public class StringBubbleSort {

    public static void main(String[] args) {
        //Initialized and string type array.
        String[] a = {"Pradeep", "Ashwin", "Mukesh", "Ekta", "Omkar", "Shani", "Neha"};

        //Declare a variable for swapping vlaues
        String temp;
        
        for (int i = 0; i < a.length; i++)
        {
            int flag = 0;
            for (int j = 0; j < a.length - 1-i; j++)
            {
                //Used compareTo function to check string order
                if (a[j].compareTo(a[j + 1])>0)
                {
                    //Swapping the values
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            //If array is already sorted then, terminate loop
            //It
            if (flag == 0) {
                break;
            }
        }
        //Printing the array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
