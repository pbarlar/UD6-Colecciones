package Ej2;

public class Articulo {
    private int codigo,stock;
    private double precioVenta, precioCosto;
    private String descripcion;
    
    public Articulo(int vcod,String vdesc){
        codigo=vcod;
        descripcion=vdesc;
    }

    void setCodigo(int cod){
        codigo=cod;
    }

    void setStock(int vstock){
        stock=vstock;
    }

    void setPrecioVenta(double vPrecioVenta){
        precioVenta=vPrecioVenta;
    }

    void setPrecioCosto(double vPrecioCosto){
        precioCosto=vPrecioCosto;
    }

    void setDescripcion (String vDescripcion){
        descripcion=vDescripcion;
    }

    int getCodigo(){
        return codigo;
    }

    int getStock(){
        return stock;
    }

    double getPrecioVenta(){
        return precioVenta;
    }

    double getPrecioCosto(){
        return precioCosto;
    }

    String getDescripcion(){
        return descripcion;
    }
}
