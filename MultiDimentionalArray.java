package multi.dimentional.array;


import java.util.Scanner;

public class MultiDimentionalArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter row size: ");
        int r = sc.nextInt();
        System.out.println("Enter column size: ");
        int c = sc.nextInt();
        
        System.out.println("Enter elements: ");
        int[][] rc = new int[r][c];              
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                        rc[i][j] = sc.nextInt();
                }
            }
        
        System.out.println("Array: ");
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    System.out.print(rc[i][j]+"\t");
                }
                System.out.println();
            }
        


    }
    
}