
import java.util.Scanner;
import paquetedos.Operacion;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nali1
 */
public class SeleccionDoble {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
        
        // método principal
        
        String miMensaje = Operacion.mensaje;
        String miMensajeDos = Operacion.mensajeDos;
        int calificacion;
        int calificacion_2;
        
        
        System.out.println("Ingrese la primera calificacion");
        calificacion = entrada.nextInt();
        
        System.out.println("Ingrese la segunda calificación");
        calificacion_2 = entrada.nextInt();
        
        if (calificacion>=85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
            
            
        } else {
            System.out.printf("%s %d\n", miMensajeDos, calificacion);
            
        }
        
        if (calificacion_2>= 85) {
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        } else {
           System.out.printf("%s %d\n", miMensajeDos, calificacion_2); 
        }
    
        }
    }
    
    
    

