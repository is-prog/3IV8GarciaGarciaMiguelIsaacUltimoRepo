/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iniciosesion;

import java.util.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import vistas.FrmSeleccionUsuarios;

/**
 *
 * @author edgar
 */
public class Funciones extends javax.swing.JFrame {

    ArrayList<UsuarioPrincipal> listausuarios = new ArrayList();
    String calculo = "";
    String user = "";
    String nombre = "";
    String pass = "";
    String genero = "";
    String alcaldia = "";

    UsuarioPrincipal usuarios = new UsuarioPrincipal();

    public Funciones() {
    }

    public void guardarUsuario(UsuarioPrincipal usuario) throws IOException, FileNotFoundException, ClassNotFoundException {
        actualizarLista();
        listausuarios.add(usuario);
        guardar();
    }

    public void leerUsuario() throws FileNotFoundException, ClassNotFoundException, IOException {
        actualizarLista();

        for (int i = 0; i < listausuarios.size(); i++) {
            UsuarioPrincipal lectura = (UsuarioPrincipal) listausuarios.get(i);

            /*JOptionPane.showMessageDialog(null, "El nombre del Consultante es: " + lectura.getNombre() + "\n"
                    + "El usuario del consultante es: " + lectura.getUser() + "\n"
                    + "El genero del consultante es: " + lectura.getGenero() + "\n"
                    + "La alcaldia del consultante es: " + lectura.getAlcaldia() + "\n");*/
            DefaultTableModel modelo = (DefaultTableModel) FrmSeleccionUsuarios.jTable1.getModel();
            modelo.addRow(new Object[]{lectura.getNombre(), lectura.getUser(), lectura.getGenero(), lectura.getAlcaldia()});
        }
        //tengo que recorrer el array
    }
    


    public boolean buscarUser(String userlogin, String passlogin) throws FileNotFoundException, IOException, ClassNotFoundException {
        actualizarLista();
        for (int i = 0; i < listausuarios.size(); i++) {
            UsuarioPrincipal user = (UsuarioPrincipal) listausuarios.get(i);
            if (user.getUser().equals(userlogin) && user.getPass().equals(passlogin)) {

                return true;
            }
        }
        return false;
    }

    private void guardar() throws FileNotFoundException, IOException, ClassNotFoundException {
        //para guardar el archivo tenemos que escribir una salida
        
        //tenemos que definri el buffer de salida del archivo
        FileOutputStream archivo = new FileOutputStream("archivos.dat");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);

        //escribirmos los datos del array
        salida.writeObject(listausuarios);
        //cerramos el flujo
        salida.close();
    }


    private void actualizarLista() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream("archivos.dat");
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        listausuarios = (ArrayList) entrada.readObject();
    }

}
