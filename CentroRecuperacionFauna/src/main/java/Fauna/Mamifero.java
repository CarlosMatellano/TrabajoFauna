package Fauna;

import java.util.Date;

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
/**
 * Clase que representa un mamífero en un sistema de gestión de fauna.
 * Hereda de la clase Animal.
 */
public class Mamifero extends Animal {

    /**
     * Atributo que indica la lesión por atropello del mamífero.
     */
    private String lesionAtropello;

    /**
     * Constructor para un mamífero con información básica y lesión por
     * atropello.
     *
     * @param tipoAnimal El tipo de animal al que pertenece el mamífero.
     * @param nombre El nombre del mamífero.
     * @param especie La especie del mamífero.
     * @param peso El peso del mamífero.
     * @param gravedad La gravedad del estado del mamífero.
     * @param estado El estado actual del mamífero.
     * @param fechaentrada La fecha de entrada del mamífero al sistema de
     * gestión.
     * @param lesionAtropello La lesión por atropello que afecta al mamífero.
     */
    public Mamifero(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String lesionAtropello) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada);
        this.lesionAtropello = lesionAtropello;
    }

    /**
     * Constructor para un mamífero con tratamiento y lesión por atropello.
     *
     * @param tipoAnimal El tipo de animal al que pertenece el mamífero.
     * @param nombre El nombre del mamífero.
     * @param especie La especie del mamífero.
     * @param peso El peso del mamífero.
     * @param gravedad La gravedad del estado del mamífero.
     * @param estado El estado actual del mamífero.
     * @param fechaentrada La fecha de entrada del mamífero al sistema de
     * gestión.
     * @param tratamiento El tratamiento aplicado al mamífero.
     * @param lesionAtropello La lesión por atropello que afecta al mamífero.
     */
    public Mamifero(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, String lesionAtropello) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, tratamiento);
        this.lesionAtropello = lesionAtropello;
    }

    /**
     * Constructor para un mamífero liberado con lesión por atropello.
     *
     * @param tipoAnimal El tipo de animal al que pertenece el mamífero.
     * @param nombre El nombre del mamífero.
     * @param especie La especie del mamífero.
     * @param peso El peso del mamífero.
     * @param gravedad La gravedad del estado del mamífero.
     * @param estado El estado actual del mamífero.
     * @param fechaentrada La fecha de entrada del mamífero al sistema de
     * gestión.
     * @param tratamiento El tratamiento aplicado al mamífero.
     * @param fechaLiberacion La fecha de liberación del mamífero.
     * @param veterinario El veterinario encargado del mamífero.
     * @param lesioncaza La lesión por caza que afecta al mamífero.
     */

    public Mamifero(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaLiberacion, String veterinario, String lesioncaza) {
        super(tipoAnimal, nombre, especie, peso, gravedad, estado, fechaentrada, fechaLiberacion, veterinario);
        this.lesionAtropello = lesioncaza;
    }

    /**
     * Constructor para un mamífero fallecido con lesión por atropello.
     *
     * @param tipoAnimal El tipo de animal al que pertenece el mamífero.
     * @param nombre El nombre del mamífero.
     * @param especie La especie del mamífero.
     * @param gravedad La gravedad del estado del mamífero.
     * @param estado El estado actual del mamífero.
     * @param fechaentrada La fecha de entrada del mamífero al sistema de
     * gestión.
     * @param tratamiento El tratamiento aplicado al mamífero.
     * @param fechaMuerte La fecha de fallecimiento del mamífero.
     * @param veterinario El veterinario encargado del mamífero.
     * @param lesioncaza La lesión por caza que afecta al mamífero.
     */
    public Mamifero(String tipoAnimal, String nombre, String especie, String gravedad, String estado, Date fechaentrada, String tratamiento, Date fechaMuerte, String veterinario, String lesioncaza) {
        super(tipoAnimal, nombre, especie, gravedad, estado, fechaentrada, fechaMuerte, veterinario);
        this.lesionAtropello = lesioncaza;
    }

    /**
     *
     * Aquí todos los geters y seters para interactuar con los objetos
     */

    public String getLesionAtropello() {
        return lesionAtropello;
    }

    public void setLesionAtropello(String lesionAtropello) {
        this.lesionAtropello = lesionAtropello;
    }

    /**
     * Devuelve una representación en forma de cadena de texto del objeto
     * Mamífero.
     *
     * @return Cadena de texto que representa el objeto Mamífero.
     */
    @Override
    public String toString() {
        String texto;
        if (tratamiento != null) {
            texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión atropello: " + lesionAtropello + " | Estado: " + estado + " | Tratamiento: " + tratamiento;
        } else {
            if (fechaLiberacion != null) {
                texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión atropello: " + lesionAtropello + " | Estado: " + estado + " | Fecha Liberación: " + fechaLiberacion + " | Veterianario: " + veterinario;
            } else {
                if (fechaMuerte != null) {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión atropello: " + lesionAtropello + " | Estado: " + estado + " | Fecha Fallecimiento: " + fechaMuerte + " | Veterianario: " + veterinario;

                } else {
                    texto = "TP: " + tipoAnimal + " | Nombre: " + nombre + " | Especie: " + especie + " | Peso: " + peso + " | Gravedad: " + gravedad + " | Fecha Entrada: " + fechaentrada + " | Lesión atropello: " + lesionAtropello + " | Estado: " + estado;
                }
            }
        }
        return texto;
    }
}
