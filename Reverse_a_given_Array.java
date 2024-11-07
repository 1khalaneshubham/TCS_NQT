/*
Problem Statement: You are given an array. The task is to reverse 
the array and print it. 

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, 
the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, 
the second element occupies the fourth position and so on.
*/
import java.util.*;
public class Reverse_a_given_Array {
    public static void Reverse_Array(Integer arr[]){

        List<Integer> list = Arrays.asList(arr);

        Collections.reverse(list);

        System.out.println("Reversed array: "+Arrays.toString(arr));
    }
    public static void main(String args[]){
        
        Integer  arr1[] = {5,4,3,2,1};
        Integer arr2[] = {10,20,30,40};
        Integer arr3[] = { 22,30,10,29,17,15};

        Reverse_Array(arr1);
        Reverse_Array(arr2);
        Reverse_Array(arr3);
    }
}
