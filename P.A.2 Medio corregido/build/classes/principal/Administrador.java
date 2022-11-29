package principal;

import java.util.Scanner;
import java.util.InputMismatchException;
//import java.io.File;

public class Administrador extends Consultante{
protected String contrasenareal;
    String nombrea, contrasena;
    ControlAdmin control = new ControlAdmin();
    Sistema sis = new Sistema();
    Prenda P = new Prenda();
    int op;
    Scanner in;
    //implementar el metodo del registro
    public void Registroa(){
        in = new Scanner(System.in);
        contrasenareal= "PJGDYVI03";
        System.out.println("Ingresa tu nombre");  
        nombrea=in.nextLine();
        System.out.println("Ingresa la contraseña");  
        contrasena=in.nextLine();

    if (contrasena == contrasenareal){
            System.out.println("Bienvenido usuario administrador, seleccione la acción que desee realizar");
            do{
            System.out.println("1- Consultar/Editar sedes de reciclaje");
            System.out.println("2.- Consultar Tipos de telas");
            System.out.println("3.- Consultar Tipos de prendas");
            System.out.println("4.- Consultar Tipos de tallas de ropa");
            System.out.println("5.- Consultar datos Huella hidrica de los consultantes");
            System.out.println("6.- Consultar/Editar datos de usuario");
        try{ 
        op = in.nextInt();
        }catch(InputMismatchException es){
            System.out.println("Por favor ingrese solamente 1 a 6 en este apartado");
        }
    } while (op < 6 && op> 0);
    switch (op) {
        case 1:
            control.EditSedes();
            break;
            case 2:
            System.out.println("Los tipos de tela existentes actualmente en el sistema son: ");
            P.mostrarTelas();
                break;
            case 3:
            System.out.println("Los tipos de prendas existentes actualmente en el sistema son: ");
            P.mostrarPrendas();
            break;
            case 4:
            System.out.println("Las tallas existentes actualmente en el sistema son: ");
            P.mostrarTallas();
                break;
            case 5:
            System.out.println("Los resultados de la huella hidrica calculados por los usuarios son: ");
            //VerHuella Hidríca();
                break;
            case 6:
            control.Users();
                break;
        default:
            System.exit(0);
            break;
    }
    }else{
    System.out.println("Contraseña incorrecta, usted no es administrador");
    System.exit(0);
}
}
    public Administrador(){}
    public Administrador(String nombrea,String contrasena){
        this.nombrea=nombrea;
        this.contrasena=contrasena;
    }
    public void setNombrea(String nombrea){
        this.nombrea = nombrea;
    }
    public String getNombrea(){
        return nombrea;
    }
    public void setContrasenareal(String contrasenareal){
        this.contrasenareal=contrasenareal;
    }
    public String getContrasenareal(){
        return contrasenareal;
    }

}
