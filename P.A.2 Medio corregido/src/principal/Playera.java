package principal;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Playera extends Prenda {

    public static Double resultadof;
    public static Double resultadoh;
    public static String playerah = "";
    public static String playera = "";
    // super(ttalla, ttela);
    int h, t;
    Scanner in = new Scanner(System.in);
    Calculos cal = new Calculos();

    ArrayList<Double> calculos = new ArrayList<Double>();
    ArrayList<Double> calculoh = new ArrayList<Double>();

    public Playera() {
    }

    public Playera(int h, int t) {
        this.h = h;
        this.t = t;

    }

    public void DatosPlayera(int tela, int talla, int totalprenda) {
        double resultado = 0.0;
        double resultado1 = 0.00;
        h = tela;
        switch (h) {
            case 1:
                t = talla;
                switch (t) {
                    case 1:
                        cal.setKgTejido(150);
                        cal.setKgcontaminante(540.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(1755);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                    case 2:
                        cal.setKgTejido(150);
                        cal.setKgcontaminante(547.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(2025);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                    case 3:
                        cal.setKgTejido(150);
                        cal.setKgcontaminante(554.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(2295);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                    case 4:
                        cal.setKgTejido(150);
                        cal.setKgcontaminante(561.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(2565);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                    case 5:
                        cal.setKgTejido(150);
                        cal.setKgcontaminante(568.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(2835);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                }
                break;
            case 4:
                t = talla;
                switch (t) {
                    case 1:
                        cal.setKgTejido(125);
                        cal.setKgcontaminante(540.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(1505);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                    case 2:
                        cal.setKgTejido(125);
                        cal.setKgcontaminante(547.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(1775);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                    case 3:
                        cal.setKgTejido(125);
                        cal.setKgcontaminante(554.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(2045);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                    case 4:
                        cal.setKgTejido(125);
                        cal.setKgcontaminante(561.53);
                        ;
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(2315);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                    case 5:
                        cal.setKgTejido(125);
                        cal.setKgcontaminante(568.53);
                        resultado = cal.calcularHuellaCarbono();
                        calculos.add(resultado);
                        cal.setCalculoHidrico(2585);
                        resultado1 = cal.calcularHuellaHidrica();
                        calculoh.add(resultado1);
                        break;
                }
                break;
        }
        resultadof = resultado * totalprenda;
        //JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + resultado);
        //JOptionPane.showMessageDialog(null, "El resultado de todo es: " + resultadof);
        playera = String.valueOf(resultadof);
        resultadoh = resultado1 * totalprenda;
        playerah = String.valueOf(resultadoh);
    }

    public static Double TotalPlayera(ArrayList<Double> calculos) {
        double total = 0;
        Iterator it = calculos.iterator();
        while (it.hasNext()) {
            total = total + (Integer) it.next();
        }
        return total;
    }

    public double Total0() {
        Double regreso = TotalPlayera(calculos);
        return regreso;
    }

    public double TotalHidrica() {
        double totalhidrico = 0;
        for (Double d : calculoh) {
            totalhidrico += d;
        }
        return totalhidrico;
    }
}
