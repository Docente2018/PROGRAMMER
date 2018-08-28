/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerinterfaz;

/**
 *
 * @author Ximena
 */
public class Canario implements Cantante {

    private int peso;
    private String nombre;
    private String color;
    private String tamaño;

    public void cantar(String hola) {
        System.out.println("Pio Pio Pio");
    }

    @Override
    public void informacion() {
        System.out.println("El es: " + nombre + " es de color "+ color + " y pesa " + peso + "kilo");
    }

    public void informacion(String dato) {
        System.out.println("El es: " + nombre + " es de color "+ color + " y pesa " + peso + "kilo");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public void cantar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
