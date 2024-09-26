public class LargestCode {
    public static int LargestE(int arr[]){

        int LargestEle = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > LargestEle ){
                LargestEle = arr[i];
            }
        }
        return LargestEle;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,80,9,8,7,6,5,4,3,20};

        // LargestE(arr);
        System.out.println("In given array is Largest Arrey:"+LargestE(arr));
    }
}
