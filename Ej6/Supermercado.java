package Ej6;

import java.util.HashMap;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        // Creamos el hashmap de los productos y su precio
        HashMap<String, Double> productos= new HashMap<String, Double>();
        HashMap<String, Integer> listaCompra=new HashMap<>();
        Scanner entrada=new Scanner(System.in);
        String producto=" ";
        int[] cantidad=new int[6];
        double total=0;

        // Añadimos los productos y sus precios
        productos.put("Avena", 2.21);
        productos.put("Garbanzos", 2.39);
        productos.put("Tomate", 1.59);
        productos.put("Jengibre", 3.13);
        productos.put("Quinoa", 4.50);
        productos.put("Guisantes", 1.60);

        //Hacemos el bucle para realizar la lista de la compra
        do {
            System.out.print("Producto: ");
            producto=entrada.nextLine();
            switch (producto) {
                case "Avena":
                    System.out.print("Cantidad: ");
                    cantidad[0]+=entrada.nextInt();
                    listaCompra.put("Avena", cantidad[0]);
                    break;
                case "Garbanzos":
                    System.out.print("Cantidad: ");
                    cantidad[1]+=entrada.nextInt();
                    listaCompra.put("Garbanzos", cantidad[1]);
                    break;
                case "Tomate":
                    System.out.print("Cantidad: ");
                    cantidad[2]+=entrada.nextInt();
                    listaCompra.put("Tomate", cantidad[2]);
                    break;
                case "Jengibre":
                    System.out.print("Cantidad: ");
                    cantidad[3]+=entrada.nextInt();
                    listaCompra.put("Jengibre", cantidad[3]);
                    break;
                case "Quinoa":
                    System.out.print("Cantidad: ");
                    cantidad[4]+=entrada.nextInt();
                    listaCompra.put("Quinoa", cantidad[4]);
                    break;
                case "Guisantes":
                    System.out.print("Cantidad: ");
                    cantidad[5]+=entrada.nextInt();
                    listaCompra.put("Guisantes", cantidad[5]);
                    break;
                case "fin":
                    System.out.println("Saliendo...");
                    break;
            } 
            entrada.nextLine();
        } while (!producto.equals("fin"));


        
        //Ahora hago la interfaz del menu con un bucle donde enseño por pantalla los datos de su pedido y el total.

        System.out.println("Producto   Precio   Cantidad   Subtotal");
        System.out.println("-------------------------------------------------");

        for (String i : listaCompra.keySet()) {
            int valor=listaCompra.get(i);
            System.out.println(i+"\t"+productos.get(i)+"\t"+valor+"\t"+productos.get(i)*valor);
            total+=productos.get(i)*valor;
        }
        System.out.println("------------------");
        System.out.println("TOTAL: "+total);



    }       
}