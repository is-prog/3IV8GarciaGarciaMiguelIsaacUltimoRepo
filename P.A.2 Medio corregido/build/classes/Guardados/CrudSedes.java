/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guardados;

import java.util.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import vistas.FrmSedesReciclaje;

/**
 *
 * @author alumno
 */
public class CrudSedes extends javax.swing.JFrame {

    ArrayList<Sedes> listasedes = new ArrayList();
    String direccion;
    int ID;

    Sedes sedes = new Sedes();

    public CrudSedes() {

    }

    public void guardarSede(Sedes sedes) throws IOException, FileNotFoundException, ClassNotFoundException {
        actualizarLista();
        listasedes.add(sedes);
        guardar();
    }

    public void leerSedes() throws FileNotFoundException, ClassNotFoundException, IOException {
        actualizarLista();
        int n = 1;
        for (int i = 0; i < listasedes.size(); i++) {
            Sedes lectura = (Sedes) listasedes.get(i);
            n++;
            /*JOptionPane.showMessageDialog(null, "El nombre del Consultante es: " + lectura.getNombre() + "\n"
                    + "El usuario del consultante es: " + lectura.getUser() + "\n"
                    + "El genero del consultante es: " + lectura.getGenero() + "\n"
                    + "La alcaldia del consultante es: " + lectura.getAlcaldia() + "\n");*/
            DefaultTableModel modelo = (DefaultTableModel) FrmSedesReciclaje.jTable1.getModel();
            modelo.addRow(new Object[]{n, lectura.getDireccion()});
        }
        //tengo que recorrer el array
    }

    public boolean buscarID(int id) throws IOException, FileNotFoundException, ClassNotFoundException {
        actualizarLista();
        Integer obj1 = new Integer(id);
        for (int i = 0; i < listasedes.size(); i++) {
            Sedes sede = (Sedes) listasedes.get(i);
            Integer obj2 = new Integer(sede.getID());
            if (obj1.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    private void guardar() throws FileNotFoundException, IOException, ClassNotFoundException {
        //para guardar el archivo tenemos que escribir una salida

        //tenemos que definri el buffer de salida del archivo
        FileOutputStream archivo = new FileOutputStream("sedes.dat");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);

        //escribirmos los datos del array
        salida.writeObject(listasedes);
        //cerramos el flujo
        salida.close();
    }

    private void actualizarLista() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream("sedes.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        listasedes = (ArrayList) entrada.readObject();
    }
}
