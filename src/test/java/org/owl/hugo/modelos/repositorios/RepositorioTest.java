/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos.repositorios;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.owl.hugo.modelos.Identificable;
import org.owl.hugo.modelos.Persona;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.not;

/**
 *
 * @author huguito
 */
public class RepositorioTest {
    
    /**
     * Test of crear method, of class Repositorio.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Repositorio repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Hugo");
        persona.setApellido("González");
        persona.setNumeroDocumento("4475199");
        repo.crear(persona);
        Persona p = (Persona) repo.buscar(persona.getId());
        assertEquals(p, persona);
    }

    /**
     * Test of modificar method, of class Repositorio.
     */
    @Test
    public void testModificar() {
        System.out.println("Edit");
        Repositorio repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Hugo");
        persona.setApellido("González");
        persona.setNumeroDocumento("4475199");
        repo.crear(persona);
        
        //recuperacion
        Persona p = (Persona) repo.buscar(persona.getId());
        
        //modificacion
        p.setNumeroDocumento("4475188");
        repo.modificar(p);
        
        //test
        Persona pmod = (Persona)repo.buscar(persona.getId());
        assertEquals(pmod.getId(), p.getId());
        assertEquals("4475188", pmod.getNumeroDocumento());
    }

    /**
     * Test of remove method, of class Repositorio.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Repositorio repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Ismael");
        persona.setApellido("González");
        persona.setNumeroDocumento("4475199");
        repo.crear(persona);
        
        Persona personaAEliminar = (Persona) repo.buscar(persona.getId());
        assertNotNull(personaAEliminar);
        
        //eliminacion
        repo.remove(personaAEliminar);
        Persona personaEliminada = (Persona) repo.buscar(persona.getId());
        assertNull(personaEliminada);
    }

    /**
     * Test of buscar method, of class Repositorio.
     */
    @Test
    public void testBuscar_String() {
        Repositorio repo = new RepositorioImpl();
        
        Persona persona = new Persona();
        persona.setNombre("Hugo");
        persona.setApellido("González");
        persona.setNumeroDocumento("4475199");
        repo.crear(persona);
        
        Persona persona2 = new Persona();
        persona2.setNombre("Hugoncho");
        persona2.setApellido("González");
        persona2.setNumeroDocumento("4475188");
        repo.crear(persona2);
        
        Persona persona3 = new Persona();
        persona3.setNombre("Ismael");
        persona3.setApellido("González");
        persona3.setNumeroDocumento("4477777");
        repo.crear(persona3);
        
        
        List<Identificable> lista = repo.buscar("Hugo");
        assertThat(lista, hasItems(persona, persona2));
        assertThat(lista, not(hasItem(persona3)));
        
        List<Identificable> lista2 = repo.buscar("4477777");
        assertThat(lista2, hasItem(persona3));
        assertThat(lista2,not(hasItems(persona,persona2)));
        
        
    }

    /**
     * Test of buscar method, of class Repositorio.
     */
    @Test
    public void testBuscar_Long() {
        Repositorio repo = new RepositorioImpl();
        Persona persona = new Persona();
        persona.setNombre("Hugo");
        persona.setApellido("González");
        persona.setNumeroDocumento("4475199");
        repo.crear(persona);
        
        Persona encontrado = (Persona)repo.buscar(persona.getId());
        assertEquals(persona, encontrado);
    }

    /**
     * Test of generarIdentificacion method, of class Repositorio.
     */
    @Test
    public void testGenerarIdentificacion() {
    }

    public class RepositorioImpl extends Repositorio {
        private Long secuencia;
        
        public void generarIdentificacion(Identificable entidad) {
            entidad.setId(++secuencia);
        }
    }
    
}
