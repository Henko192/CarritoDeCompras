
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Compra {
    Cliente cliente;
    Televisor productos;
    Date fechaCompra;
    String infoEnvio;
    String metodoPago;
    Compra sig;
    
    public Compra(Cliente cliente, Televisor productos, Date fechaCompra, String infoEnvio,String metodoPago) {
        this.cliente = cliente;
        this.productos = productos;
        this.fechaCompra = fechaCompra;
        this.infoEnvio = infoEnvio;
        this.metodoPago= metodoPago;
        sig =null;
    }  
    
    
     public Cliente getcliente() {
        return cliente;
    }

    public void setcliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Televisor getProductos() {
        return productos;
    }

    public void setProductos(Televisor productos) {
        this.productos = productos;
    }
    
     public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
     public String getInfoEnvio() {
        return infoEnvio;
    }

    public void setInfoEnvio(String infoEnvio) {
        this.infoEnvio = infoEnvio;
    }
    
     public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public Compra getSig() {
        return sig;
    }

    public void setSig(Compra sig) {
        this.sig = sig;
    }
    
   
    
}
