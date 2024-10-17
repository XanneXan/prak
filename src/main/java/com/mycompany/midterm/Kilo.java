
package com.mycompany.midterm;
import java.util.*;
public class Kilo {
     public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
          
        double Kilo , lbs , quotient , product;
        
         System.out.println("Enter Kilograms:");
         Kilo= scan.nextDouble();
         System.out.println("Enter Pounds:");
         lbs= scan.nextDouble();
         
         float total = 2.20462f;
                 
        quotient = lbs / total;
        product = Kilo * total;
         
         System.out.println("The conversion of Kilograms to Pounds is " + product);
         System.out.println("The conversion of Pounds to Kilogram is " + quotient);
     }
}

