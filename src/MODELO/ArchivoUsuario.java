package MODELO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUsuario {

    FileReader fr;
    BufferedReader br;
    FileWriter fw;

    Usuario e;

    public ArrayList<Usuario> lista = new ArrayList<>();
    //Recibe objeto de tipo Usuario como parámetro. INGRESADOS DESDE EL FRAME DE Inicio_sesion
    public void ingresar(Usuario e) throws FileNotFoundException, IOException {
        fw = new FileWriter("UsuariosRegistrados.txt", true);
        String cad = e.getUsuario() + " - " + e.getContraseña();

        fw.write(cad);
        fw.write(10);
        fw.close();
    }
    //LEER LEE EL ARCHIVO Y ALMACENA LOS DATOS EN EL ARRAYLIST LISTA
    public void leer() throws FileNotFoundException, IOException {
        lista.clear();

        fr = new FileReader("UsuariosRegistrados.txt");
        br = new BufferedReader(fr);

        //Leer primera linea
        String cad = br.readLine();
        String vec[];
        while (cad != null) {
            vec = cad.split(" - ");
            e = new Usuario(vec[0], vec[1]);
            lista.add(e);
            cad = br.readLine();
        }
    }
}
