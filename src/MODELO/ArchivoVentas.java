package MODELO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoVentas {

    FileReader fr;
    BufferedReader br;
    FileWriter fw;

    Pago e = new Pago();

    public ArrayList<Pago> lista = new ArrayList<>();

    /*
    'INGRESAR' ACEPTA CUALQUIER OBJETO QUE IMPLEMENTE REGISTRABLE Y LO GUARDE EN EL ARCHIVO.
    USAR POLIMORFISMO PERMITE TRATAR OBJETOS DE DIFERENTES CLASES DE MANERA UNIFORME.
    Si no hubieramos usado el metodo comun habría que escribir múltiples métodos, uno para cada tipo de clase 
    (ingresarPersona, ingresarPago).
     */
    public void ingresar(String linea) throws FileNotFoundException, IOException {
        fw = new FileWriter("Ventas.txt", true);

        fw.write(linea);
        fw.write(10);
        fw.close();
    }

    public void leer() throws FileNotFoundException, IOException {
        fr = new FileReader("Ventas.txt");
        br = new BufferedReader(fr);
        //Leer primera linea
        String cad = br.readLine();
        String vec[];
        while (cad != null) {
            vec = cad.split(" - ");
            e = new Pago(Double.parseDouble(vec[0]), Double.parseDouble(vec[1]), Double.parseDouble(vec[2]));
            lista.add(e);
            cad = br.readLine();
        }
    }
}
