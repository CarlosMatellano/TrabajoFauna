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
public class Ave extends Animal{
    
    private String lesioncaza;
    
    public Ave(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, Date fechaentrada, String lesioncaza) {
        super(tipoAnimal, nombre, especie, peso, gravedad, fechaentrada);
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
        return "TP: "+tipoAnimal+" | Nombre: "+nombre+" | Especie: "+especie+" | Peso: "+peso+" | Gravedad: "+gravedad+" | Fecha Entrada: "+fechaentrada+" | Lesioncaza: "+lesioncaza;
    }
}
