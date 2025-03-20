package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSimAlm {
    ArrayList<Object> articulos=new ArrayList<>();
    
    public void entradaAutomatizada(){
        Articulo art1=new Articulo(0, null);
        articulos.add(art1);
        Articulo art2=new Articulo(0, null);
        articulos.add(art2);
        Articulo art3=new Articulo(0, null);
        articulos.add(art3);
        Articulo art4=new Articulo(0, null);
        articulos.add(art4);
    }

    public void lista(){
        for (Object i : articulos) {
            System.out.println(i);
        }
    }

    public void alta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el codigo de ese ariculo: ");
        int codart=entrada.nextInt();
        System.out.println("Dime la descripción de ese articulo: ");
        System.out.println();
        String descripcion=entrada.nextLine();
        Articulo art10=new Articulo(codart, descripcion);
        articulos.add(art10);
    }

    public void baja(Articulo art1){
        articulos.remove(art1);
    }

    public void entradaMercancia(Articulo art1,int vstock){
        art1.setStock(vstock);
    }

    public void disminuirMercancia(Articulo art1,int vstock){
        art1.setStock(art1.getStock()-vstock);
    }
}
