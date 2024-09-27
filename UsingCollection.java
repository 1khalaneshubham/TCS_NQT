import java.util.*;
public class UsingCollection {
    public static void main(String args[]){
        // int arr[] = {1,2,3,4,5,6,7,8};
        Integer arr[] = {1,2,3,4,5,6,7,8};

        List<Integer> list = Arrays.asList(arr);

        Collections.reverse(list);

        System.out.println("Reversed Array:"+Arrays.toString(arr));
    }
}
