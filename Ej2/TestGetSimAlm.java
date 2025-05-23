package Ej2;
import java.util.Scanner;

import Ej1.*;

public class TestGetSimAlm {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion=0;
        /*Creo objetos del almacen, menu y un par de articulos */
        GetSimAlm alm1=new GetSimAlm();
        Menu menu1=new Menu();
        Articulo art101=new Articulo(12, "Jarron blanco");
        Articulo art202=new Articulo(15, "Perchero");
        Articulo art303=new Articulo(17, "Balon de playa");

        /*Creo todas las opciones del menu */
        menu1.creaOpcion("0. Entrada automatizada");
        menu1.creaOpcion("1. Listado");
        menu1.creaOpcion("2. Alta");
        menu1.creaOpcion("3. Baja");
        menu1.creaOpcion("4. Entrada de mercancía");
        menu1.creaOpcion("5. Salida de mercancía");
        menu1.creaOpcion("6. Salir");

        /*Realizo el bucle para ejecutar el menu */
        do {
            menu1.muestraMenu();
            System.out.println("Dime una opcion del menu (0-6)");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 0:
                    alm1.entradaAutomatizada();
                    System.out.println("Se han añadido 4 articulos automaticamente (art1, art2, art3, art4)");
                    break;
                case 1:
                    alm1.lista();
                    break;
                case 2:
                    alm1.alta();
                    break;
                case 3:
                    alm1.baja(art101);
                    break;
                case 4:
                    alm1.entradaMercancia(art101, 12);
                    break;
                case 5:
                    alm1.disminuirMercancia(art101, 6);
                    System.out.println("Se ha disminuido la mercancia correctamente");
                default:
                    break;
            }
        } while (opcion!=6);
    }
}
