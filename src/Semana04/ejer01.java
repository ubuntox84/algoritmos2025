/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana04;

/**
 *
 * @author chris
 */
class Perro{
    private String name;
    private int year;
    private float weight;
    private char sex;

    public Perro(String name) {
        this.name = name;
    }

    public Perro(String name, int year, float weight, char sex) {
        this.name = name;
        this.year = year;
        this.weight = weight;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    } 
    
}
class dueño{
    int a;
    int b;
}
public class ejer01 {
    
}
