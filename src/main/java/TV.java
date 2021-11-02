/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3.televisores;

/**
 *
 * @author Usuario
 */
public class TV {
    private Marca marca;
    private int canal=1, precio=1, volumen=500;
    private Boolean estado;
    private Control control;
    private static int numTV;

    public TV(Marca marca, Boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        if ( estado == true && canal>= 1 && canal<=120){
        this.canal = canal;}
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        if (estado == true && volumen>=1 && volumen<=7 ){
        this.volumen = volumen;}
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    
    

    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }
    
   
    public static int getnumTV() {
        return numTV;
    }
    
    public void turnOn(){
        this.estado= true; 
    }
    public void turnOff(){
        this.estado=false;
    }

    public Boolean getEstado() {
        return estado;
    }
    
    public int canalUp(){
        if (estado == true && (canal>=1 && canal<= 120)) {
            canal++;            
        }
        return canal;
    }
    
     public int canalDown(){
        if (estado == true && (canal>=1 && canal<= 120)) {
            canal--;            
        }
        return canal;
    }
     
     public int volumenUp(){
         if (estado == true && (volumen>=1 && volumen <= 7)) {
            volumen++;
        }
        return volumen;
     }
     
     public int volumenDown(){
         if (estado == true && (volumen>=1 && volumen <= 7)) {
            volumen--;
        }
        return volumen;
     }
     
}
