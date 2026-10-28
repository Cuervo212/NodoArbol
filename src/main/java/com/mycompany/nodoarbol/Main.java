package com.mycompany.nodoarbol;

/**
 *
 * @author JERONIMO CASTRO
 */
public class Main {
    public static void main(String[] args) {
        Arbol OneDirection = new Arbol();
        OneDirection.insertar(43);
        OneDirection.insertar(10);
        OneDirection.insertar(8);
        OneDirection.insertar(54);
        OneDirection.insertar(15);
        OneDirection.insertar(50);
        OneDirection.insertar(53);
        
        System.out.print("Inorder:   ");
        OneDirection.dispararInorder();
        System.out.print("\nPreorder:  ");
        OneDirection.dispararPreorder();
        System.out.print("\nPostorder: ");
        OneDirection.dispararPostorder();
        

    }
    
}
