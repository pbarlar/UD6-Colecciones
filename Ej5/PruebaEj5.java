package Ej5;

public class PruebaEj5 {
    public static void main(String[] args) {
        //Crear un pedido de tipo PIZZA
        Pedido pedido1=new Pedido(TipoComida.PIZZA);
        pedido1.agregarIngrediente("Pepperonni");
        pedido1.agregarIngrediente("Champiñones");
        pedido1.mostrarPedido();
        

        //Crear pedido tipo de HAMBURGUESA
        Pedido pedido2=new Pedido(TipoComida.HAMBURGUESA);
        pedido2.agregarIngrediente("Queso");
        pedido2.mostrarPedido();
        System.out.println();

        //Crear pedido de tipo ENSALADA
        Pedido pedido3=new Pedido(TipoComida.ENSALADA);
        pedido3.mostrarPedido();
        System.out.println();

        //Crear pedido de tipo PASTA
        Pedido pedido4=new Pedido(TipoComida.PASTA);
        pedido4.agregarIngrediente("Albahaca");
        pedido4.mostrarPedido();
        System.out.println();

        //Contador de los pedidos realizados
        System.out.println("Cantidad de pedidos: "+Pedido.getPedidos());
    }
}
