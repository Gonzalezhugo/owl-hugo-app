/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos;

/**
 *
 * @author huguito
 */
public class ItemVenta implements Identificable{
    
    private Articulo articulo;
    private int cantidad;
    private double costoItem;
    private Long id;

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCostoItem() {
        return costoItem;
    }

    public void setCostoItem(double costoItem) {
        this.costoItem = costoItem;
    }
    
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
    
    public double calcularSubtotalItem(){
        double subtotal = 0;
        subtotal = costoItem * articulo.getProcentajeImpuesto() / 100;
        return subtotal;
    }
    
    public double getcostoUnitario(){
        return costoItem /cantidad;
    }
    
}
