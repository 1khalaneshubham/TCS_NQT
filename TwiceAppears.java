public class TwiceAppears {
    // nums = [1, 2, 3, 1]
    // nums = [1, 2, 3, 4]
    // nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
    public static boolean TwiceAppearsNO(int arr[]){
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<i; j++){
                if(arr[i]== arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int nums1[] = {1,2,3,4};
        int nums2[] = {1,1,3,3,4,3,2,4,2};
        int nums3[] = {1,2,3,4,5,6,7,8,9};

        System.out.println("Given Output for Num:"+TwiceAppearsNO(nums));
        System.out.println("Given Output for Num1:"+TwiceAppearsNO(nums1));
        System.out.println("Given Outout for Num2:"+TwiceAppearsNO(nums2));
        System.out.println("Given Outout for Num3:"+TwiceAppearsNO(nums3));
    }
}
