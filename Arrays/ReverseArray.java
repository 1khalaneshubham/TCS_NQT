/*
 * Problem Statement 4: You are given an array. The task is to reverse the array and print it.
*/
import java.util.*;
public class ReverseArray {
    // N = 5, arr[] = {5,4,3,2,1}
    // N=6 ,arr[] = {10,20,30,40}

    static void CodeR(Integer arr[],int n){
        System.out.print("Reverses Array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void Mood(Integer arr[]){
        
        Collections.reverse(Arrays.asList(arr));
    }
    /*static void rev(Integer arr[]){
        int end=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp= arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;

        }
    }
    */
    public static void main(String[] args){
        int n = 5;
        Integer arr[] = {5,4,3,2,1};
        Mood(arr);
        CodeR(arr, n);
    }
}
