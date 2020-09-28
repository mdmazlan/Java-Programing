package com.mdmazlan.javacode.com;

import javax.swing.JOptionPane;

/**
 *
 * @author MAZLAN
 */
public class MassageDialog {
       public static void main (String[] args){
        
       String Name;
       
        Name = JOptionPane.showInputDialog("what is your name ?");
        JOptionPane.showMessageDialog(null,"Welcome:) your name is "+ Name);     
        
    } 
}