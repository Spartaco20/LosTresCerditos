/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cerditos.model;

/**
 *
 * @author HP
 */
public class Cerdo extends Animal{
    
    private String instrumento = "";
    private Casa casa = new Casa();

    public Cerdo() {
    }

    public Cerdo(String color, String tamanio, String vestimenta, String personalidad, String nombre) {
        super(color, tamanio, vestimenta, personalidad, nombre);
    }

    public Cerdo(String color, String tamanio, String vestimenta, String personalidad, String instrumento, String nombre) {
        super(color, tamanio, vestimenta, personalidad, nombre);
        this.instrumento = instrumento;
    }

    public Cerdo(String color, String tamanio, String vestimenta, String personalidad, String nombre, String instrumento, Casa casa) {
        super(color, tamanio, vestimenta, personalidad, nombre);
        this.instrumento = instrumento;
        this.casa = casa;
    }

    public String cantar(String melodia) {
        return this.getNombre() + " Canta " + melodia + " = Quien teme al lobo Feroz ....";
    }

    public String bailar(String ritmo) {
        return this.getNombre() + " Baila " + ritmo;
    }

    public String construir() {
        return this.getNombre() + " Construir casa de color : " + this.casa.getColor()
                + ",material " + this.casa.getMaterial() + " y tamaño " + this.casa.getTamanio();
    }
    
     public String tocarInstrumento() {
        return this.getNombre() + " toca el : " + this.instrumento;                
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    
    /*
    private String instrumento = "";
    private Casa casa;
    
    public Cerdo() {
    }

    public Cerdo(String instrumento, Casa casa, String nombre, String tamano, String personalidad){
        super(nombre, tamano, personalidad);
        this.instrumento = instrumento;
        this.casa = casa;
    }
    
    public String cantar(){
        return "El cerdo con nombre: " + this.getNombre() + "canta !!!!! Quien teme al lobo feroz...";
    }
    
    public String bailar(String tipoDeBaile){
        return "El cerdo " + this.getNombre() + " baila " + tipoDeBaile;
    }
    
    public void correr(){
        
    }
    
    public String tocarInstrumento(){
        return "El cerdo " + this.getNombre() + " toca el instrumento " + this.instrumento;
    }
    
    public String construir(){
        return "El cerdo " + this.getNombre() + " construye casa de material " + this.casa.getMaterial();
    }
    
    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    */
}
