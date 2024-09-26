public class FoodCard{

    public static int FoodData(String arr[], String foodWant){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(foodWant))  // Use .equals() to compare string values
            {
                return i;  // Return the index if the food is found
            }
        }
        return -1;  // Return -1 if the food is not found
    }

    public static void main(String[] args) {
        String Data[] = {"Edli", "Dhosa", "Paratha", "Masala-Dasha", "Khichadi"};
        String foodWant = "Khichadi";

        int i = FoodData(Data, foodWant);  // Pass Data directly
        if(i == -1 ){  // Check if a valid index is returned
            System.out.println("I don't get Food now");  // Print if food not found
        }else{
            System.out.println("Yes, I got it: " + Data[i]);  // Print the food item found
        }
    }
}
