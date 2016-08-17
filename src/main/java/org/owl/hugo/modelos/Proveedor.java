/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author huguito
 */
public class Proveedor extends Persona{
    private Date fechaAlta;
    private Date fechaBaja;
    private char estado;
    
    
    public Proveedor(){
        
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFmtAlta = fmt.format(fechaAlta);
        String fechaFmtBaja = fmt.format(fechaBaja);
        return super.getId() + "\t" + fechaFmtAlta + "\t" + fechaFmtBaja;
        
    }
}
