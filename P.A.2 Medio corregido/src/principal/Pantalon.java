package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pantalon extends Prenda {

    public static Double resultadof;
    public static Double resultadoh;
    public static String pantalon="";
    public static String pantalonh="";
    // super(ttalla, ttela);
    int h, t;
    Calculos cal1 = new Calculos();
    Scanner in = new Scanner(System.in);
    ArrayList<Double> calculos1 = new ArrayList<Double>();
    ArrayList<Double> calculosh1 = new ArrayList<Double>();

    /*
prenda = tipo de prenda que se utiliza
tela = tela que se utiliza
talla = talla de la prenda
totalprenda = cuantos hay 
     */
    public Pantalon() {
    }

    public Pantalon(int h, int t) {
        this.h = h;
        this.t = t;
    }

    public void DatosPantalon(int tela, int talla, int totalprenda) {

        String Tela = "";
        String Talla = "";
        String Totalprenda = "";
        double resultado1 = 0.00;
        double resultado2 = 0.00;
        h = tela;
        switch (h) {
            case 1:
                Tela = "Algodon";
                t = talla;
                switch (t) {
                    case 1:
                        cal1.setKgTejido(450);
                        cal1.setKgcontaminante(641.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "XCH";
                        cal1.setCalculoHidrico(1987);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 2:
                        cal1.setKgTejido(450);
                        cal1.setKgcontaminante(648.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "CH";
                        cal1.setCalculoHidrico(2176);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 3:
                        cal1.setKgTejido(450);
                        cal1.setKgcontaminante(662.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "M";
                        cal1.setCalculoHidrico(2365);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 4:
                        cal1.setKgTejido(450);
                        cal1.setKgcontaminante(669.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "L";
                        cal1.setCalculoHidrico(2554);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 5:
                        cal1.setKgTejido(450);
                        cal1.setKgcontaminante(676.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "XL";
                        cal1.setCalculoHidrico(2743);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                }
                break;
            case 2:
                Tela = "Lino";
                t = talla;
                switch (t) {
                    case 1:
                        cal1.setKgTejido(175);
                        cal1.setKgcontaminante(259.22);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "XCH";
                        cal1.setCalculoHidrico(994);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 2:
                        cal1.setKgTejido(175);
                        cal1.setKgcontaminante(266.22);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "CH";
                        cal1.setCalculoHidrico(1089);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 3:
                        cal1.setKgTejido(175);
                        cal1.setKgcontaminante(273.22);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "m";
                        cal1.setCalculoHidrico(1183);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 4:
                        cal1.setKgTejido(175);
                        cal1.setKgcontaminante(280.22);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "L";
                        cal1.setCalculoHidrico(1278);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 5:
                        cal1.setKgTejido(175);
                        cal1.setKgcontaminante(287.22);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "XL";
                        cal1.setCalculoHidrico(1373);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                }
                break;
            case 3:
                Tela = "Mezclilla";
                t = talla;
                switch (t) {
                    case 1:
                        cal1.setKgTejido(625);
                        cal1.setKgcontaminante(1036.88);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "XCH";
                        cal1.setCalculoHidrico(2485);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 2:
                        cal1.setKgTejido(625);
                        cal1.setKgcontaminante(1043.88);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "CH";
                        cal1.setCalculoHidrico(2722);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 3:
                        cal1.setKgTejido(625);
                        cal1.setKgcontaminante(1050.88);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "M";
                        cal1.setCalculoHidrico(2959);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 4:
                        cal1.setKgTejido(625);
                        cal1.setKgcontaminante(1057.88);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "L";
                        cal1.setCalculoHidrico(3196);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 5:
                        cal1.setKgTejido(625);
                        cal1.setKgcontaminante(1064.88);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "XL";
                        cal1.setCalculoHidrico(3433);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;

                }
                break;
            case 4:
                Tela = "Poliester";
                t = talla;
                switch (t) {
                    case 1:
                        cal1.setKgTejido(345);
                        cal1.setKgcontaminante(648.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "XCH";
                        cal1.setCalculoHidrico(2186);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 2:
                        cal1.setKgTejido(345);
                        cal1.setKgcontaminante(655.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "CH";
                        cal1.setCalculoHidrico(2394);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 3:
                        cal1.setKgTejido(345);
                        cal1.setKgcontaminante(662.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "M";
                        cal1.setCalculoHidrico(2602);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 4:
                        cal1.setKgTejido(345);
                        cal1.setKgcontaminante(669.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "L";
                        cal1.setCalculoHidrico(2810);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                    case 5:
                        cal1.setKgTejido(345);
                        cal1.setKgcontaminante(676.05);
                        resultado1 = cal1.calcularHuellaCarbono();
                        calculos1.add(resultado1);
                        Talla = "XL";
                        cal1.setCalculoHidrico(3018);
                        resultado2 = cal1.calcularHuellaHidrica();
                        calculosh1.add(resultado2);
                        break;
                }
                break;
        }
        resultadof = resultado1 * totalprenda;
        //JOptionPane.showMessageDialog(null, "El resultado del calculo es: "+ resultado1);
        //JOptionPane.showMessageDialog(null, "El resultado de todo es: "+ resultadof);
        Totalprenda = String.valueOf(totalprenda);
        //DefaultTableModel model = (DefaultTableModel) FrmVistaDatos.jTable2.getModel();
        //odel.addRow(new Object[]{Tela, Tela, Talla, Totalprenda});
        pantalon = String.valueOf(resultadof);
        resultadoh = resultado2 * totalprenda;
        pantalonh = String.valueOf(resultadoh);

    }

    public static Double TotalPantalon(ArrayList<Double> calculos1) {
        double total1 = 0;
        Iterator it = calculos1.iterator();
        while (it.hasNext()) {
            total1 = total1 + (Integer) it.next();
        }
        return total1;
    }

    public Double Total1() {
        Double regreso = TotalPantalon(calculos1);
        //String cadena = String.valueOf(regreso);
        return regreso;
    }

    public double TotalHidrica1() {
        double totalhidrico = 0;
        for (Double d : calculosh1) {
            totalhidrico += d;
        }
        return totalhidrico;
    }

}
