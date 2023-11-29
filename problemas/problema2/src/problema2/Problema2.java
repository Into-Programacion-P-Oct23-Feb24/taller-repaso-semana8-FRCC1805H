/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        int contador = 0;
        
        System.out.println("Ingrese el numero tipo par positivo");
        numero = entrada.nextInt();
        if (numero>= 1 && numero %2 == 0){
            while (contador < numero){
                contador = contador +1;
                System.out.println(contador);
            }
        }else{ 
            System.out.println("Error: ingrese valor solon par");
        }
    }
    
}
