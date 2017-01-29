/*
 Write a program to find the factorial of a given number
 */
package factorial;

import java.util.Scanner;


public class Factorial {

public static void main(String[] args) {
        
int i,fact=1,number;

System.out.println("Enter your Number");

Scanner in = new Scanner(System.in);

number = in.nextInt();

for(i=1;i<=number;i++){
    
fact=fact*i;

}
   System.out.println("Factorial is " + fact);
        
    }
    
}
