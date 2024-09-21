/*
 * Find the Largest element in an array
 * 
 * Example 1:
 * Input:
 * arr[] = {2,5,1,3,0};
 * Output:
 * 5
 * Explanation:
 * 5 is the largest element in the array. 
 * Example2:
 * Input:
 * arr[] = {8,10,5,7,9};
 * Output:
 * 10
 * Explanation:
 * 10 is the largest element in the array. 
 */
import java.util.*;
public class Largest_element_in_an_array2 {

    public static void main(String args[]){

        int arr1[] = {2,5,1,3,0};
        int arr2[] = {8,10,5,7,9};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1[arr1.length-1]+" is the largest element in the array.");
        System.out.println(arr2[arr2.length-1]+" is the largest element in the array.");
    }
    
}
