/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.util;

import java.util.Iterator;

/**
 *
 * @author Daniel Varón
 * @param <E>
 */
public class Iterador<E> implements Iterator {

    protected int posicionarray;
    int size=0;
    public Iterador() {
        posicionarray = 0;
    }

    @Override
    public boolean hasNext() {
        boolean result;
        result = posicionarray+1 < size;
        return result;
    }
    
    public void setSize(int size){
        this.size=size;
    }
    
    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
