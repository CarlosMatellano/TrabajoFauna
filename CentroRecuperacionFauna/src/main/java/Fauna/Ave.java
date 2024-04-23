/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fauna;

import java.util.Date;

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
public class Ave extends Animal {

    private String lesioncaza;
    

    public Ave(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String lesioncaza) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada);
        this.lesioncaza = lesioncaza;
    }

    public Ave(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, String lesioncaza) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, tratamiento);
        this.lesioncaza = lesioncaza;
    }
    public Ave(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaLiberacion, String veterinario, String lesioncaza) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, fechaLiberacion, veterinario);
        this.lesioncaza = lesioncaza;
    }
    public Ave(String tipoAnimal, String nombre, String especie, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaMuerte, String veterinario, String lesioncaza) {
        super(tipoAnimal, nombre, especie, gravedad, estado, fechaentrada, fechaMuerte, veterinario);
        this.lesioncaza = lesioncaza;
    }

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
