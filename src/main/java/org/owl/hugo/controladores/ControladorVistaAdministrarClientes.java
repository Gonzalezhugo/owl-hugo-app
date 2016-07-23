/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.controladores;

import org.owl.hugo.vistas.VistaPrincipal;
import org.owl.hugo.vistas.Visualizable;

/**
 *
 * @author huguito
 */
public class ControladorVistaAdministrarClientes implements Controlador{
    
    public static enum Accion{
        
        CREAR_CLIENTES ("Crear Clientes"),
        EDITAR_CLIENTES("Editar Clientes"),
        ELIMINAR_CLIENTES("Eliminar Clientes"),
        VOLVER("Volver a la Pantalla Principal");
        
        Accion(String nombre){
            this.nombre = nombre;
        }
        private String nombre;
        
        public String getNombre(){
            return nombre;
        }
    }

    @Override
    public void procesarAccion(int indiceAccion) {
        Accion accion = Accion.values()[indiceAccion];
        Controlador controlador = null;
        Visualizable vista = null;
        
        switch(accion){
            case VOLVER:
                controlador = new ControladorVistaPrincipal();
                vista = new VistaPrincipal((ControladorVistaPrincipal)controlador);
                break;
        }
        vista.visualizar();
    }
    
    public String[] obtenerAcciones(){
        String[] nombres = new String [Accion.values().length];
        for(int i=0; i < nombres.length; i++){
           nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
}
