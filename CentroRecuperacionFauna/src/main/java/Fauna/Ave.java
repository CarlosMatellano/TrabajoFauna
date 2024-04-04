/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fauna;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Ave extends Animal{
    
    private String lesion;
    
    public Ave(String especie, Double peso, String gravedad, Date fechaentrada, String lesion) {
        super(especie, peso, gravedad, fechaentrada);
        this.lesion = lesion;
    }    

    public String getLesion() {
        return lesion;
    }

    public void setLesion(String lesion) {
        this.lesion = lesion;
    }
    
}
