/*
*Find Second Smallest and Second Largest Element in an array >(Best Solution)
*/
import java.util.*;
public class CodeThree {
    static private int SmallestArr(int arr[],int n){
        if(n < 2){
            return -1;
        }
        int Smallest_Arr = Integer.MAX_VALUE;
        int SmallestS = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < Smallest_Arr){
                SmallestS = Smallest_Arr;
                Smallest_Arr = arr[i];
            }else if(arr[i] < SmallestS && arr[i] != Smallest_Arr){
                SmallestS = Smallest_Arr;
            }
        }
        return SmallestS;
    }
    static private int LargestArr(int arr[],int n){
        if(n < 2){
            return -1;
        }
        int Largest_Arr = Integer.MIN_VALUE;
        int LargestS = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > Largest_Arr){
                LargestS = Largest_Arr;
                Largest_Arr = arr[i];
            }
            else if(arr[i] > LargestS && arr[i] != Largest_Arr){
                LargestS = arr[i];
            }
        }
        return LargestS;
    }
    public static void main(String args[]){
        int arr1[]= {1,2,4,7,7,5};
        // int arr2[] = {1};
        int n = arr1.length;
        // int n = arr2.length;
        int A =  SmallestArr(arr1, n);
        int AB =  LargestArr(arr1, n);
        System.out.println("Second Smallest:"+A);
        System.out.println("Second Largest:"+AB);
    }
}
