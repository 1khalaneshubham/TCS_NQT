/*
Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.
*/
import java.util.*;
public class Find_the_smallest_element_in_an_array {   
    public static int SmallestE(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String args[]){
        int arr1[] = {2,5,1,3,0};
        int arr2[] = {8,10,5,7,9};

        System.out.println("Output: "+SmallestE(arr1));
        System.out.println("Output: "+SmallestE(arr2));
    }
}