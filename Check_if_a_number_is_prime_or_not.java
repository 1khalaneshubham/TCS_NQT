public class Check_if_a_number_is_prime_or_not {
    /*
    Example 1:
    Input:N = 2
    Output:True
    Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
    
    Example 2:
    Input:N =10                
    Output: False
    Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10. 
     */
    public static boolean IsPrimeNo(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
     public static void main(String args[]){
        int n = 29;
        System.out.println(IsPrimeNo(n));
     }
}
