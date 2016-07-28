/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos;

import java.util.Objects;

/**
 *
 * @author huguito
 */
public class Articulo implements Identificable{
    
    private String codigo;
    private String descripcion;
    private double precio;
    private double porcentajeImpuesto;
    private Long id;
    private int existencia;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    public void setPorcentajeImpuesto(double porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
    }
    
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
    
    public int getExistencia(){
        return existencia;
    }
    
    public boolean estadoAgotado(){
        if(existencia == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void sumarExistencia(int n){
        this.existencia = this.existencia + n;
    }
    
    public void restarExistencia(int n){
        this.existencia = this.existencia - n;
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(obj == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Articulo other = (Articulo)obj;
        if(!Objects.equals(this.id, other.id)){
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return id + "\t" + codigo + "\t" +  descripcion + "\t" + precio + "\t" + porcentajeImpuesto; 
    }
    
}
