/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.vistas.clientes;

import org.owl.hugo.controladores.ControladorVistaAdministrarClientes;
import org.owl.hugo.vistas.Visualizable;
import org.owl.hugo.vistas.componentes.MenuDeConsola;
import org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.imprimirTituloPantalla;
import static org.owl.hugo.vistas.componentes.utilitarios.UtilitarioConsola.limpiarPantalla;

/**
 *
 * @author huguito
 */
public class VistaAdministrarClientes implements Visualizable{
    private final ControladorVistaAdministrarClientes controlador;
    
    public VistaAdministrarClientes(ControladorVistaAdministrarClientes controlador){
        this.controlador = controlador;
    }
    @Override
    public void visualizar() {
        limpiarPantalla();
        imprimirTituloPantalla("Administrar Clientes");
        MenuDeConsola menu = new MenuDeConsola(controlador.obtenerNombresAcciones());
        menu.MostrarMenu();
        int accion = menu.SolicitarOpcion();
        controlador.procesarAccion(accion);
    }
}