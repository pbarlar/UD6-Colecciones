package Ej1;
import java.util.ArrayList;

public class Menu {
    ArrayList<String> menu= new ArrayList<>();

    public void creaOpcion(String opc){
        menu.add(opc);
    }

    public void muestraMenu(){
        for (String i : menu) {
            System.out.println(i);
        }
    }

    public void capturaOpcion(int p){
        System.out.println(menu.get(opc));
    }
   
}