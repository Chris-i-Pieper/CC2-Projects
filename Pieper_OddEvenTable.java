package pieper_arrays;
// Activity 5
import java.util.Arrays;
import java.util.Scanner;
public class Pieper_OddEvenTable {

    public static void main(String[] args) {
      
        int [] array = {3,9,15,20,65,23,18,4,2,14,21,};
        
        System.out.println("Elements of Array: 3,9,15,20,65,23,18,4,2,14,21"
                + "\n"
                + "\n"
                + "Even \t Odd");
        
        Arrays.sort(array);
        
        int[] odd = new int[array.length];
        int[] even = new int[array.length];
        
        int oddCount = 0;
        int evenCount = 0;
        
        for(int i = 0;i<array.length;i++){
            if(array[i] %2 == 0){
                even [evenCount] = array[i];
                evenCount++;
            }else{
                odd [oddCount] = array[i];
                oddCount++;
            }
        }    
        for(int i = 0; i < oddCount; i++)
            System.out.println(even[i]+"\t"+odd[i]);    
        }
        
    }
    


