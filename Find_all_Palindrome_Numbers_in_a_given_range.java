import java.util.*;
public class Find_all_Palindrome_Numbers_in_a_given_range {
    /*
    Example 1:
    Input: min = 10 , max = 50
    Output: 11 22 33 44 
    Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.
    
    Example2:
    Input: min = 100 , max = 150
    Output: 101 111 121 131 141 
    Explanation: 11, 22, 33, 44 will remain the same when they read from forward or backward.
    * 
    */

    public static boolean Ispalindrome(int n){
        int Num = n;
        int RevNo = 0;

        while(Num > 0){
            int Remd = Num % 10;
            RevNo = RevNo * 10 + Remd;
            Num = Num/10;
        }
        
        if(RevNo == n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        // Case - 1
        // int N = 10;
        // int M = 55;
        // Case - 2
        int N = 100;
        int M = 150;

        for(int i = N; i<=M; i++){
            if(Ispalindrome(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
