 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaejemplo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author osbel
 */
public class JavaEjemplo {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
       var aleatorio = new Random();
       System.out.println("_-_-SISTEMA DE RESERVA DE HOTELES EN JAVA-_-");
       System.out.println("Ingrese su nombre: ");
       var nombre = consola.nextLine();
       
       System.out.println("Ingrse apellido: ");
       var apellido = consola.nextLine();
       
       System.out.println("Ingrese año de nacimiento: ");
       var fechaNacimiento = consola.nextLine();

 //normalizar valores
       var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
       var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
       var fechaNew = fechaNacimiento.trim().substring(2);
        
         var numeroAleatorio = aleatorio.nextInt(9999)+1;
         var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);
         
         var idUnico = nombre2 + apellido2 + fechaNew + numeroAleatorioFormato;
         
         System.out.printf("""
                %nHola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \t¡Felicidades!
                """, nombre, idUnico);

                System.out.println("precio de habitaciones");
         
         int estandar = 900;
         int suite = 1500;
         int premium = 2500;
         
         System.out.println("Habitacion estandar: "+ estandar);
         System.out.println("Habitacion suite : "+ suite );
         System.out.println("Habitacion premium: " + premium);
         System.out.println("Seleccione el tipo de habitación que desea reservar:");
         System.out.println("1. Estándar");
         System.out.println("2. Suite");
         System.out.println("3. Premium");
         
         int opcion = consola.nextInt();
         int precioSeleccionado = 0;

         switch (opcion) {
             case 1:
                 precioSeleccionado = estandar;
                 System.out.println("Ha seleccionado una habitación Estándar.");
                 break;
             case 2:
                 precioSeleccionado = suite;
                 System.out.println("Ha seleccionado una habitación Suite.");
                 break;
             case 3:
                 precioSeleccionado = premium;
                 System.out.println("Ha seleccionado una habitación Premium.");
                 break;
             default:
                 System.out.println("Opción no válida. Por favor, reinicie el programa e intente nuevamente.");
                 return;
         }

         System.out.printf("El precio de la habitación seleccionada es: $%d%n", precioSeleccionado);
    }
}
