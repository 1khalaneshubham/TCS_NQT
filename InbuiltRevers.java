import java.util.*;
public class InbuiltRevers {
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2,-1,-4,-6,-10};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }   
}
