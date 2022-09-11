package com.wonderland;

public class ObjetoCoche {

        // Atributos
        String color;
        String marca;
        String modelo;
        String combustible;
        int potencia;
        Integer velocidad = 0;

        // Constructores
        public ObjetoCoche(){

        }
        public ObjetoCoche (String color, String marca, String modelo, String combustible, int potencia) {
                this.color = color;
                this.marca = marca;
                this.modelo = modelo;
                this.combustible = combustible;
                this.potencia = potencia;
        }

        // Comportamiento
        public void acelerar (Integer cantidad){
                if(cantidad > 0 && cantidad <= 120){
                        this.velocidad += cantidad;
                }
        }
        // con boton derecho podemos darle a generate, toString
        @Override
        public String toString() {
                return "ObjetoCoche{" +
                        "color='" + color + '\'' +
                        ", marca='" + marca + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", combustible='" + combustible + '\'' +
                        ", potencia=" + potencia +
                        ", velocidad=" + velocidad +
                        '}';
        }
}
