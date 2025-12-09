
package MODELO;

import MODELO.Interfacez.Registrable;


public class Pago implements Registrable {
  private double totalAbsoluto;
  private double iva;
  private double totalPagado;

    public Pago() {
    }

    public Pago(double totalAbsoluto, double iva, double totalPagado) {
        this.totalAbsoluto = totalAbsoluto;
        this.iva = iva;
        this.totalPagado = totalPagado;
    }

    public double getTotalAbsoluto() {
        return totalAbsoluto;
    }

    public void setTotalAbsoluto(double totalAbsoluto) {
        this.totalAbsoluto = totalAbsoluto;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }
    //CONVIERTE TODOS LOS ATRIBUTOS DE PAGO EN UNA CADENA DE TEXTO FORMATEADA QUE SERÁ ESCRITA EN EL ARCHIVO.
    @Override
    public String toArchivo() {
        return totalAbsoluto + " - " + iva + " - " + totalPagado;
    }
  
  
}


