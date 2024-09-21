/*
 * Find the smallest element in an array
 * 
 * Example 1:
 * Input: arr[] = {2,5,1,3,0};
 * Output: 0
 * Explanation: 0 is the smallest element in the array. 
 *  Example2: 
 * Input: arr[] = {8,10,5,7,9};
 * Output: 5
 * Explanation: 5 is the smallest element in the array.
 */

import java.util.*;
public class smallest_element_in_an_array1{
    public static void main(String args[]){
        int arr1[] = {2,5,1,3,0};
        int arr2[] = {8,10,5,7,9};

        // Optin 1
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1[0]+" is the smallest element in the array.");
        System.out.println(arr2[0]+" is the smallest element in the array. ");
    } 
}
