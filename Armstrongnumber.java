/*
 * Write a program to find whether given number is Armstrong or not
 */
package armstrongnumber;

import java.util.Scanner;
public class Armstrongnumber {

    
    public static void main(String[] args) {
        
        int c=0,a,temp,n;  
        
        System.out.println("Enter your number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        temp=n;  
        while(n>0)  
        {  
        a=n%10;  
        n=n/10;  
        c=c+(a*a*a);  
        }  
        if(temp==c)  
        System.out.println("armstrong number");   
        else  
            System.out.println("Not armstrong number");   
       }  
    }  
        
    
