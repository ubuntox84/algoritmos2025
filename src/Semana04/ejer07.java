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
class Persona{
    String name;
    int year;
    public Persona(String n, int y){
        this.name=n;
        this.year=y;
    }
    String info(){
        return this.name+" "+String.valueOf(this.year);
    }
}
public class ejer07 {
    static List<Persona> listapersona=new ArrayList<Persona>();
    public static void main(String[] args) {
        listapersona.add(new Persona("Juan",18));
        listapersona.add(new Persona("Miguel",20));
        listapersona.add(new Persona("Antonio",15));
        listapersona.add(new Persona("Luis",18));
        listapersona.add(new Persona("Antonia",23));
        // Forech
        for(Persona p:listapersona){
            System.out.println(p.info());
        }
    }           
}
