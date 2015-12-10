/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg11;
import javax.swing.JOptionPane;
/**
 *
 * @author slagogonzalez
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        long timestart, timeend;
        JOptionPane.showMessageDialog(null, "ESCRIBE A SEGUINTE FRASE :");
        timestart = System.currentTimeMillis();
        JOptionPane.showInputDialog("\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática ");
        timeend = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "PREME ENTER PARA REMATAR");
        JOptionPane.showMessageDialog(null, " TARDACHES " + (timeend - timestart) / 1000 + " SEGUNDOS EN ESCRIBIR A FRASE");
    }
}
    
    

