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
public class RepositorioCompra extends Repositorio{
    private static RepositorioCompra INSTANCE;
    private Long secuencia;
    
    public RepositorioCompra getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RepositorioCompra();
        }
        return INSTANCE;
    }
    
    @Override
    protected void generarIdentificacion(Identificable entidad) {
        entidad.setId(++secuencia);
    }
    
}
