/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armario;
import java.io.*;
import java.util.*;
        
/**
 *
 * @author laura
 */
public class DBFile implements PrendaDB {
    private String rutaDB;
    
    public DBFile (String rutaDB){
        this.rutaDB = rutaDB;
    }
    

    @Override
    public List<Vestimenta> obtenerCamisetas() {
        return leerPrendasFile("camisetas.txt");
    }

    @Override
    public List<Vestimenta> obtenerPantalones() {
        return leerPrendasFile("pantalones.txt");
    }

    @Override
    public List<Vestimenta> obtenerZapatos() {
        return leerPrendasFile("zapatos.txt");
    }

    @Override
    public List<Vestimenta> obtenerAccesorios() {
        return leerPrendasFile("accesorios.txt");
    }
    private List<Vestimenta> leerPrendasFile(String archivo){
        ArrayList<Vestimenta> prendas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaDB + archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (archivo.contains("camisetas")) {
                    prendas.add(new Camiseta(datos[0], datos[1]));
                } else if (archivo.contains("pantalones")) {
                    prendas.add(new Pantalon(datos[0], datos[1]));
                } else if (archivo.contains("zapatos")) {
                    prendas.add(new Zapatos(datos[0], datos[1]));
                } else if (archivo.contains("accesorios")) {
                    prendas.add(new Accesorio(datos[0], datos[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prendas; 
    }
      
}
