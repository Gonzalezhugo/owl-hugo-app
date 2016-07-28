/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos.repositorios;

import java.util.List;
import org.owl.hugo.modelos.Identificable;

/**
 *
 * @author huguito
 */
public class ListaPaginada {
    private int totalDatos;
    private List<Identificable> lista;
    public ListaPaginada(List<Identificable> lista, int totalDatos){
        this.lista = lista;
        this.totalDatos = totalDatos;
    }
    
    /**
     * 
     * @return  los datos
     */
    public int getTotalDatos(){
        return totalDatos;
    }
    
    /**
     * 
     * @param totalDatos 
     */
    public void setTotalDatos(int totalDatos){
        this.totalDatos = totalDatos;
    }
    
    /**
     * 
     * @return 
     */
    public List<Identificable>  getLista(){
        return lista;
    }
    
    /**
     * 
     * @param lista 
     */
    public void setLista(List<Identificable> lista){
        this.lista = lista;
    }
}
