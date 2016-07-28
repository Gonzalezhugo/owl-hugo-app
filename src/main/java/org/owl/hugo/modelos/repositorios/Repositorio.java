/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos.repositorios;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.owl.hugo.modelos.Identificable;

/**
 *
 * @author huguito
 */
public abstract class Repositorio {
    private final Map<Long,Identificable> repositorio = new HashMap<>();
    
    public void crear(Identificable entidad){
        if (entidad==null){
            throw new NullPointerException();
        }
        
        if(entidad.getId()==null){
            generarIdentificacion(entidad);
            if(repositorio.containsKey(entidad.getId())){
                throw new IllegalArgumentException("Restrincción violada, registro duplicado");
            }else{
                repositorio.put(entidad.getId(), entidad);
            }
            
        }
    }
    
    public void modificar(Identificable entidad){
        if(entidad == null){
            throw new NullPointerException();
        }
        
        if (entidad.getId() == null){
            throw new IllegalArgumentException("Se requiere el identificador.");
        }
        
        if(repositorio.containsKey(entidad.getId())){
            repositorio.replace(entidad.getId(), entidad);
        }
    }
    
    public void remove(Identificable entidad){
        if (entidad == null){
            throw new NullPointerException();
        }
        
        if (entidad.getId() == null){
            throw new IllegalArgumentException("Se requiere el identificador");
        }
        
        if (repositorio.containsKey(entidad.getId())){
            repositorio.remove(entidad.getId());
        }
    }
    
    public List<Identificable> buscar (String filtros){
        if (filtros == null){
            throw new NullPointerException();
        }
        
        return repositorio.values()
                          .stream()
                          .filter(e->  {
                                        String valor = e.toString()
                                                        .toLowerCase()
                                                        .replaceAll(" ", "")
                                                        .replace(",", "");
                                        return valor
                                                    .contains(filtros.replaceAll(" ","")
                                                                     .toLowerCase()
                                                             );
                                       })
                           .collect(Collectors.toList());
    }
    
    public Identificable buscar(Long id){
        if (id == null){
            throw new NullPointerException();
        }
        
        return repositorio.get(id);
    }
    
    /**
     * Realiza una busqueda paginada basada en un patrón que coincida con
     * el resultado de la ejecución del método toString del Identificable y 
     * delimitada por la cantidad de elementos solicitados, empezando por el 
     * índice inicial especificado.
     * 
     * @param filtros {@code String} patrón de búsqueda.
     * @param indiceInicial {@code int} que indica el índice del primer 
     * elemento a retornar.
     * @param cantidadElementos {@code int} que indica la cantidad de elementos 
     * a retornar a partir del primer elemento solicitado por el parámetro 
     * {@code indiceInicial}, incluído el mismo.
     * @return 
     */
    
    public ListaPaginada buscar(String filtros, int indiceInicial, int cantidadElementos){
        List<Identificable> listaTotal = this.buscar(filtros);
        int indiceFinalPaginacion = indiceInicial + cantidadElementos;
        int indiceMaximo = listaTotal.size()-1;
        
        if(indiceInicial < 0 || indiceInicial > indiceMaximo){
            throw new IllegalArgumentException("Indice inicial esta fuera del limite de la lista de resultados.");
                    
        }
        
        // si se desborda el tamaño se retorna todos los elementos restantes
        if (indiceFinalPaginacion > listaTotal.size()){
            indiceFinalPaginacion = listaTotal.size();
        }
        
        return new ListaPaginada(listaTotal.subList(indiceInicial, indiceFinalPaginacion), listaTotal.size());
    }
    
    
    /**
     * Debe generar una identificación única
     * @param entidad 
     */
    protected abstract void generarIdentificacion(Identificable entidad);
    
}
