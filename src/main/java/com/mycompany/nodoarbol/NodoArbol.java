/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nodoarbol;

/**
 *
 * @author JERONIMO CASTRO
 */
public class NodoArbol {
    private int value;
    private NodoArbol left;
    private NodoArbol right;

    public NodoArbol(int valor) {
        this.value = valor;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public NodoArbol getLeft() {
        return left;
    }

    public NodoArbol getRight() {
        return right;
    }
    
    public void insertar(int value){
        if(value < this.value){
            if(this.left == null){
                this.left = new NodoArbol(value);
            }else{
                this.left.insertar(value);
            }
        }else{
            if(this.right == null){
                this.right = new NodoArbol(value);
            }else{
                this.right.insertar(value);
            }

        }
    }
    
    

    
}
