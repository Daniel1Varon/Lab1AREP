package edu.escuelaing.arem.ASE.app;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static double mean(List<Double> lista){
        double suma=0.0;
        for(double e: lista) suma+=e;
        return suma/lista.size();
    }
    
    public static double standard(List<Double> lista){
        
        return 0;
    }
}
