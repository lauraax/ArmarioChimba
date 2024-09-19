/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armario;

/**
 *
 * @author laura
 */
public class Pantalon extends Vestimenta implements IRopa{
    public Pantalon(String estilo, String color) {
        super(estilo, color);
    }

    @Override
    public void planchar() {
        System.out.println("Planchando camiseta");    
    }
}
