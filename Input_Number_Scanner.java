package com.mdmazlan.javacode.com;

import javax.swing.JOptionPane;

/**
 *
 * @author MAZLAN
 */

public class Input_Number_Scanner {
    
    public static void main (String [] args){
        
        //Variables
        
       String a,b;
       
              
       a= JOptionPane.showInputDialog("Enter value 1= ");
       int value1=Integer.parseInt(a);
       b= JOptionPane.showInputDialog("Enter value 2= ");
       int value2=Integer.parseInt(b);
       //Summation 
       int sum = value1+value2;
       
       JOptionPane.showMessageDialog(null,+ sum);    
       
    }
}