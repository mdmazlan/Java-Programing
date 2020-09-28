package com.mdmazlan.javacode.com;

import javax.swing.JOptionPane;

/**
 *
 * @author MAZLAN
 */
public class sum_input_massage{
    
    public static void main (String [] args){
        
       String a,b;
       a= JOptionPane.showInputDialog("Enter First value: ");
       int value1=Integer.parseInt(a);
       b= JOptionPane.showInputDialog("Enter Second value: ");
       int value2=Integer.parseInt(b);

       int sum = value1+value2;
       JOptionPane.showMessageDialog(null,+ sum);    
    }
}