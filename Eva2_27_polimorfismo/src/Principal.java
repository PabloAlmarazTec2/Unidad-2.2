/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Doctor dsimi = new Doctor();
    dsimi.tratarPaciente();
    Cirujano sStrange = new Cirujano();
    sStrange.tratarPaciente();
    sStrange.cobrar();
    Doctor dChapatin = new Cirujano();
    dChapatin.tratarPaciente();
    Cirujano cHouse = (Cirujano)dChapatin;
    cHouse.cobrar();
    }
    
}
class Cirujano extends Doctor
{ 
    public void cobrar()
    {
        System.out.println("cobra");
    }

    @Override
    public void tratarPaciente() {
        System.out.println("Cirugia a corazon abierto");
       
    }


}
class Doctor
{
    
public void tratarPaciente()
{
    System.out.println("Paracetamol");
    
}

}
