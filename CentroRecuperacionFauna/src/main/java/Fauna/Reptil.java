package Fauna;

import java.util.Date;

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
public class Reptil extends Animal {

    private String infeccionBacteriana;

    public Reptil(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String infeccionBacteriana) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    public Reptil(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, String infeccionBacteriana) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, tratamiento);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    public Reptil(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaLiberacion, String infeccionBacteriana) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, fechaLiberacion);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    public Reptil(String tipoAnimal, String nombre, String especie, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaMuerte, String infeccionBacteriana) {
        super(tipoAnimal, nombre, especie, gravedad, estado, fechaentrada, fechaMuerte);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    public String getInfeccionBacteriana() {
        return infeccionBacteriana;
    }

    public void setInfeccionBacteriana(String infeccionBacteriana) {
        this.infeccionBacteriana = infeccionBacteriana;
    }

    @Override
    public String toString() {
        String texto;
        if (tratamiento != null) {
            texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Infección Bacteriana: " + infeccionBacteriana + " | Estado: " + estado + " | Tratamiento: " + tratamiento;
        } else {
            if (fechaMuerte == null && tratamiento == null) {
                texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Infección Bacteriana: " + infeccionBacteriana + " | Estado: " + estado + " | Fecha Liberación: " + fechaLiberacion;
            } else {
                if (tratamiento == null && fechaLiberacion == null) {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Infección Bacteriana: " + infeccionBacteriana + " | Estado: " + estado + " | Fecha Fallecimiento: " + fechaMuerte;

                } else {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Infección Bacteriana: " + infeccionBacteriana + " | Estado: " + estado;
                }
            }
        }
        return texto;
    }
}
