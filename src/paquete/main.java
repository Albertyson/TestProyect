/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String marca=new String();
        String nombre=new String();
        String color=new String();
        int asientos;
        double tamanio;
        System.out.println("Tipo de Llanta:");
        System.out.println("Ingrese la marca de la llanta: ");
        marca=leer.next();
        System.out.println("Tamanio de la llanta: ");
        tamanio=leer.nextDouble();
        Llanta llanta=new Llanta(marca,tamanio);
        System.out.println("Carro: ");
        System.out.println("Ingrese nombre de carro: ");
        nombre=leer.next();
        System.out.println("Ingrese el color de carro: ");
        color=leer.next();
        System.out.println("Ingrese la cantidad de asientos: ");
        asientos=leer.nextInt();
        Carro carro=new Carro(nombre, color, asientos, llanta);
        System.out.println("Info del Carro: "+carro);
    }
}
