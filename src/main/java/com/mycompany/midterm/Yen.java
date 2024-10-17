
package com.mycompany.midterm;
import java.util.*;
public class Yen {
     public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
          
        double peso , yen , quotient , product;
        
         System.out.println("Enter Peso:");
         peso= scan.nextDouble();
         System.out.println("Enter Yen:");
         yen= scan.nextDouble();
         
         float total = 0.37f;
                 
        quotient = peso / total;
        product = yen * total;
         
         System.out.println("The conversion of Peso to Yen is " + quotient);
         System.out.println("The conversion of Yen to Peso is " + product);
     }
}

