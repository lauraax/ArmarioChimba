/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package armario;
import java.util.*;
/**
 *
 * @author laura
 */
public interface PrendaDB {
    List<Vestimenta> obtenerCamisetas();
    List<Vestimenta> obtenerPantalones();
    List<Vestimenta> obtenerZapatos();
    List<Vestimenta> obtenerAccesorios();
    
}
