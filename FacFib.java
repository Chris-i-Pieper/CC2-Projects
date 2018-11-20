package factorialfibonacci;

import java.util.Scanner;
public class FactorialFibonacci {

    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        String app = "0";
        
        while(app!="1" || app!="2"){
            
                System.out.print("\n\nWhat do you want?\n"
                + "[1] Fibonacci\n"
                + "[2] Factorial\n"
                + " -----------> ");
                app = in.next();
                if(app.equals("1")){
                    app_fibonacci();
                    break;
                }
                if(app.equals("2")){
                    app_factorial();
                    break;
                }
        }
        
        
   }
    
    static void app_fibonacci(){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array -> ");
        int size = sc.nextInt();
        int[] myArray = new int[size];

        for(int i = 0;i<myArray.length;i++){

            System.out.print("number[" + i + "] = ");
            myArray[i] = sc.nextInt();

        }
        System.out.println("\n\nFibonacci Results:\n");
        for(int i = 0;i<myArray.length;i++){
            System.out.print("f(" + myArray[i] + ")\t");

        }
        System.out.println("\n");
        for(int i = 0;i<myArray.length;i++){
            System.out.print(fibonacci(myArray[i]) + "\t");

        }
        
    }
    
    static void app_factorial(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array -> ");
        int size = sc.nextInt();
        int[] myArray = new int[size];

        for(int i = 0;i<myArray.length;i++){

            System.out.print("number[" + i + "] = ");
        myArray[i] = sc.nextInt();

        }
        System.out.println("\n\nFactorial Results:\n");
        for(int i = 0;i<myArray.length;i++){
            System.out.print("f(" + myArray[i] + ")\t");

        }
        System.out.println("\n");
        for(int i = 0;i<myArray.length;i++){
            System.out.print(fact(myArray[i]) + "\t");
        }
    }

    // method for Factorial
    static int fact(int n)
    {
        int output;
        if(n==1){
          return 1;
        }

        output = fact(n-1)* n;
        return output;
    }
    // end
    
    
    // Method for Fibonacci
    public static int fibonacci(int number){
        
        if(number ==1 || number == 2){
            return 1;
        }
        
        return fibonacci(number-1) + fibonacci(number -2); // tail recursion
        
    }
    // End
    
}