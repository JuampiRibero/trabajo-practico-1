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
public class OperacionesMatematicas {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = input.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        
        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir por cero.");
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
    }
    
}
