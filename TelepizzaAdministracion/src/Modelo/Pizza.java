package Modelo;


import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Profesor
 */
public class Pizza {

    private String nombre;
    private int tamanio; //0-Pequeña 1-Mediana 2-Familiar
    private int masa; // 0-Fina 1-Clasica
    private float precio; //Se calcula el precio al insertar ingredientes.
    private ArrayList<Ingrediente> vIngredientes;

    public Pizza(Pizza p) {
        this.nombre = p.nombre;
        this.tamanio = 0;
        this.precio = 0;
        this.vIngredientes = new ArrayList<>();
    }
    
    public Pizza(String nombre, float precio) {
        this.nombre = nombre;
        this.tamanio = 0;
        this.precio = precio;
        this.vIngredientes = new ArrayList<>();
    }

    public Pizza(String nombre, int tamanio, int masa, float precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.masa = masa;
        this.precio = precio;
        this.vIngredientes = new ArrayList<>();
    }

    public Pizza(String nombre) {
        this.nombre = nombre;
        this.tamanio = 0;
        this.masa = 0;
        this.precio = 10;
        this.vIngredientes = new ArrayList<>();
    }

    /**
     * Calcula el precio de la pizzas con las tarifas actuales: Pizzas pequeña +
     * 1€, mediana + 5€, familiar +7€ Masas: fina +2€ clásica +0€
     *
     * @return
     */
    public void cularPrecio() {
        float aux = 0;
        switch (tamanio) {
            case 0:
                aux += 1;
                break;
            case 1:
                aux += 5;
                break;
            case 2:
                aux += 7;
                break;
        }
        switch (masa) {
            case 0:
                aux += 2;
                break;
            case 1:
                aux += 0;
                break;
        }
        Iterator it = vIngredientes.iterator();
        while (it.hasNext()) {
            Ingrediente ing = (Ingrediente) it.next();
            aux += 0.5;
        }
        this.precio+=aux;
    }

    public void anadirIngrediente(Ingrediente ingrediente) {
        vIngredientes.add(ingrediente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getvIngredientes() {
        return vIngredientes;
    }

    public void setvIngredientes(ArrayList<Ingrediente> vIngredientes) {
        this.vIngredientes = vIngredientes;
    }

    @Override
    public String toString() {
        String tamanio ="";
        String masa = "";
        switch (this.tamanio) {
            case 0:
                tamanio = "Pequeña";
                break;
            case 1:
                tamanio = "Mediana";
                break;
            case 2:
                tamanio = "Familiar";
                break;
        }
        if (this.masa==0){
            masa = "Masa Fina";
        }else{
            masa = "Masa Clasica";
        }
        return nombre + " " + tamanio + " " + masa + " " + precio + "€ Ingredientes Extra: " + vIngredientes;
    }

}
