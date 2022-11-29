package principal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlAdmin {
    Scanner dato = new Scanner(System.in);
    int Op, DSede;
    String id;
    CrudSedes crud1 = new CrudSedes();
    CrudUsuario crud2 = new CrudUsuario();
    

    public void EditSedes(){
        do {
            System.out.println("Bienvenido al sistema CRUD de sedes de reciclaje");
            System.out.println("Elija una opcion: " + "\n"+ "1.- Añadir una nueva sede" + "\n" + "2.- Eliminar sede" + "\n" + "3.- Consultar sedes");
            try{ 
            Op = Integer.parseInt(dato.nextLine());
            switch (Op) {
                case 1:
                    /*ArrayList<String> sedes =*/ crud1.mostrarSedes();
                    System.out.println("Ingrese la nueva sede para añadir: ");
                    String NSede = dato.nextLine();
                    crud1.nuevaSede(NSede);
                case 2:
                    crud1.mostrarSedes();
                    System.out.println("Ingrese cual sede desea eleminar: ");
                    DSede = dato.nextInt();
                    crud1.borrarSede(DSede);
                break;

                case 3:
                    System.out.println("Las sedes de reciclaje son: ");
                    crud1.mostrarSedes();
                break;
                default:
                System.out.println("INVALIDO");
            }

            }catch(InputMismatchException e){
                System.out.println("Por favor ingrese un valor entre el 1 y el 3");
            }
        } while (Op != 4);
    }

    public void Users(){
        do {
            System.out.println("Bienvenido al sistema CRUD de Consultantes");
            System.out.println("Elija una opcion: " + "\n" + "1.- Ver consultantes registrados" + "\n" + "2.- Eliminar consultante" + "\n" + "3.- Editar consultante ");
            try {
                Op = Integer.parseInt(dato.nextLine());
                switch (Op) {
                    case 1:
                        crud2.mostrarConsultantes();
                        break;
                    case 2:
                        System.out.println("Ingrese el ID del consultante a eliminar");
                        id = dato.nextLine();
                        Consultante eliminado = crud2.buscarConsultante(id);
                        crud2.borraConsultantes(eliminado);
                        System.out.println("Consultante eliminado");
                        break;

                    case 3:
                        System.out.println("Ingrese el id del Consultante a actualizar");
                        id = dato.nextLine();
                        
                        Consultante consultanteSeleccionado = crud2.buscarConsultante(id);
                        
                        System.out.println("La info del Consultante es " + "\n ID:" + consultanteSeleccionado.GetID()+ "\n Nombre:" + consultanteSeleccionado.GetNombreu() + "\n Edad:" + consultanteSeleccionado.GetEdad());
                        
                        System.out.println("Ingrese el nuevo nombre del Consultante");
                        String nuevonombre = dato.nextLine();
                        System.out.println("Ingrese nueva edad del dormidito");
                        int nuevaEdad = dato.nextInt();
                        
                        consultanteSeleccionado.setNombreu(nuevonombre);
                        consultanteSeleccionado.SetEdad(nuevaEdad);
                        
                        crud2.actualizarConsultante(consultanteSeleccionado);
                    break;
                    default:
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido favor de ingresar ");
                // TODO: handle exception
            }
            
        } while (Op != 3);
    }
    
}

