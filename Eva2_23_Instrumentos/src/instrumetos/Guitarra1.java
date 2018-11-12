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
public class Guitarra1 extends InstrumentosMusicales
        implements GuitarraAcustica{
  private int numeroCuerdas;
    private String efectos;
    private int potencia;
  private String tipoDeGuitarra;
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }



    @Override
    public void tocarInstrumento() {
        System.out.println("Rompela!!, Guitarra acustica con " +  numeroCuerdas);
        System.out.println("la guitarra es de tipo " +getNombre());
        System.out.println("tiene efectos: "+ efectos);
        System.out.println("tiene una potencia: "+ potencia);
        System.out.println("tipo de guitarra " + tipoDeGuitarra);
            }

    @Override
    public void efectos(String tipoEfecto) {
    efectos = tipoEfecto;     
    
    }

    @Override
    public void amplificador(int potencia) {
    this.potencia = potencia;        
    }
   
}
