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
public class Persona {

    /**
     * @return the inicial
     */
    public char getInicial() {
        return inicial;
    }

    /**
     * @param inicial the inicial to set
     */
    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    private char inicial;
    private double peso;
    private int edad;
    private double altura;
    
    public Persona(){}
    
    public Persona(char inicial, double peso, int edad, double altura){
        this.inicial = inicial;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;
    }
}
