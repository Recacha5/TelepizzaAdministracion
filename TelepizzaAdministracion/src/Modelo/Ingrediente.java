package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class Ingrediente {
    private String nombre;
    private float precio;

    public Ingrediente(String nombre) {
        this.nombre= nombre;
        precio =0;
    }

    public Ingrediente(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
