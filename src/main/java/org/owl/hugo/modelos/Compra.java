/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author huguito
 */
public class Compra implements Identificable{
    private Date fechaCompra;
    private String timbradoFactura;
    private String numeroFactura;
    private Proveedor proveedor;
    private List<ItemCompra> items;
    private Long id;
    
     public Compra(){
        items = new ArrayList<>();
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
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

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<ItemCompra> getItems() {
        return items;
    }

    public void setItems(List<ItemCompra> items) {
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
    
    /*
    public double calcularTotalCompra(){
        double total = 0.0;
        for(ItemCompra i:items){
            total = total + i.getCostoItem();
        }
        return total;
    }
    
    public double calcularSubTotalCompra(){
        double subtotal = 0.0;
        for(ItemCompra i:items){
            subtotal = subtotal + i.getCostoItem() - (i.getCostoItem() * i.getArticulo().getPorcentajeImpuesto() /100);
        }
        return subtotal;
    }
    
    public double CalcularMontoImpuesto(){
        double montoImpuesto = 0.0;
        for(ItemCompra i: items){
            montoImpuesto = montoImpuesto + (i.getCostoItem() * i.getArticulo().getPorcentajeImpuesto() / 100);
        }
        return montoImpuesto;
    }
*/
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
        final Compra other = (Compra) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }  
    
    @Override
    public String toString(){
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        String fechaFormateada = formatDate.format(fechaCompra);
        
        
        return  id + "\t" +  fechaFormateada + "\t" + timbradoFactura + "\t" + 
                numeroFactura + "\t" + proveedor + "\t" + items ;
    
    }
    
}
