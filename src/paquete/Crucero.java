/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Alberto
 */
public class Crucero {
    
    private int habitaciones;
    private double peso;
    private boolean comida;

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Crucero() {
    }

    public Crucero(int habitaciones, double peso, boolean comida) {
        this.habitaciones = habitaciones;
        this.peso = peso;
        this.comida = comida;
    }

    @Override
    public String toString() {
        return "Crucero{" + "habitaciones=" + habitaciones + ", peso=" + peso + ", comida=" + comida + '}';
    }

    
    
    
    
}
