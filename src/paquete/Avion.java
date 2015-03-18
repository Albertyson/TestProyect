/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Francisco
 */
public class Avion {
    private int peso;
    private Llanta tipoLlanta;
    private boolean aeromosa;

    public Avion() {
    }

    public Avion(int peso, Llanta tipoLlanta, boolean aeromosa) {
        this.peso = peso;
        this.tipoLlanta = tipoLlanta;
        this.aeromosa = aeromosa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Llanta getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(Llanta tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public boolean isAeromosa() {
        return aeromosa;
    }

    public void setAeromosa(boolean aeromosa) {
        this.aeromosa = aeromosa;
    }

    @Override
    public String toString() {
        return "Avion{" + "peso=" + peso + ", tipoLlanta=" + tipoLlanta + ", aeromosa=" + aeromosa + '}';
    }
        
}
