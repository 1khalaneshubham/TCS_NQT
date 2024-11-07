/*
Problem Statement: Given an array, find the second smallest and second 
largest element in the array. Print ‘-1’ in the event that either of 
them doesn’t exist.

Example 1:

Input:
 [1,2,4,7,7,5]
Output:
Second Smallest : 2
Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and 
 second smallest is 2

Example 2:
Input:
 [1]
Output:
Second Smallest : -1
Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and smallest element present in the array. 
 There is no second largest or second smallest element present.
*/
import java.util.*;
public class Find_Second_Smallest_and_Second_Largest_Element {
    public static int SecondSmallestE(int arr[],int n){
        if(n < 2){
            return -1;
        }

        int Smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;
        
        for(int i = 0; i< n; i++){
            if(arr[i] < Smallest){
                SecondSmallest = Smallest;
                Smallest = arr[i];
            }else if(arr[i] < SecondSmallest && arr[i] != Smallest){
                SecondSmallest = arr[i];
            }
        }
        return SecondSmallest;
    }
    public static int SecondlargestE(int arr[],int n){
        if(n<2){
            return -1;
        }

        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] > Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            }else if(arr[i] > SecondLargest && arr[i] != Largest){
                SecondLargest = arr[i];
            }
        }
        return SecondLargest;
    }
    public static void main(String args[]){
        // int arr1[] = {1,2,4,7,7,5};
        // int n = arr1.length;
        
        // System.out.println("Second Smallest: "+SecondSmallestE(arr1, n));
        // System.out.println("Second Largest: "+SecondlargestE(arr1, n));
        
        int arr2[] = {1};
        int n = arr2.length;

        System.out.println("Second Smallest: "+SecondSmallestE(arr2, n));
        System.out.println("Second Largest: "+SecondlargestE(arr2, n));
    }
}
