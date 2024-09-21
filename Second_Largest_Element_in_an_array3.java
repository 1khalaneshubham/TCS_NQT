/*
 * Find Second Smallest and Second Largest Element in an array
 * 
 * Example 1:
 * Input:
 * [1,2,4,7,7,5]
 * Output:
 * Second Smallest : 2
 * Second Largest : 5
 * Explanation:
 * The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
 * Example 2:
 * Input:
 * [1]
 * Output:
 * Second Smallest : -1
 * Second Largest : -1
 * Explanation:
 * Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 * 
 */

import java.util.*;
public class Second_Largest_Element_in_an_array3 {

    static private void GetElement(int arr[],int n){

        Arrays.sort(arr);
        Arrays.sort(arr);

        if (n < 2){
            System.out.println("Second Smallest:"+ -1);
            System.out.println("Second Largest:"+ -1);
        }

        int small = arr[1];
        int large = arr[n - 2];

        System.out.println("Second Smallest:"+small);
        System.out.println("Second Largest:"+large);

    }
    public static void main(String args[]){
        
        int arr1[] = {1,2,4,7,7,5};
        int a = arr1.length;
        int arr2[] = {1};
        int b = arr2.length;

        GetElement(arr1,a);
        GetElement(arr2,b);

    }
}
