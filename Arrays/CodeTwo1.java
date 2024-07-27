/*
 * Problem Statement: Given an array, we have to find the largest element in the array.
*/
import java.util.*;
public class CodeTwo1 {
    public static void main(String args[]){
        int arr1[] = {2,5,1,3,0};
        System.out.println(sort(arr1)+" is the largest element in the array.");
        int arr2[] = {8,10,5,7,9};
        System.out.println(sort(arr2)+" is the largest element in the array.");
    }
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 1]; 
    }
}
