public class SmallestArray {

    public static int SEle(int arr[]){
        int SmallestE = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < SmallestE){
                SmallestE = arr[i];
            }
        }
        return SmallestE;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,80,9,0,7,6,5,4,3,20};

        System.out.println("Given samllest Array is:"+SEle(arr));
    }
}
