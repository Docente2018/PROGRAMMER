/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementacion;

/**
 *
 * @author ESTUDIANTE
 */
public class DescuentoInternet implements TipoDescuento{
    
    @Override
 public double importeDescontar(Compra c) {
 
 double descuento;
 if (c.getImporte() > 0 && c.getImporte() < 200) {
 
descuento = 20;
 } else {
 descuento = 30;
 
}
 
 return c.getImporte() * descuento / 100;
 }
 
    
}
