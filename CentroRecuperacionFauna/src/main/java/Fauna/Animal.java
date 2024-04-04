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
    private String especie;
    private Double peso;
    private String gravedad;
    private Date fechaentrada;

    public Animal(String especie, Double peso, String gravedad, Date fechaentrada) {
        this.especie = especie;
        this.peso = peso;
        this.gravedad = gravedad;
        this.fechaentrada = fechaentrada;
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
    
}
