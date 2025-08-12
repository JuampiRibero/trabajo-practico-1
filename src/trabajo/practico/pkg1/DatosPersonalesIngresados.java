/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg1;

import java.util.Scanner;

/**
 *
 * @author juamp
 */
public class DatosPersonalesIngresados {
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
