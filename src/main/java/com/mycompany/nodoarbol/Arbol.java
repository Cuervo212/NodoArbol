package com.mycompany.nodoarbol;

/**
 *
 * @author JERONIMO CASTRO
 */
public class Arbol {
    NodoArbol inicial;
    
    public Arbol(){
        this.inicial = null;
    }

    public void insertar(int valor){
        if(inicial == null){
            inicial = new NodoArbol(valor);
        }else{
            inicial.insertar(valor);
        }
    }
    public void dispararPreorder(){
        this.preorden(this.inicial);
    }
    public void preorden(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            System.out.print(nodo.getValue()+" ");
            preorden(nodo.getLeft());
            preorden(nodo.getRight());
        }
    }
    public void dispararInorder(){
        this.inorder(this.inicial);
    }
    public void inorder(NodoArbol nodo){
        if(nodo == null){
            return;
        }
        inorder(nodo.getLeft());
        System.out.print(nodo.getValue()+" ");
        inorder(nodo.getRight());
    }    
    public void dispararPostorder(){
        postorder(this.inicial);
    } 
    public void postorder(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            postorder(nodo.getLeft());
            postorder(nodo.getRight());
            System.out.print(nodo.getValue()+" ");
        }
    } 
    }

