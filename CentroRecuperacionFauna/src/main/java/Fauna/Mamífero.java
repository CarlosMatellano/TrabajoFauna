
package Fauna;

import java.util.Date;

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
public class Mamífero extends Animal{
    
    private String lesionAtropello;

    public Mamífero(String tipoAnimal, String nombre, String especie, Double peso, String gravedad, Date fechaentrada, String lesionAtropello) {
        super(tipoAnimal, nombre, especie, peso, gravedad, fechaentrada);
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
        return "TP: "+tipoAnimal+" | Nombre: "+nombre+" | Especie: "+especie+" | Peso: "+peso+" | Gravedad: "+gravedad+" | Fecha Entrada: "+fechaentrada+" | Lesion Atropello: "+lesionAtropello;
    }    
}
