package Ej2;

import java.util.ArrayList;

public class AlmArticulo {
    ArrayList<Object> articulos=new ArrayList<>();

    public void almacena(Articulo art1){
        articulos.add(art1);
    }

    @Override
    public String toString(){
        String art = "";
        for (Object object : articulos) {
            art=object+"/n";
        }
        return art;
    }
}
