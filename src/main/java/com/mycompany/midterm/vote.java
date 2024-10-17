package com.mycompany.midterm;
import java.util.*;
public class vote {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int age = 0;
        System.out.println("Enter Age: ");
        age= scan.nextInt();
        
if (age > 17) {
System.out.println("You are eligible to vote!");
}
else{ System.out.println("You are not eligible to vote!");
    }
}
}