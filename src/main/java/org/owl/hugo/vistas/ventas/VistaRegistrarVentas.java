/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas.ventas;

import com.sun.glass.ui.delegate.MenuDelegate;
import org.owl.hugo.controladores.ControladorVistaRegistrarVentas;
import org.owl.hugo.vistas.Visualizable;
import org.owl.hugo.vistas.componentes.MenuDeConsola;
import org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.limpiarLinea;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.limpiarPantalla;

/**
 *
 * @author huguito
 */
public class VistaRegistrarVentas implements Visualizable{
    private ControladorVistaRegistrarVentas controlador;

    public VistaRegistrarVentas(ControladorVistaRegistrarVentas controlador) {
        this.controlador = controlador;
    }
    
    
    @Override
    public void visualizar() {
        limpiarPantalla();
        imprimirTituloPantalla("Registrar Ventas");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAccion());
        menu.MostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
}
