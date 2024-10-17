
package com.mycompany.midterm;
import java.util.*;
public class Cup {
     public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
          
        double Cup , Ounce , quotient , product;
        
         System.out.println("Enter Cup:");
         Cup= scan.nextDouble();
         System.out.println("Enter Ounce:");
         Ounce= scan.nextDouble();
         
         int total = 8;
                 
        quotient = Ounce / total;
        product = Cup * total;
         
         System.out.println("The conversion of Cup to Ounce is " + product);
         System.out.println("The conversion of Ounce to Cup is " + quotient);
     }
}

