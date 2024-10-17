package com.mycompany.midterm;
import java.util.*;
public class positiveneg {
        public static void main(String[]args){
            Scanner scan= new Scanner (System.in);
        double num;
            System.out.println("Enter a number: ");
            num= scan.nextInt();

if (num < 0){
     System.out.println("The number is negative");
        }          
else if (num == 0){
     System.out.println("The number is positive");
        }
            
else System.out.println("The number is neutral");

        }
}
   
       

