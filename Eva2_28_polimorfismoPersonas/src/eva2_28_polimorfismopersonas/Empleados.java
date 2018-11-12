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
public class Empleados extends Persona {
    private String rfc;

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public void imprimirnombre() {
        
        System.out.println("empleado "+ getNombre()+" "+getApellido()+" "+getRfc());
         }
    
}
