package MODELO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ArchivoCarrito {
    FileReader fr; //FileReader se usa para leer directamente del archivo. Caracter a caracter.
    BufferedReader br; //almacenar temporalmente los datos en un buffer para mayor eficiencia. Lee lineas completas
    FileWriter fw; //FileWriter se utiliza para escribir datos en el archivo.
    
    Productos e; //Es un objeto de la clase Productos que contiene los datos del producto.
    
    public ArrayList<Productos> lista = new ArrayList<>();
     //la función recibe un objeto de tipo Productos como parámetro. 
    public void ingresar(Productos e) throws FileNotFoundException, IOException{
        fw= new FileWriter("Carrito.txt", true); 

        String cad = e.getIdProducto() + " - " + e.getReferencia() + " - " + e.getPrecio() + " - " + e.getTalla() + " - " + e.getCantidad();
        
        fw.write(cad);//ESCRIBE LA CADENA CON LOS DATOS DEL PRODUCTO EN EL ARCHIVO. 
        fw.write(10); //Escribe un salto de línea (carácter de código ASCII 10)
        fw.close();
    }
    
    public void leer() throws FileNotFoundException, IOException{
        lista.clear(); //QUE NO HAYA DATOS ANTIGUOS 
        
        fr = new FileReader("Carrito.txt");
        br = new BufferedReader(fr);
             
        String cad = br.readLine(); //Lee la primera línea del archivo y la almacena en la variable cad.
        String vec[];
        while(cad!=null){
            vec = cad.split(" - "); //Divide la línea leída (cad) en partes usando el token
            //y las almacena en un arreglo de cadenas vec. 
            //Crea un nuevo objeto Productos utilizando los valores en el arreglo vec.
            e = new Productos(vec[0], vec[1], Double.parseDouble(vec[2]), vec[3], Integer.parseInt(vec[4]));
            lista.add(e);
            cad = br.readLine(); //Lee la siguiente línea del archivo para continuar el ciclo.
        }
    }
    //Eliminar el contenido del archivo Carrito.txt, dejándolo vacío.
    public void limpiardatos() throws IOException {
        fw = new FileWriter("Carrito.txt", false); //EL FALSE ES SOBREESCRITURA DEL ARCHIVO CREADO-ELIMINAR CNTDO PREVIO
        fw.write("");
        fw.close();
    }
    
    public void eliminar(int filaseleccionada) throws FileNotFoundException, IOException{
        //LEER EL ARCHIVO
        BufferedReader br = new BufferedReader(new FileReader("Carrito.txt"));
        ArrayList<String> lineas = new ArrayList<>(); //CREAMOS UN NUEVO ARRAYLIST DE TIPO STRING
        String linea; //se usará para guardar temporalmente cada línea leída del archivo.
        while((linea= br.readLine()) != null){
            lineas.add(linea); // Agrega la línea leída al ArrayList
        }
        br.close();
        
        //ELIMINAR LA FILA SELECCIONADA
        if(filaseleccionada >= 0 && filaseleccionada < lineas.size()){
            lineas.remove(filaseleccionada);
        }
        //SOBREESCRIBIR LOS DATOS
        BufferedWriter bw = new BufferedWriter(new FileWriter("Carrito.txt"));
        for (String i : lineas) {
            bw.write(i);//Para cada línea i, se escribe en el archivo
            bw.newLine();//salto de línea
            
        }
       bw.close();
    }
    
    public boolean validararchivo(){
        File archivo = new File("Carrito.txt");
        
        if (!archivo.exists()){
            return true; //Basicamente dice que si el archivo carrito no existe nos regresa un valor afirmando en este caso que no tiene datos
            
        } else if (archivo.length() == 0) { 
           return true; //Si el tamaño del archivo es igual a 0 quiere decir que no tiene ningun dato almacenado
           
        }
       return false; 
    }
}
