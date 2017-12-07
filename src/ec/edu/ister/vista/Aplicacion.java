/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Autobus;
import ec.edu.ister.modelo.Taxi;
import ec.edu.ister.modelo.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB7-PC5-USER
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        //solo puedo crear objetos de clases hijas no de clases padres
        Vehiculo obj1 =new Taxi();
        Vehiculo obj2= new Autobus();
        JOptionPane.showMessageDialog(null, obj1.toString()+obj2.toString());
        obj1.consumo();
        
        
        
    }
}
