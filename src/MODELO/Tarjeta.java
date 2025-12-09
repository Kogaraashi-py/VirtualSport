package MODELO;

import MODELO.Interfacez.Registrable;

public class Tarjeta extends Pago implements Registrable {

    private String noCuenta;
    private String fechaExpiracion;
    private int cvv;

    public Tarjeta() {
    }

    public Tarjeta(double totalAbsoluto, double iva, double totalPagado, String noCuenta, String fechaExpiracion, int cvv) {
        super(totalAbsoluto, iva, totalPagado);
        this.noCuenta = noCuenta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
//toArchivo CONVIERTE TODOS LOS ATRIBUTOS DE Tarjeta y Pago EN UNA CADENA DE TEXTO FORMATEADA QUE SERÁ ESCRITA EN EL ARCHIVO.
    @Override
    public String toArchivo() {
        return getTotalAbsoluto() + " - " + getIva() + " - " + getTotalPagado() + " - " + noCuenta + " - " + fechaExpiracion + " - " + cvv;
    }

}
