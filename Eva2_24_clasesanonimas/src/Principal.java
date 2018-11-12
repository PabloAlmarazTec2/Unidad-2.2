/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Principal implements ImprimirMensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal mObj = new Principal();
        mObj.ImprimirMensaje("hola Chingon");
        
        
        
        
        //imprimirMensaje es una interfaz, nose pueden crear
        //Objetos de interfaces
        //crear una clase anonima que implementa los metodos de
        //la interfaz
        ImprimirMensaje objImprimir = new ImprimirMensaje() {
            @Override
            public void ImprimirMensaje(String sMensa) {
                System.out.println("hola "+ sMensa);    
            }
        };
        objImprimir.ImprimirMensaje("Alonso");
    }

    @Override
    public void ImprimirMensaje(String sMensa) {
        }
    
}
interface ImprimirMensaje
{
public void ImprimirMensaje(String sMensa);


}