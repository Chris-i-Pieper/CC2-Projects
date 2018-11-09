package pieper_fibonacci;

    import java.util.Scanner;

public class Pieper_Fibonacci {

    public static void main(String[] args) {
        
        System.out.println("Enter a Number: ");
        int n = new Scanner(System.in).nextInt();
        
        System.out.println("f("+n+")\n");
        
        for (int  i = 0; i <= n; i++){
            System.out.print("f("+i+")\t");
        }
        System.out.println("\n");
        for(int i = 1 ;i<=n;i++){
            System.out.print("0\t");
                for (int j = 1;j<=i;j++){
                    System.out.print(fib2(j)+ "\t");
                }
                System.out.print("\n");
        }
    }
    
     public static int fib1(int n){
         
         if( n == 1 || n == 2){
             return 1;
         }
         
         return fib1(n-1)+fib1(n-2);
    }
        
    public static int  fib2(int n){
        
        if (n == 1 || n == 2){
            return 1;
        }
        int f1 = 1, f2 = 1, fib = 1;
        for (int i = 3; i <= n ;i++){
            fib = f1+f1;
            f1 = f2;
            f2 = fib;
        }
        
        return fib;
    }
    
     
        
}