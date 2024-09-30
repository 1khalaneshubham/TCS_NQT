public class Pairs_in_Array {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        PairsPrint(arr);
        // System.out.println(PairsPrint(arr));
    }
    public static void PairsPrint(int arr[]){
        
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j<arr.length; j++){
                System.out.print("("+curr+","+(arr[j]+")"));
                count++;
            }
            System.out.println();
        }
        System.out.println("Count is:"+count);
    }
}
