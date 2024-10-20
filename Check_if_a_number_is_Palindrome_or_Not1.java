/* 
Example 1:
Input:N = 4554
Output:Palindrome Number

Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number

Example 2:
Input:N = 7789                
Output: Not Palindrome

Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome
*/   
public class Check_if_a_number_is_Palindrome_or_Not1 {
    public static boolean Ispalindrome(int x){
        int Num = x;
        int RevSNo = 0;

        while(Num > 0){
            int RemD = Num % 10;
            RevSNo = (RevSNo * 10)+ RemD;
            Num = Num/10;
        }
        return RevSNo == x; //  Compare original number with reversed 
    }
    public static void main(String args[]){
        int N = 1221;
        int M = 1234678;

        System.out.println(Ispalindrome(N));
        System.out.println(Ispalindrome(M));
    }
}

    


