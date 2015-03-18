/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Alberto
 */
public class Carro {
    
    private String Nombre;
    private String color;
    private Llanta tipoLlanta;
    private int asientos;

    public Carro() {
    }

    public Carro(String Nombre, String color, int asientos, Llanta llanta) {
        this.Nombre = Nombre;
        this.color = color;
        this.asientos = asientos;
        this.tipoLlanta = llanta;
    }
    

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Llanta getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(Llanta tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    @Override
    public String toString() {
        return "Carro{" + "Nombre=" + Nombre + ", color=" + color + ", tipoLlanta=" + tipoLlanta + ", asientos=" + asientos + '}';
    }
    
}
