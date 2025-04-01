package Ej4;

import java.util.HashSet;

public class Ej4 {
    public static void main(String[] args) {
        HashSet<Integer> numeros=new HashSet<Integer>(); 
        int suma=0;

        // Añado numeros al HashSet
        numeros.add(8);
        numeros.add(2);
        numeros.add(5);
        numeros.add(9);
        numeros.add(12);

        // Recorro el HashSet con un bucle para hacer la suma de esos números
        for (Integer i : numeros) {
            suma=suma+i;
        }

        System.out.println("Lista de números: "+numeros);
        System.out.println("La suma de la lista de números es: "+suma);
    }
}
