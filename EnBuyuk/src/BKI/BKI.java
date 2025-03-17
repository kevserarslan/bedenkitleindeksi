/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BKI;

import java.util.Scanner;

/**
 *
 * @author Kevser
 */
public class BKI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.println("kilonuzu giriniz:");    
        int kilo = scanner.nextInt();
        System.out.println("boyunuzu giriniz(1,70):");
        double boy = scanner.nextDouble();
        
        double bki = kilo / boy * boy ;
        
        
        if(bki< 18.5){
            System.out.println("Zayifsiniz");
            
        } 
        else if(bki> 18.5 && bki > 25){
            System.out.println("Kilonuz normal");
            
            
        }
        else {
            System.out.println("obezite tehlikesinzdesiniz.");
        }
    }
    
}
