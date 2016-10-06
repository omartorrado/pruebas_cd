/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fozandoengit;

import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Fozandoengit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base;
        float altura;
        base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base del triangulo:"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura del triangulo:"));
        JOptionPane.showMessageDialog(null, "El area del triangulo es: "+(base*altura)/2);
        
        //Comentario random sobre el programa. modificacion 1
        //necesidades basicas incompletas. rendimiento 20%
    }
    
}
