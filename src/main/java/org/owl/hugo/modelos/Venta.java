/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author huguito
 */
public class Venta implements Identificable{
    
    private Date fechaventa;
    private String timbradoFactura;
    private String numeroFactura;
    private Cliente cliente;
    private List<ItemVenta> items;
    private Long id;

    public Venta(){
        items= new ArrayList<>();
    }
    
    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getTimbradoFactura() {
        return timbradoFactura;
    }

    public void setTimbradoFactura(String timbradoFactura) {
        this.timbradoFactura = timbradoFactura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenta> getItems() {
        return items;
    }

    public void setItems(List<ItemVenta> items) {
        this.items = items;
    }
    
    @Override
    public Long getId() {
       return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
    
    public double calcularTotalVenta(){
        double total = 0.0;
        for(ItemVenta i:items){
            total = total + i.getCostoItem();
        }
        return total;
    }
    
    public double calcularSubTotalVenta(){
        double subtotal = 0.0;
        for(ItemVenta i:items){
            subtotal = subtotal + i.getCostoItem() - (i.getCostoItem() * i.getArticulo().getPorcentajeImpuesto()/100);
        }
        return subtotal;
    }
    
    public double MontoTotalImpuesto(){
        double totalImpuesto = 0.0;
        for (ItemVenta i:items){
            totalImpuesto = totalImpuesto + (i.getCostoItem() * i.getArticulo().getPorcentajeImpuesto()/100);
        }
        return totalImpuesto;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venta other = (Venta) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
