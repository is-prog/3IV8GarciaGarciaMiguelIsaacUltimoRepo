package principal;
public class Calculos {
    private double kgTejido;
    private  double kgcontaminante;
    private double calculoHidrico;
    private double calculoHuellaCarbono;

    public void setKgTejido(double kgTejido) {
        this.kgTejido = kgTejido;
    }

    public double getKgTejido() {
        return kgTejido;
    }
     public void setKgcontaminante(double kgcontaminante){
         this.kgcontaminante = kgcontaminante;
     }
     
     public double getKgcontaminante(){
         return kgcontaminante;
     }

    public double calcularHuellaCarbono() {
        calculoHuellaCarbono = kgcontaminante * kgTejido;
        return calculoHuellaCarbono;
    }
    
    public void setCalculoHidrico(double calculoHidrico){
        this.calculoHidrico = calculoHidrico;
    }
    
    public double getCalculHidrico(){
        return calculoHidrico;
    }

    public double calcularHuellaHidrica() {
        return calculoHidrico;
    }
}
