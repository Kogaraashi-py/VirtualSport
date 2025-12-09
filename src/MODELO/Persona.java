
package MODELO;

import MODELO.Interfacez.Registrable;


public class Persona implements Registrable{
   private String id;
   private String apellido;
   private String nombre;
   private String departamento;
   private String Municipio;
   private String direccion;

    public Persona() {
    }

    public Persona(String id, String apellido, String nombre, String departamento, String Municipio, String direccion) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.departamento = departamento;
        this.Municipio = Municipio;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //toArchivo CONVIERTE TODOS LOS ATRIBUTOS DE PERSONA EN UNA CADENA DE TEXTO FORMATEADA QUE SERÁ ESCRITA EN EL ARCHIVO.
   @Override
    public String toArchivo() {
        return   id + " - " + apellido + " - " + nombre + " - " + departamento + " - " + Municipio + " - " + direccion ;
    }
   
   
    
    
   
   
}
