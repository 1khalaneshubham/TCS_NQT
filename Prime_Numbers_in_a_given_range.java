import java.util.*;
class Prime_Numbers_in_a_given_range {
    /*
     Examples:
     Input: 2 10
     Output: 2 3 5 7 
     Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.
     
     Example 2:
     Input: 10 16
     Output: 11 13 
     Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.
     
     */
    public static boolean IsPrimeNoRange(int n){
        if( n == 2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        // Case -1
        // int n = 2;
        // int y = 10;

        // Case -2
        int n = 10;
        int y = 100;

        for(int i = n; i <= y; i++){
            if(IsPrimeNoRange(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
