package Fauna;

import java.util.Date;

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */

/**
 * Clase que representa un reptil en un sistema de gestión de fauna. Hereda de
 * la clase Animal.
 */
public class Reptil extends Animal {

    /**
     * Atributo que indica la infección bacteriana del reptil.
     */
    private String infeccionBacteriana;

    /**
     * Constructor para crear un objeto Reptil con información básica y una
     * infección bacteriana.
     *
     * @param tipoAnimal El tipo de animal al que pertenece el reptil.
     * @param nombre El nombre del reptil.
     * @param especie La especie del reptil.
     * @param peso El peso del reptil.
     * @param gravedad La gravedad del estado del reptil.
     * @param estado El estado actual del reptil.
     * @param fechaentrada La fecha de entrada del reptil al sistema de gestión.
     * @param infeccionBacteriana La infección bacteriana que afecta al reptil.
     */
    public Reptil(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String infeccionBacteriana) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    /**
     * Constructor para un reptil con tratamiento.
     *
     * @param tipoAnimal Tipo del animal.
     * @param nombre Nombre del reptil.
     * @param especie Especie del reptil.
     * @param peso Peso del reptil.
     * @param gravedad Gravedad del estado del reptil.
     * @param estado Estado del reptil.
     * @param fechaentrada Fecha de entrada del reptil.
     * @param tratamiento Tratamiento aplicado al reptil.
     * @param infeccionBacteriana Infección bacteriana del reptil.
     */
    public Reptil(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, String infeccionBacteriana) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, tratamiento);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    /**
     * Constructor para un reptil liberado.
     *
     * @param tipoAnimal Tipo del animal.
     * @param nombre Nombre del reptil.
     * @param especie Especie del reptil.
     * @param peso Peso del reptil.
     * @param gravedad Gravedad del estado del reptil.
     * @param estado Estado del reptil.
     * @param fechaentrada Fecha de entrada del reptil.
     * @param fechaLiberacion Fecha de liberación del reptil.
     * @param veterinario Veterinario encargado del reptil.
     * @param infeccionBacteriana Infección bacteriana del reptil.
     */
    public Reptil(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaLiberacion, String veterinario, String infeccionBacteriana) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, fechaLiberacion, veterinario);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    /**
     * Constructor para un reptil fallecido.
     *
     * @param tipoAnimal Tipo del animal.
     * @param nombre Nombre del reptil.
     * @param especie Especie del reptil.
     * @param gravedad Gravedad del estado del reptil.
     * @param estado Estado del reptil.
     * @param fechaentrada Fecha de entrada del reptil.
     * @param tratamiento Tratamiento aplicado al reptil.
     * @param fechaMuerte Fecha de fallecimiento del reptil.
     * @param veterinario Veterinario encargado del reptil.
     * @param infeccionBacteriana Infección bacteriana del reptil.
     */
    public Reptil(String tipoAnimal, String nombre, String especie, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaMuerte, String veterinario, String infeccionBacteriana) {
        super(tipoAnimal, nombre, especie, gravedad, estado, fechaentrada, fechaMuerte, veterinario);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    /**
     *
     * Aquí todos los geters y seters para interactuar con los objetos
     */
    public String getInfeccionBacteriana() {
        return infeccionBacteriana;
    }

    public void setInfeccionBacteriana(String infeccionBacteriana) {
        this.infeccionBacteriana = infeccionBacteriana;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto Reptil.
     *
     * @return Cadena de texto que representa el objeto Reptil.
     */
    @Override
    public String toString() {
        String texto;
        if (tratamiento != null) {
            texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Infección Bacteriana: " + infeccionBacteriana + " | Estado: " + estado + " | Tratamiento: " + tratamiento;
        } else {
            if (fechaLiberacion != null) {
                texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Infección Bacteriana: " + infeccionBacteriana + " | Estado: " + estado + " | Fecha Liberación: " + fechaLiberacion + " | Veterianario: " + veterinario;
            } else {
                if (fechaMuerte != null) {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Infección Bacteriana: " + infeccionBacteriana + " | Estado: " + estado + " | Fecha Fallecimiento: " + fechaMuerte + " | Veterianario: " + veterinario;

                } else {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Infección Bacteriana: " + infeccionBacteriana + " | Estado: " + estado;
                }
            }
        }
        return texto;
    }
}
