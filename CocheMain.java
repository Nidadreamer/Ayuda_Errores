package com.wonderland;

import org.w3c.dom.ls.LSOutput;

public class CocheMain {

    public static void main(String[] args) {


    // Aquí crearé objetos -> Crear un objeto es instanciar una clase
    ObjetoCoche coche1 = new ObjetoCoche();

// Con control + P nos saca la lista de lo que hay que poner entre los parentesis
    ObjetoCoche coche2 = new ObjetoCoche("Rojo", "Mercedes","Style","Gasolina",240);

    coche2.acelerar(50);
        System.out.println(coche2);

    coche2.color("Verde");
        System.out.println(coche2);

    }
}
