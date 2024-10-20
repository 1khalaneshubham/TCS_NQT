import java.util.*;
public class Check_whether_a_given_number_is_even_or_odd {
    /*
Example 1:
Input: n=5
Output: odd
Explanation: 5 is not divisible by 2.
 
Example 2:  
Input: n=6
Output: even
Explanation: 6 is divisible by 2. 
     */
    public static void main(String[] args){
        int N = 5;

        if(N%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

}
