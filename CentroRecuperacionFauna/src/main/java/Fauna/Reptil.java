package Fauna;

import java.util.Date;

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
public class Reptil extends Animal {

    private String infeccionBacteriana;

    

    public Reptil(String infeccionBacteriana, String especie, Double peso, String gravedad, Date fechaentrada) {
        super(especie, peso, gravedad, fechaentrada);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    public String getInfeccionBacteriana() {
        return infeccionBacteriana;
    }

    public void setInfeccionBacteriana(String infeccionBacteriana) {
        this.infeccionBacteriana = infeccionBacteriana;
    }

}
