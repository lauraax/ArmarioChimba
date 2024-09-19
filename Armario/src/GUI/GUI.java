/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import armario.*;
import javax.swing.JOptionPane;
/**
 *
 * @author laura
 */
public class GUI implements IGUI{
    String nombre = JOptionPane.showInputDialog("Por favor, ingrese su nombre:");

    @Override
    public String nombreUsuario() {
        return  nombre ;
    }
    
}
