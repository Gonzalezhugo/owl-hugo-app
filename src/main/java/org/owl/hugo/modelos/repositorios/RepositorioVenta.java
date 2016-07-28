/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos.repositorios;

import org.owl.hugo.modelos.Identificable;

/**
 *
 * @author huguito
 */
public class RepositorioVenta extends Repositorio{
    private RepositorioVenta INSTANCE;
    private long secuencia;

    public RepositorioVenta() {
    }
    
    public RepositorioVenta getInstance(){
        if(INSTANCE==null){
            INSTANCE = new RepositorioVenta();
        }
        return INSTANCE;
    }
    
    @Override
    protected void generarIdentificacion(Identificable entidad) {
        entidad.setId(++secuencia);
    }
    
}
