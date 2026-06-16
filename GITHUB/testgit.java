package first.GITHUB;
import java.util.Scanner;
public class testgit {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a ;
        int b ;
       Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.println("The sum of a and b is: " + (a+b));
        System .out.println("The difference of a and b is: " + (a-b));
        System.out.println("The product of a and b is: " + (a*b));  
    if ( b != 0 ) {
          System.out.println("The quotient of a and b is: " + (a/b));
    } else {
            System.out.println("Cannot divide by zero");
    }
    }

    
}