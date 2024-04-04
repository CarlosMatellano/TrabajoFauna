
package Fauna;

import java.util.Date;

/**
 *
 * @author Hugo Mazarío Ros y Carlos Matellano Villacampa 1ºDAM
 */
public class Mamífero extends Animal{
    
    private String lesionAtropello;

    public Mamífero(String lesionAtropello, String especie, Double peso, String gravedad, Date fechaentrada) {
        super(especie, peso, gravedad, fechaentrada);
        this.lesionAtropello = lesionAtropello;
    }

    public String getLesionAtropello() {
        return lesionAtropello;
    }

    public void setLesionAtropello(String lesionAtropello) {
        this.lesionAtropello = lesionAtropello;
    }
    
    
}
