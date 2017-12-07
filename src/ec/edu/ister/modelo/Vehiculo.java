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
public abstract class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String potenciaCV;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo, String potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPotenciaCV() {
        return potenciaCV;
    }
    
    public abstract void consumo();

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotenciaCV(String potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "todos son vehiculos"; //To change body of generated methods, choose Tools | Templates.
    }
    
    


}
