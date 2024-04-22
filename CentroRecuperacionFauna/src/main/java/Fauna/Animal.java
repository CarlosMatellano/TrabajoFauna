package Fauna;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
public class Animal {
    protected String tipoAnimal;
    protected String nombre;
    protected String especie;
    protected Double peso;
    protected String gravedad;
    protected Date fechaentrada;
    protected String estado;
    protected String tratamiento;
    protected Date fechaLiberacion;
    protected Date fechaMuerte;
    
    
    //Constructor Principal
    public Animal(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.gravedad = gravedad;
        this.estado = estado;
        this.fechaentrada = fechaentrada;
    }

    //Constructor Tratamiento
    public Animal(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.gravedad = gravedad;
        this.estado = estado;
        this.fechaentrada = fechaentrada;
        this.tratamiento = tratamiento;
    }

    //Constructor Liberaión
    public Animal(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, Date fechaLiberacion) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.gravedad = gravedad;
        this.estado = estado;
        this.fechaentrada = fechaentrada;
        this.fechaLiberacion = fechaLiberacion;
    }

    public Animal(String tipoAnimal, String nombre, String especie, String gravedad, String estado, Date fechaentrada, Date fechaMuerte) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.gravedad = gravedad;
        this.estado = estado;
        this.fechaentrada = fechaentrada;
        this.fechaMuerte = fechaMuerte;
    }
    
    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFechaLiberacion() {
        return fechaLiberacion;
    }

    public void setFechaLiberacion(Date fechaLiberacion) {
        this.fechaLiberacion = fechaLiberacion;
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }  
}