package Ej1;
import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("Elige una opción del 1 al "+menu.size()+".");
        Scanner entrada=new Scanner(System.in);
        int op= entrada.nextInt();
        System.out.println("Has elegido la opción "+op+"."); 
        System.out.println(menu.get(op-1));
    }
   
}