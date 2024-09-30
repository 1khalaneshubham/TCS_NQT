public class Max_SubArraySum {

    public static void KadansAlg(int arr[]){
        int MS = Integer.MIN_VALUE;
        int CS = 0;

        for(int i = 0; i<arr.length; i++){
            CS = CS+arr[i];
            if(CS < 0){
                CS = 0;
            }
            MS = Math.max(CS,MS);
        }
        System.out.println("Max Sum-SubArray is:"+MS);
    }
    public static void main(String[] args) {
        // int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        int numbers[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        KadansAlg(numbers);
    }
}
