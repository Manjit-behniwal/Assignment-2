/*
 Write a proram to find the fibonecci series of a given number
 */
package fibonecci;
import java.util.Scanner;

public class Fibonecci {

public static void main(String[] args) {
            
     int n1=0,n2=1,n3,i,a;    
     System.out.print("Enter required number "); 
     Scanner in = new Scanner(System.in);
     a = in.nextInt();
     System.out.print(n1+" "+n2); 
        
     for(i=2;i<a;++i)
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
      
    }}  
    
