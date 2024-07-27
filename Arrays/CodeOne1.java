/* Problem Statement: Given an array, we have to find the smallest element in the array.
*/
import java.util.*;
public class CodeOne1 {
    public static void main(String args[]){
        int arr1[] = {2,5,1,3,0};
        System.out.println("Smallest Array: "+SmallArr(arr1));
        int arr2[] = {8,10,5,7,9};
        System.out.println("Smallest Array: "+SmallArr(arr2));
    }
    static int SmallArr(int arr[]){

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];  
            }
        }
        return min;
    }
}
