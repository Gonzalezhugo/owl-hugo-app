package org.owl.hugo.controladores;

import org.owl.hugo.vistas.VistaAdministrarArticulos;
import org.owl.hugo.vistas.VistaPrincipal;
import org.owl.hugo.vistas.Visualizable;

/**
 *
 * @author hugo
 */
public class ControladorVistaPrincipal implements Controlador{

    public static enum Accion {
        ADMINISTRAR_ARTICULOS("Administrar Articulos"),
        ADMINISTRAR_CIENTES("Administrar Clientes"),
        ADMINISTRAR_PROVEEDORES("Administrar Proveedores"),
        REGISTRAR_COMPRAS("Registar Compras"),
        REGISTAR_VENTAS("Registrar Ventas"),
        CONSULTAR_VENTAS("Consultar Ventas"),
        CONSULTAR_COMPRAS("Consultar Compras"),
        SALIR("Salir");
        
        private final String nombre;
        
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
        Controlador controlador = null;
        Visualizable vista = null;
        switch (accion) {
            case ADMINISTRAR_ARTICULOS:
                controlador = new ControladorVistaAdministrarArticulos();
                vista = new VistaAdministrarArticulos((ControladorVistaAdministrarArticulos)controlador);
                break;
        }
        vista.visualizar();
    }
    
    
    public String [] obtenerNombresAcciones(){
        String [] nombres = new String[Accion.values().length];
        for(int i=0; i < nombres.length; i++){
            nombres[i] = Accion.values()[i].getNombre();
        }
        return nombres;
    }
    
}
