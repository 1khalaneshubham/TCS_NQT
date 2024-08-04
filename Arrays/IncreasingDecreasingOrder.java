/*
 * Problem Statement: Rearrange the array such that the first half is arranged in increasing order, 
 * and the second half is arranged in decreasing order
*/
import java.util.*;
public class IncreasingDecreasingOrder {
    public static void main(String[] args){
        int arr[] = {8,7,1,6,5,9};
        int n = arr.length;
        Arrays.sort(arr);
        
        System.out.println("Array in Increasing:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        System.out.print("Array in Decreasing:\n");
        for(int i = n-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
}
