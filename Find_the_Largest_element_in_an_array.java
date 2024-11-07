/*
Problem Statement: Given an array, 
we have to find the largest element in the array.

Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array. 
*/ 
import java.util.*;
public class Find_the_Largest_element_in_an_array {
    public static int LargestE(Integer arr[]){
        Arrays.sort(arr,Collections.reverseOrder());
        return arr[0];
    }
    public static void main(String args[]){
        Integer arr1[] = {2,5,1,3,0};
        Integer arr2[] = {8,10,5,7,9};

        System.out.println("Output: "+LargestE(arr1));
        System.out.println("Output: "+LargestE(arr2));
    }
}
