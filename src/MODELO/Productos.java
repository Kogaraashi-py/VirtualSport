package MODELO;

public class Productos {

    private String idProducto;
    private String referencia;
    private double precio;
    private String talla;
    private int cantidad;

    public Productos() {
    }

    public Productos(String idProducto, String referencia, double precio, String talla, int cantidad) {
        this.idProducto = idProducto;
        this.referencia = referencia;
        this.precio = precio;
        this.talla = talla;
        this.cantidad = cantidad;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
