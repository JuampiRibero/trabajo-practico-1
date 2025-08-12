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
public class DivisionEnteros {
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = input.nextInt();

        int resultado = num1 / num2;
        System.out.println("Resultado (int): " + resultado);
    }
    
}
