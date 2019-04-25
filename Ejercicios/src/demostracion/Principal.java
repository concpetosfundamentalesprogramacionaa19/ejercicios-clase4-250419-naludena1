/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author nali1
 */
public class Principal {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    double mensajes;
    double tarifa;
    double precioPagar;
    
        
        // entrada de datos
        System.out.println("Ingrese el número de mensajes enviados");
        mensajes = entrada.nextInt();
        
        // Cálculo de la tarifa base
        if (mensajes <= 40){
            tarifa = 3;
            precioPagar = (3*0.12)+ tarifa;
            System.out.printf("El valor a pagar es de %.2f", precioPagar);
            
            
        }else {
            // Cálculo de la tarifa si los mensajes son mayores a 40 y menores a 200
            if (mensajes >40 && mensajes <= 200){
                tarifa = (3 + (mensajes-40) * 0.05);
                precioPagar = ((tarifa*0.12)+ tarifa);
                System.out.printf("El valor a pagar es de %.2f", 
                        precioPagar);
                
            }else {
                // Cálculo de la tarifa si los mensajes son mayores a 200
                if (mensajes >200) {
                    
                    tarifa = 3;
                    tarifa = (tarifa + (mensajes-200)*0.10);
                    precioPagar =   (tarifa *0.12)+ tarifa;
                     System.out.printf("El valor a pagar es de %.2f", 
                        precioPagar);
                    
                }
            }
        
        }
        
        
        
        
        
        
        
        
        
        
    }  
}
