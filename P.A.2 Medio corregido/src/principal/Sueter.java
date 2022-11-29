package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Sueter extends Prenda {

    public static Double resultadof;
    public static Double resultadoh;
    public static String sueter = "";
    public static String sueterh="";
    // super(ttalla, ttela);
    int h, t;
    Scanner in = new Scanner(System.in);
    Calculos cal4 = new Calculos();

    ArrayList<Double> calculos4 = new ArrayList<Double>();
    ArrayList<Double> calculoh4 = new ArrayList<Double>();

    public Sueter() {
    }

    public Sueter(int h, int t) {

        this.h = h;
        this.t = t;
    }

    public void DatosSueter(int tela, int talla, int totalprenda) {
        double resultado4 = 0.0;
        double resultado3 = 0.0;
        h = tela;
        switch (h) {
            case 1:
                t = talla;

                switch (t) {
                    case 1:
                        cal4.setKgTejido(600);
                        cal4.setKgcontaminante(702.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(3437);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                    case 2:
                        cal4.setKgTejido(600);
                        cal4.setKgcontaminante(709.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(3843);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                    case 3:
                        cal4.setKgTejido(600);
                        cal4.setKgcontaminante(716.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(4249);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                    case 4:
                        cal4.setKgTejido(600);
                        cal4.setKgcontaminante(723.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(4655);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                    case 5:
                        cal4.setKgTejido(600);
                        cal4.setKgcontaminante(730.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(5061);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                }
                break;
            case 4:
                t = talla;
                switch (t) {
                    case 1:
                        cal4.setKgTejido(680);
                        cal4.setKgcontaminante(764.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(3217);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                    case 2:
                        cal4.setKgTejido(680);
                        cal4.setKgcontaminante(771.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(3638);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                    case 3:
                        cal4.setKgTejido(680);
                        cal4.setKgcontaminante(778.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(3958);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                    case 4:
                        cal4.setKgTejido(680);
                        cal4.setKgcontaminante(785.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(4376);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                    case 5:
                        cal4.setKgTejido(680);
                        cal4.setKgcontaminante(792.82);
                        resultado4 = cal4.calcularHuellaCarbono();
                        calculos4.add(resultado4);
                        cal4.setCalculoHidrico(4786);
                        resultado3 = cal4.calcularHuellaHidrica();
                        calculoh4.add(resultado3);
                        break;
                }
                break;

        }
        resultadof = resultado4 * totalprenda;
        // JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + resultado4);
        //JOptionPane.showMessageDialog(null, "El resultado de todo es: " + resultadof);
        sueter = String.valueOf(resultadof);
        resultadoh = resultado3 * totalprenda;
        sueterh = String.valueOf(resultadoh);
    }

    public static Double TotalSueter(ArrayList<Double> calculos4) {
        double total4 = 0;
        Iterator it = calculos4.iterator();
        while (it.hasNext()) {
            total4 = total4 + (Integer) it.next();
        }
        return total4;
    }

    public double Total4() {
        Double regreso = TotalSueter(calculos4);
        return regreso;
    }

    public double TotalHidrica4() {
        double totalhidrico = 0;
        for (Double d : calculoh4) {
            totalhidrico += d;
        }
        return totalhidrico;
    }
}
