/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.owl.hugo.modelos;

import java.util.Objects;

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
    private int edad;
    private Long id;
    
    public Persona(){
        
    }
    
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
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        String sexoStr = sexo == 'M' ? "Masculino" : "Femenino";
        return id + "\t" + numeroDocumento + "\t" + nombre + "\t" + apellido + "\t" + sexoStr + "\t" + telefono + "\t"+ email;
    }
}
