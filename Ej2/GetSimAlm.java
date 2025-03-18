package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSimAlm {
    ArrayList<Object> articulos=new ArrayList<>();
    
    public void entradaAutomatizada(){
        Articulo art1=new Articulo(0, null);
        Articulo art2=new Articulo(0, null);
        Articulo art3=new Articulo(0, null);
        Articulo art4=new Articulo(0, null);
    }

    public void lista(){
        for (Object object : articulos) {
            System.out.println(object);
        }
    }

    public void alta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el codigo de ese ariculo: ");
        int codart=entrada.nextInt();
        System.out.println("Dime la descripción de ese articulo: ");
        String descripcion=entrada.nextLine();
        Articulo art1=new Articulo(codart, descripcion);
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
