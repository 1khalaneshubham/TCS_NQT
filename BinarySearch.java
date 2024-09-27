public class BinarySearch{
    
    public static int FindA(int arr[],int key){
    
        int start = 0;
        int end = arr.length-1;
        // int count = 0;

        while (start <= end) {
            int mid = (start+end)/2;
            
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
            // count++;
        }
        System.out.println("Key not Found");
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,7,8,9,12,13,14,15,16,17,19};
        int key = 9;

        System.out.println("Key index found:"+FindA(arr, key));
    }
}