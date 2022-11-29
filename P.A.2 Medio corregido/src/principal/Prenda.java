package principal;
public class Prenda {

    
    private String[] ttalla= {"M","L","S","XS","XL"};
    private String[] ttela={"Algodon","Poliester","Mezclilla","Lana","Lino"};
    private String[] TipoPrenda={"Pantalon","Sudadera","Playera","Camisa","Sueter"};


    public String [] mostrarPrendas(){

        return TipoPrenda;
    }
    public String [] mostrarTelas(){

        return ttela;
    }
    public String [] mostrarTallas(){

        return ttalla;
    }
}
