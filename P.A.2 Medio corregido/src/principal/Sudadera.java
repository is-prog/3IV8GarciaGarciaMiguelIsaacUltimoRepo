package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Sudadera extends Prenda {

    public static Double resultadof;
    public static Double resultadoh;
    public static String sudaderah="";
    public static String sudadera = "";
    // super(ttalla, ttela);
    int h, t;
    Scanner in = new Scanner(System.in);
    Calculos cal3 = new Calculos();
    double resultado3 = 0.0;
    double resultado2 = 0.00;
    ArrayList<Double> calculos3 = new ArrayList<Double>();
    ArrayList<Double> calculoh3 = new ArrayList<Double>();

    public Sudadera() {
    }

    public Sudadera(int h, int t) {
        this.h = h;
        this.t = t;
    }

    public void DatosSudadera(int tela, int talla, int totalprenda) {
        h = tela;

        switch (h) {
            case 1:
                t = talla;
                switch (t) {
                    case 1:
                        cal3.setKgTejido(505);
                        cal3.setKgcontaminante(540.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(2866);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                    case 2:
                        cal3.setKgTejido(505);
                        cal3.setKgcontaminante(547.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(3204);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                    case 3:
                        cal3.setKgTejido(505);
                        cal3.setKgcontaminante(554.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(3542);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                    case 4:
                        cal3.setKgTejido(505);
                        cal3.setKgcontaminante(561.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(3880);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                    case 5:
                        cal3.setKgTejido(505);
                        cal3.setKgcontaminante(568.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(4218);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                }
                break;
            case 4:
                t = talla;

                switch (t) {
                    case 1:
                        cal3.setKgTejido(455);
                        cal3.setKgcontaminante(540.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(2626);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                    case 2:
                        cal3.setKgTejido(455);
                        cal3.setKgcontaminante(547.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(2964);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                    case 3:
                        cal3.setKgTejido(455);
                        cal3.setKgcontaminante(554.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(3302);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                    case 4:
                        cal3.setKgTejido(455);
                        cal3.setKgcontaminante(561.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(3640);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                    case 5:
                        cal3.setKgTejido(455);
                        cal3.setKgcontaminante(568.53);
                        resultado3 = cal3.calcularHuellaCarbono();
                        calculos3.add(resultado3);
                        cal3.setCalculoHidrico(3978);
                        resultado2 = cal3.calcularHuellaHidrica();
                        calculoh3.add(resultado2);
                        break;
                }
                break;
        }
        resultadof = resultado3 * totalprenda;
        //JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + resultado3);
        //JOptionPane.showMessageDialog(null, "El resultado de todo es: " + resultadof);
        sudadera = String.valueOf(resultadof);
        resultadoh = resultado2 * totalprenda;
        sudaderah = String.valueOf(resultadoh);
    }

    public static Double TotalSudadera(ArrayList<Double> calculos3) {
        double total3 = 0;
        Iterator it = calculos3.iterator();
        while (it.hasNext()) {
            total3 = total3 + (Integer) it.next();
        }
        return total3;
    }

    public double Total3() {
        Double regreso = TotalSudadera(calculos3);
        return regreso;
    }

    public double TotalHidrica3() {
        double totalhidrico = 0;
        for (Double d : calculoh3) {
            totalhidrico += d;
        }
        return totalhidrico;
    }
}
