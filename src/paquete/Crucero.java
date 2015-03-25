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
    private int hola;
    private int conflicto;
    private int conflicto2;
    private int conflicto3;
    //prueba

    public int getHola() {
        return hola;
    }

    public void setHola(int hola) {
        this.hola = hola;
    }

    public int getConflicto() {
        return conflicto;
    }

    public void setConflicto(int conflicto) {
        this.conflicto = conflicto;
    }

    public int getConflicto2() {
        return conflicto2;
    }

    public void setConflicto2(int conflicto2) {
        this.conflicto2 = conflicto2;
    }

    public int getConflicto3() {
        return conflicto3;
    }

    public void setConflicto3(int conflicto3) {
        this.conflicto3 = conflicto3;
    }

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
