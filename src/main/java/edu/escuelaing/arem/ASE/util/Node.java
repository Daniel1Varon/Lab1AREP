/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.util;

/**
 *
 * @author "Daniel Varón"
 */
class Node<T> {
    
    private T val = null;
    private Node next = null;
    
    public Node(T val){
        this.val=val;
    }
    
    public void setNext(Node next){
        this.next=next;
    }
    
    public T getValue(){
        return val;
    }
    
}
