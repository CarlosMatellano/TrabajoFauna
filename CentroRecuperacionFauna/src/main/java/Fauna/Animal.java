package Fauna;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Animal representa animales dentro de un ceutro de fauna.
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
    protected String veterinario;
    
    /**
     * Constructor principal para crear un Animal con detalles básicos.
     * 
     * @param tipoAnimal El tipo de animal.
     * @param nombre El nombre del animal.
     * @param especie La especie del animal.
     * @param peso El peso del animal.
     * @param gravedad El grado de gravedad de la condición del animal.
     * @param estado El estado actual del animal.
     * @param fechaentrada La fecha de admisión.
     */
    public Animal(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.gravedad = gravedad;
        this.estado = estado;
        this.fechaentrada = fechaentrada;
    }

    /**
     * Constructor para crear un Animal con tratamiento específico.
     * 
     * @param tipoAnimal El tipo de animal.
     * @param nombre El nombre del animal.
     * @param especie La especie del animal.
     * @param peso El peso del animal.
     * @param gravedad El grado de gravedad de la condición del animal.
     * @param estado El estado actual del animal.
     * @param fechaentrada La fecha de admisión.
     * @param tratamiento El tratamiento administrado.
     */
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

    /**
     * Constructor para crear un Animal que incluye la fecha de liberación y el veterinario.
     * 
     * @param tipoAnimal El tipo de animal.
     * @param nombre El nombre del animal.
     * @param especie La especie del animal.
     * @param peso El peso del animal.
     * @param gravedad El grado de gravedad de la condición del animal.
     * @param estado El estado actual del animal.
     * @param fechaentrada La fecha de admisión.
     * @param fechaLiberacion La fecha de liberación.
     * @param veterinario El veterinario responsable.
     */
    public Animal(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, Date fechaLiberacion, String veterinario) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.gravedad = gravedad;
        this.estado = estado;
        this.fechaentrada = fechaentrada;
        this.fechaLiberacion = fechaLiberacion;
        this.veterinario = veterinario;
    }
    /**
     * Constructor para crear un Animal con información de fecha de muerte y veterinario.
     * 
     * @param tipoAnimal El tipo de animal.
     * @param nombre El nombre del animal.
     * @param especie La especie del animal.
     * @param gravedad La gravedad de la condición del animal.
     * @param estado El estado actual del animal.
     * @param fechaentrada La fecha de admisión.
     * @param fechaMuerte La fecha de muerte.
     * @param veterinario El veterinario responsable.
     */
    public Animal(String tipoAnimal, String nombre, String especie, String gravedad, String estado, Date fechaentrada, Date fechaMuerte, String veterinario) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.especie = especie;
        this.gravedad = gravedad;
        this.estado = estado;
        this.fechaentrada = fechaentrada;
        this.fechaMuerte = fechaMuerte;
        this.veterinario = veterinario;
    }
    
    
    /**
     * 
     * Aquí todos los geters y seters para interactuar con los objetos
     */
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
    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }    
}