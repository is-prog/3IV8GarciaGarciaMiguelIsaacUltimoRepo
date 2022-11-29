package principal;

import java.util.ArrayList;

public class CrudUsuario {
    public static ArrayList<Consultante> listaConsultantes = new ArrayList<Consultante>();

    public ArrayList<Consultante> mostrarConsultantes(){
        return listaConsultantes;
    }

    public void borraConsultantes(Consultante Eliminar){
        listaConsultantes.remove(Eliminar);
    }

    public Consultante buscarConsultante(String id){
        Consultante encontrado = new Consultante();
        for(Consultante c : listaConsultantes ){
            if (id == c.GetID()){
            //persona encontrada
            encontrado = c;
        }else{
            System.out.println("Consultante no encontrada");
            }
        }
        return encontrado;
    }
    public void actualizarConsultante(Consultante act){
        Consultante actualizar = buscarConsultante(act.GetID());
        listaConsultantes.remove(actualizar);
        listaConsultantes.add(act);
    }
    
}
