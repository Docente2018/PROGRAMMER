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
public class DescuentoDirectivo implements TipoDescuento{
    
    @Override
    public double importeDescontar(Compra c) {
 
    return c.getImporte() * 50 / 100;
 }
}
