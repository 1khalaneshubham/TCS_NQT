/*
 * Reverse a given Array
 * 
 * Example 1:
 * Input: N = 5, arr[] = {5,4,3,2,1}
 * Output: {1,2,3,4,5}
 * Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 * Example 2:
 * Input: N=6 arr[] = {10,20,30,40}
 * Output: {40,30,20,10}
 * Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 */

import java.util.*;
public class Reverse_a_given_Array4 {
    static void printReverse(int arr[]){

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int start = 0;
        int End = arr.length-1;

        while (start < End) {
            int temp = arr[start];
            arr[start] = arr[End];
            arr[End] = temp;
            
            start++;
            End--;

        }

        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr1[] = {5,4,3,2,1};
        int arr2[] = {10,20,30,40};

        System.out.println("Reversed array1:");
        printReverse(arr1);
        System.out.println("Reversed array2:");
        printReverse(arr2);
    }
}
