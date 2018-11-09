package pieper_guessing.game;
import java.util.Scanner;
//Activity 4
public class Pieper_guessingGame {


    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 1000 to guess");
        int ans = sc2.nextInt();
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 1000");
        int tbg = sc.nextInt();
        
        if (tbg < ans && ans %2!=0){
                 System.out.println("Too Low"
                        + "\n The number is odd");
            }
            else if (tbg < ans && ans %2==0){
               System.out.println("Too Low"
                        + "\n The number is even");
            }
            else if (tbg > ans && ans %2!=0){
                System.out.println("Too High"
                        + "\n The number is odd");
            }
            else if (tbg > ans && ans %2==0){
                System.out.println("Too High"
                        + "\n The number is even");
            }
        
      while (tbg != ans){
            tbg = sc.nextInt();
            
            if (tbg < ans && ans %2!=0){
                 System.out.println("Too Low"
                        + "\n The number is odd");
            }
            else if (tbg < ans && ans %2==0){
               System.out.println("Too Low"
                        + "\n The number is even");
            }
            else if (tbg > ans && ans %2!=0){
                System.out.println("Too High"
                        + "\n The number is odd");
            }
            else if (tbg > ans && ans %2==0){
                System.out.println("Too High"
                        + "\n The number is even");
            }
        }
        System.out.println("Correct!");
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
