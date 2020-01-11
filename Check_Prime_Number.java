
package com.mdmazlan.javacode.com;

import java.util.Scanner;

/**
 *
 * @author MAZLAN
 */
public class Check_Prime_Number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        //condition check 
         if(n<2){
            System.out.println("This is Not Prime Number!");
            sc.close();
            return;
        }
        
        for(int i=2;i<=n/2;i++){
            
            if(n%i==0){
                System.out.println("This is Not Prime Number!");
                sc.close();
                return;
            }
        }
       System.out.println("This is a Prime Number !!!");
       sc.close();
    }
    
}