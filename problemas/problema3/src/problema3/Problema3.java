/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int m;
        int suma;
        suma = 0;
        System.out.println("Ingrese el valor de n");
        n = entrada.nextInt();
        System.out.println("Ingrese el valor de m");
        m = entrada.nextInt();
        while (m >= 1) {
            if (m %2 == 1) {
                suma = suma + n;
                
            }
        m = m / 2;
        n = n + n;
        }
        System.out.println(suma);
    }
    
}
