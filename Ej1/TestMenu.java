
package Ej1;
public class TestMenu {
    public static void main(String[] args) {
        Menu menu1=new Menu();

        menu1.creaOpcion("1 - Elegir acompañante");
        menu1.creaOpcion("2 - Eliminar acompañante");
       
        menu1.muestraMenu();
        menu1.capturaOpcion(1);
        
    }
}
