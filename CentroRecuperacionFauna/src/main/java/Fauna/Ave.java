/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fauna;

import java.util.Date;

/**
 * Clase Ave que representa un tipo específico de animal.
 * 
 * Esta clase hereda de la clase Animal y tiene características adicionales específicas
 * para aves, como información sobre lesiones de caza.
 * 
 * @see Animal
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
public class Ave extends Animal {

    /**
     * Representa la lesión de caza del ave.
     */
    private String lesioncaza;
    
    /**
     * Constructor para crear un objeto Ave con información básica.
     * 
     * @param tipoAnimal    el tipo de animal
     * @param nombre        el nombre del ave
     * @param especie       la especie del ave
     * @param peso          el peso del ave
     * @param gravedad      la gravedad del estado del ave
     * @param estado        el estado actual del ave
     * @param fechaentrada  la fecha en que el ave ingresó
     * @param lesioncaza    la descripción de la lesión de caza
     */
    public Ave(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String lesioncaza) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada);
        this.lesioncaza = lesioncaza;
    }
    /**
     * Constructor para crear un objeto Ave con información adicional sobre tratamiento.
     * 
     * @param tipoAnimal    el tipo de animal
     * @param nombre        el nombre del ave
     * @param especie       la especie del ave
     * @param peso          el peso del ave
     * @param gravedad      la gravedad del estado del ave
     * @param estado        el estado actual del ave
     * @param fechaentrada  la fecha en que el ave ingresó
     * @param tratamiento   el tratamiento aplicado al ave
     * @param lesioncaza    la descripción de la lesión de caza
     */
    public Ave(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, String lesioncaza) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, tratamiento);
        this.lesioncaza = lesioncaza;
    }
    /**
     * Constructor para crear un objeto Ave con información sobre liberación.
     * 
     * @param tipoAnimal       el tipo de animal
     * @param nombre           el nombre del ave
     * @param especie          la especie del ave
     * @param peso             el peso del ave
     * @param gravedad         la gravedad del estado del ave
     * @param estado           el estado actual del ave
     * @param fechaentrada     la fecha en que el ave ingresó
     * @param tratamiento      el tratamiento aplicado al ave
     * @param fechaLiberacion  la fecha de liberación del ave
     * @param veterinario      el nombre del veterinario responsable
     * @param lesioncaza       la descripción de la lesión de caza
     */
    public Ave(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaLiberacion, String veterinario, String lesioncaza) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, fechaLiberacion, veterinario);
        this.lesioncaza = lesioncaza;
    }
    /**
     * Constructor para crear un objeto Ave con información sobre fecha de muerte.
     * 
     * @param tipoAnimal       el tipo de animal
     * @param nombre           el nombre del ave
     * @param especie          la especie del ave
     * @param gravedad         la gravedad del estado del ave
     * @param estado           el estado actual del ave
     * @param fechaentrada     la fecha en que el ave ingresó
     * @param tratamiento      el tratamiento aplicado al ave
     * @param fechaMuerte      la fecha en que el ave murió
     * @param veterinario      el nombre del veterinario responsable
     * @param lesioncaza       la descripción de la lesión de caza
     */
    public Ave(String tipoAnimal, String nombre, String especie, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaMuerte, String veterinario, String lesioncaza) {
        super(tipoAnimal, nombre, especie, gravedad, estado, fechaentrada, fechaMuerte, veterinario);
        this.lesioncaza = lesioncaza;
    }

    /**
     * 
     * Aquí todos los geters y seters para interactuar con los objetos
     */
    public String getLesion() {
        return lesioncaza;
    }

    public void setLesioncaza(String lesioncaza) {
        this.lesioncaza = lesioncaza;
    }
    
    @Override
    public String toString() {
        String texto;
        if (tratamiento != null) {
            texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión caza: " + lesioncaza + " | Estado: " + estado + " | Tratamiento: " + tratamiento;
        } else {
            if (fechaLiberacion != null) {
                texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " |  Fecha Entrada: " + fechaentrada + " | Lesión caza: " + lesioncaza +" | Estado: " + estado + " | Fecha Liberación: " + fechaLiberacion+" | Veterianario: "+veterinario;
            } else {
                if (fechaMuerte != null) {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión caza: " + lesioncaza + " | Estado: " + estado + " | Fecha Fallecimiento: " + fechaMuerte+" | Veterianario: "+veterinario;

                } else {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión caza: " + lesioncaza + " | Estado: " + estado;
                }
            }
        }
        return texto;
    }
}
