package edu.escuelaing.arem.ASE.app;

import java.util.List;

/**
 *
 * @author Daniel Varón
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double mean(List<Double> lista) {
        double suma = 0.0;
        for (double e : lista) {
            suma += e;
        }
        return suma / lista.size();
    }

    public static double standard(List<Double> lista) {
        double std = 0.0;
        double avg = mean(lista);
        for (double e : lista) {
            std += Math.pow((e * avg), 2);
        }
        return Math.sqrt(std / (lista.size() - 1));
    }
}
