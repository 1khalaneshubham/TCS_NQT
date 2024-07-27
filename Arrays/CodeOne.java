/* Problem Statement: Given an array, we have to find the smallest element in the array.
*/

import java.lang.reflect.Array;
import java.util.*;
public class CodeOne{
    public static void main(String args[]){

        int arr1[] = {2,5,1,3,0};
        System.out.println("Small element is:"+ sort(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("Small element is:"+ sort(arr2));
    }
    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
}