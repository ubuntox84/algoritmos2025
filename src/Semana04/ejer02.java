/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

/**
 *
 * @author chris
 */
class Coche {

    private String marca;
    private String modelo;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("El coche está acelerando " + modelo + " " + marca);
    }
}

public class ejer02 {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.setMarca("Toyota");
        miCoche.setModelo("Corolla"); 
        miCoche.acelerar();
    }
}
