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
public class Animal {
    
    private String color = "";
    private String tamanio = "";
    private String vestimenta = "";
    private String personalidad = "";
    private String nombre = "";

    public Animal(){
    }
    
    public Animal(String color, String tamanio, String vestimenta, String personalidad , String nombre){
        this.color = color;
        this.tamanio = tamanio;
        this.vestimenta = vestimenta;
        this.personalidad = personalidad;
        this.nombre = nombre;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getVestimenta() {
        return vestimenta;
    }

    public void setVestimenta(String vestimenta) {
        this.vestimenta = vestimenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /*
    private String nombre = "";
    private String tamano = "";
    private String personalidad = "";

    public Animal() {
    }
    
    public Animal(String nombre, String tamano, String personalidad){
        this.nombre = nombre;
        this.tamano = tamano;
        this.personalidad = personalidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }
    */
}
