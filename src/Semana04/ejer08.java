/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
class Fruit{
    String name;
    public Fruit(String n){
        this.name=n;
    }
    String info(){
        return this.name;
    }
}
public class ejer08 {
    static List<Fruit> listafrutas=new ArrayList<Fruit>();
    public static void main(String[] args) {
        listafrutas.add(new Fruit("Uva"));
        listafrutas.add(new Fruit("Mango"));
        listafrutas.add(new Fruit("Manzana"));
        listafrutas.add(new Fruit("Pera"));
        listafrutas.add(new Fruit("Pina"));
        listafrutas.add(new Fruit("Papaya"));
        for(Fruit fruta:listafrutas){
            System.out.println(fruta.info());
        }
        //System.out.println(listafrutas.get(0).info());
        listafrutas.remove(new Fruit("Mango"));
        listafrutas.remove(2);
        System.out.println("");
        for(Fruit fruta:listafrutas){
            System.out.println(fruta.info());
        }
    }
}
