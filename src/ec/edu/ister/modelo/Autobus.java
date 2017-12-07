/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author LAB7-PC5-USER
 */
public class Autobus extends Vehiculo{
    
    private String numeroPlazas;

    public Autobus() {
    }

    public Autobus(String numeroPlazas, String matricula, String modelo, String potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }

    public String getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(String numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public void consumo() {
        
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + "este es un autobus"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
