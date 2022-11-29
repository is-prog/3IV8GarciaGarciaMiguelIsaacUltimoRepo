/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guardados;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
//import vistas.FrmTelas;

/**
 *
 * @author Alumno
 */
public class CrudTelas {
     ArrayList<Telas> listatelas = new ArrayList();
    String TipoTela;
    int ID;

    Telas telas = new Telas();

    public CrudTelas() {

    }

    public void guardarTela(Telas telas) throws IOException, FileNotFoundException, ClassNotFoundException {
        actualizarLista();
        listatelas.add(telas);
        guardar();
    }

    public void leerTelas() throws FileNotFoundException, ClassNotFoundException, IOException {
        actualizarLista();
        int n = 1;
        for (int i = 0; i < listatelas.size(); i++) {
            Telas lectura = (Telas) listatelas.get(i);
            n++;
            /*JOptionPane.showMessageDialog(null, "El nombre del Consultante es: " + lectura.getNombre() + "\n"
                    + "El usuario del consultante es: " + lectura.getUser() + "\n"
                    + "El genero del consultante es: " + lectura.getGenero() + "\n"
                    + "La alcaldia del consultante es: " + lectura.getAlcaldia() + "\n");*/
            /*DefaultTableModel modelo = (DefaultTableModel) FrmTelas.jTable1.getModel();
            modelo.addRow(new Object[]{n, lectura.getTipoTela()});*/
        }
        //tengo que recorrer el array
    }

    public boolean buscarID(int id) throws IOException, FileNotFoundException, ClassNotFoundException {
        actualizarLista();
        Integer obj1 = new Integer(id);
        for (int i = 0; i < listatelas.size(); i++) {
            Telas telas = (Telas) listatelas.get(i);
            Integer obj2 = new Integer(telas.getID());
            if (obj1.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    private void guardar() throws FileNotFoundException, IOException, ClassNotFoundException {
        //para guardar el archivo tenemos que escribir una salida

        //tenemos que definri el buffer de salida del archivo
        FileOutputStream archivo = new FileOutputStream("telas.dat");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);

        //escribirmos los datos del array
        salida.writeObject(listatelas);
        //cerramos el flujo
        salida.close();
    }

    private void actualizarLista() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream("telas.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        listatelas = (ArrayList) entrada.readObject();
    }
}
