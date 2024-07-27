/*
*Find Second Smallest and Second Largest Element in an array
*/
import java.util.*;
public class CodeThree1 {
    static private void GetElement(int arr[],int n){
        if(n == 0 || n==1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");     
        }
        Arrays.sort(arr);
        int SmallestS = arr[1];
        int largestS = arr[n-3];
        System.out.println("Smallest second:"+SmallestS);
        System.out.println("Largest second:"+largestS);
    }
    public static void main(String arsg[]){
        // int arr1[] = {1,2,4,7,7,5};
        int arr2[] = {1};
        int n = arr2.length;
        GetElement(arr2, n);
    }
}
