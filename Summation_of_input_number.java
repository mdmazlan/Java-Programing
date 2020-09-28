
package com.mdmazlan.javacode.com;

/**
 *
 * @author MAZLAN
 */
public class Summation_of_number {
    
    public static void main(String[] args) {
        
        int no=5 ;
        int counter=0;
        
        for(int i=1;i<=no;i++)
        {
        if(i==no)
        {
            System.out.printf("%d = ",i);
            counter = counter+i;
        }
        else
        {
            System.out.printf("%d+",i);
            counter = counter+i;
        }
        }  
        System.out.printf("%d\n",counter);
    }
}