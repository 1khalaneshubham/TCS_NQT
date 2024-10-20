public class Check_if_a_number_is_Armstrong_Number_or_not {
    /*
    Example 1:
    Input:N = 153
    Output:True
    Explanation: 13+53+33 = 1 + 125 + 27 = 153
    
    Example 2:
    Input:N = 371                
    Output: True
    Explanation: 33+53+13 = 27 + 343 + 1 = 371
 */
  public static boolean IsArmstrongNo(int Num){

    int k = String.valueOf(Num).length();
    int Sum = 0;
    int n = Num;
    while(n > 0){
        int id = n%10;
        Sum += Math.pow(id,k);
        n = n/10;
    }
    return Sum == Num ? true : false;
  }
  public static void main(String args[]){
    // int N = 153;
    int N = 371;
    
    if(IsArmstrongNo(N)){
        System.out.println(N+" : Is Armstrong Number");
    }else{
        System.out.println("Is Not Armstrong Number");
    }
  }
}
