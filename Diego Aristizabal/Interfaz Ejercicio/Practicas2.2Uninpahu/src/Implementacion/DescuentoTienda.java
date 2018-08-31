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
public class DescuentoTienda implements TipoDescuento {
    
    @Override
    public double importeDescontar(Compra c) {
 
double descuento;
 
 if (c.getImporte() > 0 && c.getImporte() < 100) {
 
descuento = 10;
 } else {
 descuento = 20;
 
}
 return c.getImporte() * descuento / 100;
 }
    
}
