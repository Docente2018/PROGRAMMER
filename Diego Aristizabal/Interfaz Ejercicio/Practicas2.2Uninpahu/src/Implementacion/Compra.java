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
public class Compra{
 
private double importe;
 
 public double getImporte() {
 return importe;
 }
 
public void setImporte(double importe) {
 this.importe = importe;
 }
 
public Compra(double importe) {
 super();
 this.importe = importe;
 }
 
public double descuento(TipoDescuento tipoDescuento) {
 
return importe- tipoDescuento.importeDescontar(this);
 }
 
}
