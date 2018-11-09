package pieper_areas;
import java.util.Scanner;
public class Pieper_Areas {

    public static void main(String[] args) {
        
        
       //Square
    System.out.println("Enter Side of Square:");
    Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double sarea = s*s; 
    System.out.println("Area of Square is: "+sarea);
       
      //Triangle
    System.out.println("Enter the width of the Triangle:");
        double b = sc.nextDouble();
    System.out.println("Enter the height of the Triangle:");
        double h = sc.nextDouble();
        double tarea = (b* h)/2;
    System.out.println("Area of Triangle is: " + tarea);   
    
      //Circle
    System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * (r * r);
    System.out.println("The area of circle is: " + area);
        double c= Math.PI * 2*r;
    System.out.println( "The circumference of the circle is:"+c) ;
   }
    
    
}
