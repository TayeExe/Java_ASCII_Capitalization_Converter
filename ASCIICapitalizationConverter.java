/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asciicapitalizationconverter;

/**
 * Taylor Austin
 * 09.19.2026
 * CITP 190
 * A conversion program that can take a uppercase letter from the user and make it lowercase
 * 
 */
import java.util.Scanner;
public class ASCIICapitalizationConverter {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in); // import scanner
        System.out.println("Welcome to the Capitalization Conveter!");
        System.out.print("Please enter a uppercase number");
        char letter = scanner.next().charAt(0);
    
        char conversion = (char)(letter + 32); // use 32 since the uppercase and lowercase letter in ASCII are 32 away from each other
        System.out.println("The lowercase letter is: " + conversion);
        
       
        
    }
}
