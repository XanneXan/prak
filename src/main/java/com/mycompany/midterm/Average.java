
package com.mycompany.midterm;
import java.util.*;
public class Average {
     public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
          
        double FirstTerm , SecondTerm , ThirdTerm , FourthTerm, FifthTerm , sum , quotient;
        
         System.out.println("Enter Grade in First Term");
         FirstTerm= scan.nextDouble();
         System.out.println("Enter Grade in Second Term");
         SecondTerm= scan.nextDouble();
         System.out.println("Enter Grade in Third Term");
         ThirdTerm= scan.nextDouble();
         System.out.println("Enter Grade in Fourth Term");
         FourthTerm= scan.nextDouble();
         System.out.println("Enter Grade in Fifth Term");
         FifthTerm= scan.nextDouble();
         
         int total = 5;
                 
         sum =  FirstTerm + SecondTerm + ThirdTerm + FourthTerm + FifthTerm;
         quotient = sum / total;
         
         System.out.println("The average is " + quotient);
     }
}
