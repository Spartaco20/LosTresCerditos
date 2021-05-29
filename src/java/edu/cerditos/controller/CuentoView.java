/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cerditos.controller;

import edu.cerditos.model.Casa;
import edu.cerditos.model.Cerdo;
import edu.cerditos.model.Lobo;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@ViewScoped
public class CuentoView implements Serializable{

    private Casa registroCasa = new Casa();
    private ArrayList<Casa> listaCasas = new ArrayList<>();

    private Cerdo registroCerdo = new Cerdo();
    private ArrayList<Cerdo> listaCerdos = new ArrayList<>();
    
    private Lobo registroLobo = new Lobo();
    private ArrayList<Lobo> listaLobos = new ArrayList<>();

    private String material ="";
    
    
    /**
     * Creates a new instance of CuentoView
     */
    public CuentoView() {
    }

    public void guardarCasaNueva() {
        listaCasas.add(new Casa(registroCasa.getColor(), registroCasa.getTamanio(), registroCasa.getMaterial()));
        registroCasa = new Casa();
    }

    public void registrarNuevoCerdo() {
        
        Casa casaSeleccionada = new Casa();
        
        for (Casa objCasa : listaCasas) {
            if(objCasa.getMaterial().endsWith(material)){
            casaSeleccionada = objCasa;
            break;
            }
        }
        
        listaCerdos.add(new Cerdo(registroCerdo.getColor(), 
                                   registroCerdo.getTamanio(), 
                                   registroCerdo.getVestimenta(),
                                   registroCerdo.getPersonalidad(), 
                                   registroCerdo.getNombre(), 
                                   registroCerdo.getInstrumento(),
                                   casaSeleccionada));
        registroCerdo = new Cerdo();
    }

    public void registrarLobo() {
        
        Casa casaSeleccionada = new Casa();
        
        for (Casa objCasa : listaCasas) {
            if(objCasa.getMaterial().endsWith(material)){
            casaSeleccionada = objCasa;
            break;
            }
        }
        
        listaLobos.add(new Lobo(registroLobo.getColor(), 
                                   registroLobo.getTamanio(), 
                                   registroLobo.getVestimenta(),
                                   registroLobo.getPersonalidad(), 
                                   registroLobo.getNombre(), 
                                   casaSeleccionada));
        registroCerdo = new Cerdo();
    }

    public void cantar(Cerdo cCanta){
        System.out.println(cCanta.cantar("Vallenato"));
    }
    
    public void bailar(Cerdo cBaila){
        System.out.println(cBaila.bailar("Champeta"));
    }
 
    public void tocar(Cerdo cToca){
        System.out.println(cToca.tocarInstrumento());
    }
    
    
    
    
    
    public Casa getRegistroCasa() {
        return registroCasa;
    }

    public void setRegistroCasa(Casa registroCasa) {
        this.registroCasa = registroCasa;
    }

    public ArrayList<Casa> getListaCasas() {
        return listaCasas;
    }

    public void setListaCasas(ArrayList<Casa> listaCasas) {
        this.listaCasas = listaCasas;
    }

    public Cerdo getRegistroCerdo() {
        return registroCerdo;
    }

    public void setRegistroCerdo(Cerdo registroCerdo) {
        this.registroCerdo = registroCerdo;
    }

    public ArrayList<Cerdo> getListaCerdos() {
        return listaCerdos;
    }

    public void setListaCerdos(ArrayList<Cerdo> listaCerdos) {
        this.listaCerdos = listaCerdos;
    }

    public Lobo getRegistroLobo() {
        return registroLobo;
    }

    public void setRegistroLobo(Lobo registroLobo) {
        this.registroLobo = registroLobo;
    }

    public ArrayList<Lobo> getListaLobos() {
        return listaLobos;
    }

    public void setListaLobos(ArrayList<Lobo> listaLobos) {
        this.listaLobos = listaLobos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    
    /*
    private Casa objCasa = new Casa();
    private ArrayList<Casa> listaCasas = new ArrayList<>();
    
    public CuentoView() {
    }

    public void crearCasa(){
        listaCasas.add(new Casa(objCasa.getMaterial(), objCasa.getResistencia()));
    }
    
    public Casa getObjCasa() {
        return objCasa;
    }

    public void setObjCasa(Casa objCasa) {
        this.objCasa = objCasa;
    }

    public ArrayList<Casa> getListaCasas() {
        return listaCasas;
    }

    public void setListaCasas(ArrayList<Casa> listaCasas) {
        this.listaCasas = listaCasas;
    }
    */
}
