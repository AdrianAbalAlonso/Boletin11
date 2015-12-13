/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrián
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long tiempoComienza,tiempoFinaliza;
        String frase;
        JOptionPane.showMessageDialog(null,"Escribe la siguiente frase :");
        tiempoComienza=System.currentTimeMillis();
        do{
        frase=JOptionPane.showInputDialog("A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica ");
        
        }while(!frase.equalsIgnoreCase("A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica"));
         tiempoFinaliza=System.currentTimeMillis();
         JOptionPane.showMessageDialog(null, " tardaste " + (tiempoComienza - tiempoFinaliza) / 1000 + " segundos en escribir esta frase");
}
    }
    

