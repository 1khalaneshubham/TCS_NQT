import java.util.*;
public class InbuiltSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // Method
        Arrays.sort(arr);
        // for 0 to 5
        // => Arrays.sort(arr,0,3);
        // Print array
        for(int i=0; i<arr.length; i++){
            System.out.print(+arr[i]+" ");
        }
        System.out.println();
    }
}
