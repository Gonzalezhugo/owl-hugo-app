/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.controladores;

import org.owl.hugo.vistas.VistaPrincipal;

/**
 *
 * @author huguito
 */
public class ControladorVistaRegistrarCompras implements Controlador{
    
    public static enum Accion{
        REGISTRAR_COMPRA("Registrar Compra"),
        LISTAR_FACTURAS("Listar Facturas"),
        VOLVER("Volver a la pantalla anterior");
        
        private String nombre;
        
        Accion(String nombre){
            this.nombre = nombre;
        }
        
        public String getNombre(){
            return nombre;
        }
    }
    
    @Override
    public void procesarAccion(int indiceAccion) {
        Accion accion = Accion.values()[indiceAccion];
        ControladorVistaPrincipal controlador = null;
        VistaPrincipal vista = null;
        switch (accion){
            case VOLVER:
                controlador = new ControladorVistaPrincipal();
                vista = new VistaPrincipal(controlador);
                break;
        }
        vista.visualizar();
    }   
    
    public String[] obtenerNombresAcciones(){
        String[] nombres = new String[Accion.values().length];
        for(int i=0; i< nombres.length; i++){
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
    
}