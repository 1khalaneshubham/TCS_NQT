public class LinearSearch {

    public static int Search(int arr[],int key){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;

        int Result = Search(arr, 10);
        if(Result == -1){
            System.out.println("Key Not Found");
        }else{
            System.out.println("Key Found:"+Result);
        }
    }
}