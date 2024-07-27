/*
 * Find the Largest element in an array
*/
public class CodeTwo {
    public static void main(String args[]){
        int  arr1[] = {2,5,1,3,0};
        System.out.println(MaxArray(arr1)+" is the largest element in the array.");
        int arr2[] = {8,10,5,7,9};
        System.out.println(MaxArray(arr2)+" is the largest element in the array.");
    }
    static int MaxArray(int arr[]){
        int Max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(Max < arr[i]){
                Max = arr[i];
            }
        }
        return Max;
    }
}
