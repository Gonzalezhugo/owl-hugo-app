/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas;

import org.owl.hugo.controladores.ControladorVistaPrincipal;
import org.owl.hugo.vistas.componentes.MenuDeConsola;
import org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.limpiarPantalla;

/**
 *
 * @author hugo
 */
public class VistaPrincipal implements Visualizable {

    private final ControladorVistaPrincipal controlador;
    
    public VistaPrincipal(ControladorVistaPrincipal controlador){
        this.controlador = controlador;
    }
    
    @Override
    public void visualizar() {
        limpiarPantalla();
        imprimirTituloPantalla("Applicacion de Prueba");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.MostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
    
    
}
