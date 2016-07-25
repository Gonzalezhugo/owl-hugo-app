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
public class RepositorioCliente extends Repositorio{
    private static RepositorioCliente INSTANCE;
    private Long secuencia;
    
    public RepositorioCliente getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RepositorioCliente();
        }
        return INSTANCE;
    }
    
    @Override
    protected void generarIdentificacion(Identificable entidad) {
        entidad.setId(++secuencia);
    }
    
}
