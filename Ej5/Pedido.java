package Ej5;

import java.util.HashSet;

public class Pedido {
    
        
    //Declaracion variables
    static private int numPedido;
    TipoComida comida;
    private HashSet<String> ingredientes=new HashSet<String>();

    /*Constructor */
    public Pedido (TipoComida vcomida){
        comida = vcomida;
        numPedido++;
    }


    // Metodos de clase
    public void agregarIngrediente(String vIngrediente){
        ingredientes.add(vIngrediente);
    }

    public void mostrarPedido(){
        if (ingredientes.isEmpty()) {
            System.out.println("Pedido : "+comida+"\n"+"ID-Pedido: "+numPedido+"\n"+"Ingredientes extras: Ninguno");
        }else{
            System.out.println("Pedido : "+comida+"\n"+"ID-Pedido: "+numPedido+"\n"+"Ingredientes extras: "+ingredientes);
        }
        
    }
    
    public static int getPedidos(){
        return numPedido;
    }
}
