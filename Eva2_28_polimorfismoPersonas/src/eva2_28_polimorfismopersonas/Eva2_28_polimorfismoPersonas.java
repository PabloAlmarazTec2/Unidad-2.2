/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_28_polimorfismopersonas;

/**
 *abstract class persona{
 * nombre 
 * apellido
 * get/set
 * abstract imprimirnombre();}
 * @author Pablo Aaron Almaraz Avalos
 */
public class Eva2_28_polimorfismoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleados eEmp = new Empleados();
        eEmp.setNombre("rosa");
        eEmp.setApellido("la de enfrente");
        eEmp.setRfc("11452pc");
        imprimirDatos(eEmp);
        Alumno aAlum = new Alumno();
       aAlum.setNombre("rosa");
        aAlum.setApellido("la de enfrente");
        aAlum.setNoControl("18550326");
        imprimirDatos(aAlum);
       
    }
public static void imprimirDatos(Persona pPerso)
{
pPerso.imprimirnombre();


}    
}
