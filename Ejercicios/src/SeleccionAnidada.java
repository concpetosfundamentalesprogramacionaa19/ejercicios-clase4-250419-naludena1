
import java.util.Scanner;
import paquetedos.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nali1
 */
public class SeleccionAnidada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // documentacion
        String miMensaje = OperacionDos.mensaje;
        String miMensajeDos = OperacionDos.mensajeDos;
        String miMensajeTres = OperacionDos.mensajeTres;
        String miMensajeCuatro = OperacionDos.mensajeCuatro;
        
        int calificacion;
        
        
        System.out.println("Ingrese la primera calificacion");
        calificacion = entrada.nextInt();
        
        
        
        if (calificacion >= 90){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }else {
          if (calificacion < 90 && calificacion >= 80) {
              System.out.printf("%s %d\n",miMensajeDos,calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                  System.out.printf("%s %d\n", miMensajeTres, calificacion);
                } else {
                  System.out.printf("%s %d\n",miMensajeCuatro, calificacion );
                }
            } 
        }
    }   
}
    

