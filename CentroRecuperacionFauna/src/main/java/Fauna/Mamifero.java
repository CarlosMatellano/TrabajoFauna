package Fauna;

import java.util.Date;

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
public class Mamifero extends Animal {

    private String lesionAtropello;

    public Mamifero(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String lesionAtropello) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada);
        this.lesionAtropello = lesionAtropello;
    }

    public Mamifero(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, String lesionAtropello) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, tratamiento);
        this.lesionAtropello = lesionAtropello;
    }

    public Mamifero(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaLiberacion, String lesionAtropello) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, fechaLiberacion);
        this.lesionAtropello = lesionAtropello;
    }

    public Mamifero(String tipoAnimal, String nombre, String especie, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaMuerte, String lesionAtropello) {
        super(tipoAnimal, nombre, especie, gravedad, estado, fechaentrada, fechaMuerte);
        this.lesionAtropello = lesionAtropello;
    }

    public String getLesionAtropello() {
        return lesionAtropello;
    }

    public void setLesionAtropello(String lesionAtropello) {
        this.lesionAtropello = lesionAtropello;
    }

    @Override
    public String toString() {
        String texto;
        if (tratamiento != null) {
            texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión atropello: " + lesionAtropello + " | Estado: " + estado + " | Tratamiento: " + tratamiento;
        } else {
            if (fechaMuerte == null && tratamiento == null) {
                texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión atropello: " + lesionAtropello + " | Estado: " + estado + " | Fecha Liberación: " + fechaLiberacion;
            } else {
                if (tratamiento == null && fechaLiberacion == null) {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión atropello: " + lesionAtropello + " | Estado: " + estado + " | Fecha Fallecimiento: " + fechaMuerte;

                } else {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión atropello: " + lesionAtropello + " | Estado: " + estado;
                }
            }
        }
        return texto;
    }
}
