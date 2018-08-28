/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;
import actividad2.Interfaces.Cantante;
import actividad2.Interfaces.Medida;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, apellido;
        int pesoTierra;
        
        Scanner scanner = new Scanner(System. in); 
        
        System.out.println("Ingrese su nombre y presione Enter");
        nombre = scanner. nextLine();
        System.out.println("Ingrese su apellido y presione Enter");
        apellido = scanner. nextLine();
        System.out.println("Ingrese su peso en la tierra y presione Enter");
        pesoTierra = Integer.parseInt(scanner. nextLine());
        
        Persona p = new Persona(pesoTierra, nombre, apellido);
        System.out.print("Una persona canta: ");
	hacerCantar(p);
        obtenerPesoLuna(p);
        
        System.out.println("Ingrese el peso del Canario en la Tierra Enter");
        pesoTierra = Integer.parseInt(scanner. nextLine());
        
        System.out.print("Un canario canta: ");
        Canario c = new Canario(pesoTierra);
        hacerCantar(c);
        obtenerPesoLuna(c);
    }
    
    public static void hacerCantar(Cantante c) {
        c.cantar();
    }
    
    public static void obtenerPesoLuna(Medida m) {
        m.pesoLuna();
    }

    
}
