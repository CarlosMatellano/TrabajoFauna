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

    public String getInfeccionBacteriana() {
        return infeccionBacteriana;
    }

    public void setInfeccionBacteriana(String infeccionBacteriana) {
        this.infeccionBacteriana = infeccionBacteriana;
    }
    @Override
    public String toString() {
        return "TP: "+tipoAnimal+" | Nombre: "+nombre+" | Especie: "+especie+" | Peso: "+peso+" | Gravedad: "+gravedad+" | Fecha Entrada: "+fechaentrada+" | Infección Bacteriana: "+infeccionBacteriana;
    }
}
