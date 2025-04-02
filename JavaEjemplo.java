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
    }
}
