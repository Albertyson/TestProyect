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
    private double precioPasaje;

    public double getPrecioPasaje() {
        return precioPasaje;
    }

    public void setPrecioPasaje(double precioPasaje) {
        this.precioPasaje = precioPasaje;
    }

    private int numeroPasajeros;

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

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
    

    public Crucero() {
    }


    public Crucero(int habitaciones, double peso, boolean comida, int numeroPasajeros,double precioPasaje) {
        this.habitaciones = habitaciones;
        this.peso = peso;
        this.comida = comida;
        this.numeroPasajeros = numeroPasajeros;
        this.precioPasaje = precioPasaje;
    }


    @Override
    public String toString() {
        return "Crucero{" + "habitaciones=" + habitaciones + ", peso=" + peso + ", comida=" + comida + ", precioPasaje=" + precioPasaje + ", numeroPasajeros=" + numeroPasajeros + '}';
    }

    
    
}
