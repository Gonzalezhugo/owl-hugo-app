/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos;

/**
 *
 * @author huguito
 */
public class Persona implements Identificable{
    private String nombre;
    private String apellido;
    private String razonSocial;
    private String ruc;
    private String numeroDocumento;
    private String direccion;
    private String telefono;
    private String email;
    private char sexo;
    private Integer edad;
    private Long id;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getRazonSocial(){
        return razonSocial;
    }
    
    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }
    
    public String getRuc(){
        return ruc;
    }
    
    public void setRuc(String ruc){
        this.ruc = ruc;
    }
    
    public String getNumeroDocumento(){
        return numeroDocumento;
    }
    
    public void setNumeroDocumento(String numeroDocumento){
        this.numeroDocumento = numeroDocumento;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public Integer getEdad(){
        return edad;
    }
    
    public void setEdad(Integer edad){
        this.edad = edad;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
