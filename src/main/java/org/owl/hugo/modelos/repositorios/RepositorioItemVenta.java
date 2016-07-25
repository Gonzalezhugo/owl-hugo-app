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
public class RepositorioItemVenta extends Repositorio{
    
    private RepositorioItemVenta INSTANCE;
    private Long secuencia;
    
    public RepositorioItemVenta getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RepositorioItemVenta();
        }
        return INSTANCE;
    }
    
    @Override
    protected void generarIdentificacion(Identificable entidad) {
        entidad.setId(++secuencia);
    }
    
}
