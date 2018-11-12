/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_23_instrumentos;

import instrumetos.Guitarra;
import instrumetos.Guitarra1;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Eva2_23_Instrumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guitarra gMiGuitarra = new Guitarra();
        gMiGuitarra.setNombre("Gibson");
        gMiGuitarra.setNumeroCuerdas(6);
        gMiGuitarra.efectos("wah");
        gMiGuitarra.amplificador(1000);
        gMiGuitarra.tocarInstrumento();
        Guitarra1 gMiGuitarra2 = new Guitarra1();
         gMiGuitarra2.setNombre("Gibson 2 :v");
        gMiGuitarra2.setNumeroCuerdas(8);
        gMiGuitarra2.efectos("uuuuuuuuuuuuuhhhhhh");
        gMiGuitarra2.amplificador(2000);
        gMiGuitarra2.tipoDeGuitarra("clasica");
        gMiGuitarra2.tocarInstrumento();
    }
    
}
