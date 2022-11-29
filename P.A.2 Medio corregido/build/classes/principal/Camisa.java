package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Camisa extends Prenda {

    public static Double resultadof;
    public static Double resultadoh;
    public static String camisa = "";
    public static String camisah = "";

    int h, t;
    Scanner in = new Scanner(System.in);
    Calculos cal2 = new Calculos();
    double resultado2 = 0.0;
    double calculo2h = 0.0;
    ArrayList<Double> calculos2 = new ArrayList<Double>();
    ArrayList<Double> calculoh2 = new ArrayList<Double>();

    public Camisa() {
    }

    public Camisa(int h, int t) {
        this.h = h;
        this.t = t;
    }

    /*
     * public Camisa(String ttalla, String ttela, int h, int t){
     * super(ttalla, ttela);
     * this.h=h;
     * this.t=t;
     * }
     */
    public void DatosCamisa(int tela, int talla, int totalprenda) {
        h = tela;

        switch (h) {
            case 1:
                t = talla;
                switch (t) {
                    case 1:
                        cal2.setKgTejido(255);
                        cal2.setKgcontaminante(540.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2430);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 2:
                        cal2.setKgTejido(255);
                        cal2.setKgcontaminante(547.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2700);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 3:
                        cal2.setKgTejido(225);
                        cal2.setKgcontaminante(561.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2970);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 4:
                        cal2.setKgTejido(225);
                        cal2.setKgcontaminante(568.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(3240);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 5:
                        cal2.setKgTejido(225);
                        cal2.setKgcontaminante(574.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(3510);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                }
                break;
            case 2:
                t = talla;
                switch (t) {
                    case 1:
                        cal2.setKgTejido(390);
                        cal2.setKgcontaminante(159.95);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(972);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 2:
                        cal2.setKgTejido(390);
                        cal2.setKgcontaminante(166.95);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(1080);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 3:
                        cal2.setKgTejido(390);
                        cal2.setKgcontaminante(173.95);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(1188);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 4:
                        cal2.setKgTejido(390);
                        cal2.setKgcontaminante(180.95);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(1296);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 5:
                        cal2.setKgTejido(390);
                        cal2.setKgcontaminante(187.95);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(1404);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                }
                break;
            case 3:
                t = talla;
                switch (t) {
                    case 1:
                        cal2.setKgTejido(520);
                        cal2.setKgcontaminante(625);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2100);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 2:
                        cal2.setKgTejido(520);
                        cal2.setKgcontaminante(632);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2370);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 3:
                        cal2.setKgTejido(520);
                        cal2.setKgcontaminante(639);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2590);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 4:
                        cal2.setKgTejido(520);
                        cal2.setKgcontaminante(646);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2801);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 5:
                        cal2.setKgTejido(520);
                        cal2.setKgcontaminante(653);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(3010);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                }
                break;
            case 4:
                t = talla;
                switch (t) {
                    case 1:
                        cal2.setKgTejido(237);
                        cal2.setKgcontaminante(540.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2238);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 2:
                        cal2.setKgTejido(237);
                        cal2.setKgcontaminante(547.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2508);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 3:
                        cal2.setKgTejido(237);
                        cal2.setKgcontaminante(554.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(2778);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 4:
                        cal2.setKgTejido(237);
                        cal2.setKgcontaminante(561.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(3048);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                    case 5:
                        cal2.setKgTejido(237);
                        cal2.setKgcontaminante(568.53);
                        resultado2 = cal2.calcularHuellaCarbono();
                        calculos2.add(resultado2);
                        cal2.setCalculoHidrico(3318);
                        calculo2h = cal2.calcularHuellaHidrica();
                        calculoh2.add(calculo2h);
                        break;
                }
                break;
        }
        resultadof = resultado2 * totalprenda;
        //JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + resultado2);
        //JOptionPane.showMessageDialog(null, "El resultado de todo es: " + resultadof);
        camisa = String.valueOf(resultadof);
        resultadoh = resultado2 * totalprenda;
        camisah = String.valueOf(resultadoh);

    }

    public static Double totalCamisa(ArrayList<Double> calculos2) {
        double total2 = 0;
        Iterator it = calculos2.iterator();
        while (it.hasNext()) {
            total2 = total2 + (Integer) it.next();
        }
        return total2;
    }

    public double Total2() {
        Double regreso = totalCamisa(calculos2);
        return regreso;
    }

    public double TotalHidrica2() {
        double totalhidrico = 0;
        for (Double d : calculoh2) {
            totalhidrico += d;
        }
        return totalhidrico;
    }
}
