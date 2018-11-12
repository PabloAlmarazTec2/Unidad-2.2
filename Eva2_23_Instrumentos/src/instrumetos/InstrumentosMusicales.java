/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumetos;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
abstract public class InstrumentosMusicales {
private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
abstract public void tocarInstrumento();

}
