package Modelo;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class Factura {
    
    private int id_cliente;
    private ArrayList<Pizza> pedido;
    private float total;

    public Factura(int id_cliente, ArrayList<Pizza> pedido, float total) {
        this.id_cliente = id_cliente;
        this.pedido = pedido;
        this.total = total;
    }

    

    

    /**
     * @return the pedido
     */
    public ArrayList<Pizza> getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(ArrayList<Pizza> pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }
    
    
    
}
