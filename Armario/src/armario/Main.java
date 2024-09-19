/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armario;
import GUI.*;
/**
 *
 * @author laura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rutaDB = "C:\\Users\\laura\\OneDrive\\Escritorio\\Armario\\src\\datos/";
        
        IGUI gui = new GUI();
        PrendaDB prendadb = new DBFile(rutaDB);
        Armario armario = new Armario(prendadb);
        Menu menu = new Menu(armario, gui);
        menu.mostrarMenu();
    }
    
}
