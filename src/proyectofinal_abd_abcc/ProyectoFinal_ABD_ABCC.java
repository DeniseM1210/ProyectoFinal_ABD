/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal_abd_abcc;

import vista.Client;
import vista.Login;
import vista.PropertyForRent;
import vista.Sucursal;
import vista.ventanaPrincipal;

/**
 *
 * @author denis
 */
public class ProyectoFinal_ABD_ABCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PropertyForRent().setVisible(true);
            }
        });
    }
    
}
