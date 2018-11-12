/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_28_polimorfismopersonas;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Alumno extends Persona{
private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public void imprimirnombre() {
        System.out.println("Alumno "+getNombre()+" "+getApellido()+" "+getNoControl());
           }
    
    
}
