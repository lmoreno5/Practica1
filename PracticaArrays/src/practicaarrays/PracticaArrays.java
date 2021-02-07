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
        int numero,elementos;
        boolean permitido;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Anota cuantos números desea leer:");
            elementos = sc.nextInt();
            permitido = correcto(elementos);
            if (!permitido)
                System.out.println("El número de elementos tiene como máximo 10");
        } while (!permitido);
        int numeros[] = new int[elementos];
        
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
        
        System.out.println("Anota número a buscar");
        int num = sc.nextInt();
        
        int pos = buscar(numeros,num);
        if (pos == -1)
            System.out.println("El número no está");
        else
            System.out.println("El número está");
        
    }
    public static int buscar(int n[], int num){
        for (int i = 0; i < n.length; i++)
            if (n[i]==num)
                return i;
        return -1;
                    
    }
    public static boolean correcto(int elementos){
        if (elementos>10)
            return false;
        return true;
    }
    
}
