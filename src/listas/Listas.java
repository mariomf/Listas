/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author mario
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private Nodo inicio;
    public Listas(){
        inicio = null;
    }
    
    public void agregar(Persona persona){
        Nodo nuevo = new Nodo();
        nuevo.persona = persona;
        
        if (inicio == null) {
            nuevo.siguiente = null;
            inicio = nuevo;
        }else{
            nuevo.siguiente = inicio;
            inicio = nuevo;
        }
    }
    
}
