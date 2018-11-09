package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        //Activity 1: Age
        Scanner sc = new Scanner(System.in);
        System.out.println("Age: ");
        int a = sc.nextInt();
        
        if (a<=2){
            System.out.println("Child");
        }else if (a>=3 && a<=5){
            System.out.println("Todller");
        }else if (a>=6 && a<=12){
            System.out.println("Child");
        }else if (a>=13 && a<=18){
            System.out.println("Teen");    
        }else if (a>=19 && a<=34){
            System.out.println("Young Adult");
        }else if (a>=35 && a<=59){
            System.out.println("Adult");
        }else if (a>=60){
            System.out.println("Senior");
        }
        
        
        
        //Activity 2: Calculator
        Scanner calc = new Scanner(System.in);
        System.out.println("Operator( / , * , - , + )");
        String mth = calc.nextLine();
        
        switch (mth){
            case "+":
                System.out.println("First number: ");
                int ad1 = calc.nextInt();
                System.out.println("Second number: ");
                int ad2 = calc.nextInt();
                
                int adt = ad1+ad2;
                System.out.println("Sum is: " + adt);
                    break;
                
                case "-":
                System.out.println("First number: ");
                int sb1 = calc.nextInt();
                System.out.println("Second number: ");
                int sb2 = calc.nextInt();
                
                int sbt = sb1-sb2;
                System.out.println("Difference is: " + sbt);
                    break;
                
                case "*":
                System.out.println("First number: ");
                int m1 = calc.nextInt();
                System.out.println("Second number: ");
                int m2 = calc.nextInt();
                
                int mt = m1*m2;
                System.out.println("Product is: " + mt);
                    break;
                
                case "/":
                System.out.println("First number: ");
                int d1 = calc.nextInt();
                System.out.println("Second number: ");
                int d2 = calc.nextInt();
                
                int dt = d1/d2;
                System.out.println("Qoutient is: " + dt);
                    break;
                
                default:
                    System.out.println("N/A");
                    break;
        }
        
        
        //Acitivity 3: Courses
        Scanner crs = new Scanner(System.in);
        System.out.println("[1]COA, [2]CEA, [3]CITCS, [4]CTE, [5]CAS, or [6]CBA?");
        int cor = crs.nextInt();
        
        if (cor == 1){
            System.out.println("College of Accountancy\n" +
"\n" +
"The College of Accountancy provides an educational program through which students can prepare themselves for accounting, accounting related endeavors, and increasing levels of responsibility in business and society."
                    + "\n Graduates should acquire a broad liberal education, effective personal skills, a life-long quest for knowledge, and a global perspective that will enable them to contribute to their profession and to the world.");
            
            System.out.println("COA Programs:"
                    + "\n BS in Accountancy"
                    + "\n BS in Accounting Technology"
                    + "\n BS in Management Accounting"
                    + "\n BS in Forensic Accounting"); 
        }else if (cor == 2);
            System.out.println("College of Engineering and Architecture\n" +
"\n" +
"The college aims to contribute a valuable share in the country's physical development, in the modernization of its infrastructures, and in improving the material comforts of man."
                    + "\n Its contribution to nation building assumes visible form and directly affects regional landscapes."
                    + "\n The Engineering & Architecture disciplines cover such an expansive area that comprehensive training in these professions encompasses liberal education as well.");
            System.out.println("CEA Programs:"
                    + "\n BS in Architecture"
                    + "\n BS in Civil Engineering");
    }
    
}
