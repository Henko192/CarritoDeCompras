/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Televisor {
    String nombreTv;
    String marca;
    String diseño;
    int precio;
    int tamaño;
    int resolucion;
    int puertosHDMI;
    Televisor sig;
    
    public Televisor(String nombreTv, String marca, String diseño, int precio, int tamaño, int resolucion, int puertosHDMI) {
        this.nombreTv = nombreTv;
        this.marca = marca;
        this.diseño = diseño;
        this.precio = precio;
        this.tamaño= tamaño;
        sig =null;
    }  
    
     public String getNombreTv() {
        return nombreTv;
    }

    public void setNombreTv(String nombreTv) {
        this.nombreTv = nombreTv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
     public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
     public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
      public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
      public int getPuertosHDMI() {
        return puertosHDMI;
    }

    public void setPuertosHDMI(int puertosHDMI) {
        this.puertosHDMI = puertosHDMI;
    }
    
    public Televisor getSig() {
        return sig;
    }

    public void setSig(Televisor sig) {
        this.sig = sig;
    }
    
}
