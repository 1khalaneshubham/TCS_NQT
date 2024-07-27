public class ReverseArray1{
    static void codeA(int arr[],int N){
        System.out.print("Reverse Arrays: \n");
        for(int i = 0; i < N; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rev(int arr[],int N){
        int p1 = 0, p2 = N-1;
        while (p1< p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        codeA(arr, N);
    }
  public static void main(String args[]){
      int arr[] = {6,5,4,3,2,1};
      int N = arr.length;
    rev(arr, N);

  }  
}
