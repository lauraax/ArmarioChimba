/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armario;
import java.util.Random;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author laura
 */
public class Armario {
    private String nombreUsuario;
    private List<Vestimenta> camisetas;
    private List<Vestimenta> pantalones;
    private List<Vestimenta> zapatos;
    private List<Vestimenta> accesorios;
    private Vestimenta camisetaSeleccionada;
    private Vestimenta pantalonSeleccionado;
    private Vestimenta zapatosSeleccionados;
    private Vestimenta accesoriosSeleccionados;
    private Random random;

    public Armario(PrendaDB prendadb) {
        this.camisetas = prendadb.obtenerCamisetas();
        this.pantalones = prendadb.obtenerPantalones();
        this.zapatos = prendadb.obtenerZapatos();
        this.accesorios = prendadb.obtenerAccesorios() ;
        random = new Random();
    }

    public void seleccionarCamiseta() {
        System.out.println("Elige una camiseta: ");
        mostrarOpciones(camisetas);
        int opcion = new Scanner(System.in).nextInt() - 1;
        camisetaSeleccionada = camisetas.get(opcion);
    }

    public void seleccionarPantalon() {
        System.out.println("Elige un pantalon: ");
        mostrarOpciones(pantalones);
        int opcion = new Scanner(System.in).nextInt() - 1;
        pantalonSeleccionado = pantalones.get(opcion);
    }

    public void seleccionarZapatos() {
        System.out.println("Elige unos zapatos: ");
        mostrarOpciones(zapatos);
        int opcion = new Scanner(System.in).nextInt() - 1;
        zapatosSeleccionados = zapatos.get(opcion);
    }
    public void seleccionarAccesorios() {
        System.out.println("Elige unos accesorios: ");
        mostrarOpciones(accesorios);
        int opcion = new Scanner(System.in).nextInt() - 1;
        accesoriosSeleccionados = accesorios.get(opcion);
    }

    public void seleccionarAleatorio() {
        camisetaSeleccionada = camisetas.get(random.nextInt(camisetas.size()));
        pantalonSeleccionado = pantalones.get(random.nextInt(pantalones.size()));
        zapatosSeleccionados = zapatos.get(random.nextInt(zapatos.size()));
        accesoriosSeleccionados = accesorios.get(random.nextInt(accesorios.size()));
        System.out.println("Ropa seleccionada aleatoriamente.");
    }

    public void mostrarSeleccion() {
        System.out.println("\nTu seleccion final es:");
        mostrarRopa(camisetaSeleccionada, "No has seleccionado una camiseta.");
        mostrarRopa(pantalonSeleccionado, "No has seleccionado un pantalon.");
        mostrarRopa(zapatosSeleccionados, "No has seleccionado unos zapatos.");
        mostrarRopa(accesoriosSeleccionados, "No has seleccionado unos accesorios.");
    }

    private void mostrarOpciones(List<Vestimenta> ropa) {
        for (int i = 0; i < ropa.size(); i++) {
            System.out.println((i + 1) + ". " + ropa.get(i).getEstilo() + " " + ropa.get(i).getColor());
        }
    }

    private void mostrarRopa(Vestimenta ropa, String mensaje) {
        if (ropa != null) {
            ropa.mostrarInfo();
        } else {
            System.out.println(mensaje);
        }
    }
    
}
