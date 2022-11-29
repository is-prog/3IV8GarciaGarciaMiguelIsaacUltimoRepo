package principal;
import java.util.ArrayList;
import java.util.List;
/**
 * CrudSedes
 */
public class CrudSedes {

    public ArrayList<String> sedes = new ArrayList<String>();

    public void añadirSedes() {
        sedes.add("1.- Doctor Ruíz No.25, col. Doctores, Alcaldía Cuauhtémoc.");
        sedes.add("2.- Poniente 146 núm. 710 A, col. Industrial Vallejo, alcaldía Azcapotzalco.");
        sedes.add("3.- Iztacalco: Calle Avena 216, col. Granjas México, Alcaldía Iztacalco.");
        sedes.add("4.- Calle Sur 29 mz. 55, lt. 585, col. Leyes de Reforma 2a sección, Alcaldía Iztapalapa.");
        sedes.add("5.- San Rafael Atlixco 186, Leyes de Reforma.");
        sedes.add("6.- Avenida Heroica Escuela Naval Militar, esquina Calzada la Virgen s/n Colonia Ex-Ejido de San Pablo Tepetlapa. Código Postal 04840. Alcaldía Coyoacán,");
        sedes.add("7.- Jalapa 234, Roma Sur, Cuauhtémoc.");
        sedes.add("8.- Av. Miguel de Cervantes Saavedra 386, Col. Ampliación Granada, C.P. 11500, Miguel Hidalgo, CDMX");
        sedes.add("9.- Horacio, Torcuato Tasso y Euler n/a, Col. Polanco, C.P. 11550, Miguel Hidalgo, CDMX");    
    }

    ArrayList<String> mostrarSedes(){
        System.out.println("Las actuales sedes de reciclaje son: ");
        //return sedes;
        return sedes;
    }
    public void nuevaSede(String NSede){
        sedes.add(NSede);
      //  sedes.add(NSede);
    }
    public void borrarSede(int DSede){
        sedes.remove(sedes.size()-(-sedes.size()+ DSede));
        //sedes.remove(DSede);

    }
}