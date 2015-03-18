/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Alberto
 */
public class Llanta {
    
    private String Marca;
    private double tamanio;

    public Llanta() {
    }

    public Llanta(String Marca, double tamanio) {
        this.Marca = Marca;
        this.tamanio = tamanio;
    }
    

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Llanta{" + "Marca=" + Marca + ", tamanio=" + tamanio + '}';
    }
    
}
