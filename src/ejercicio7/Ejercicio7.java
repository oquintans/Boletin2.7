/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n,i,t,total;
        
        System.out.println("Nominal:");
        Scanner dato=new Scanner(System.in);
        n=dato.nextFloat();
        System.out.println("Interes Anual %:");
        i=dato.nextFloat();
        System.out.println("Años:");
        t=dato.nextFloat();
        
        total=n*i*t/1200;
        System.out.println("Renta Mensual="+total);
       
        
    }
    
}
