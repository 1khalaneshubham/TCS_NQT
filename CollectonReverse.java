import java.util.*;
public class CollectonReverse {
    public static void main(String[] args) {
        
        Integer arr[] = {1,2,3,4,5,6,7,8,9};

        List<Integer> list = Arrays.asList(arr);

        Collections.reverse(list);
        
        Integer[] reversedArray = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(reversedArray));

    }
}
