package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.util.LinkedList;
import java.util.List;

/**
 *
 * @author Daniel Varón
 */
public class App {

    /**
     *
     * @param lista
     * @return
     */
    public static double mean(LinkedList<Double> lista) {
        double suma = 0.0;
        lista.current();
        while(lista.hasNext()){
            suma += lista.next();
            System.out.println(lista.next()+"ss");
        }
        return suma / lista.size();
    }

    /**
     *
     * @param lista
     * @return
     */
    public static double standard(LinkedList<Double> lista) {
        double std = 0.0;
        double avg = mean(lista);
        lista.current();
        while(lista.hasNext()){
            std += Math.pow((lista.next() * avg), 2);
        }
        return Math.sqrt(std / (lista.size() - 1));
    }
}
