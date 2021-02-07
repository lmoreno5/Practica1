/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarrays;

import java.util.*;

/**
 *
 * @author Humberto
 */
public class PracticaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = new int[10];
        int numero;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Anota números");
            numero = sc.nextInt();
            boolean aceptado = true;
            for (int j = 0; j < i; j++){
                if (numero == numeros[j]){
                    aceptado = false;
                    break;
                }
            }
            if (aceptado){
                numeros[i] = numero;
            } else {
                System.out.println("Número repetido");
                i--;
            }  
        }

        Arrays.sort(numeros);
        System.out.println("Los numeros ordenados serian: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
