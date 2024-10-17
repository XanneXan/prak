
package com.mycompany.midterm;
import java.util.*; 
public class online {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        
        String municipality;
        
        System.out.println(" Enter Municipality :");
        municipality=scan.next();
        
        if (municipality.equalsIgnoreCase("Calamba"))
        { 
            System.out.println("Barangay:");
        }
        else
        {
            System.out.println("Username or password invalid");
        }
        
    }
}
