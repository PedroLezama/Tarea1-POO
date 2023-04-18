package ico.fes;

import java.awt.*;

public class Automovil extends Vehiculo{
    protected String marca;
    protected String modelo;
    protected int pasajeros;

    public Automovil() {
    }

    public Automovil(String tipo, Color color, double precio, String marca, String modelo, int pasajeros) {
        super(tipo, color, precio);
        this.marca = marca;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pasajeros=" + pasajeros +
                ", tipo='" + tipo + '\'' +
                ", color=" + color +
                ", precio=" + precio +
                '}';
    }
    public void avanzar(){
        System.out.println("Avanzando....");
    }
    public void abrirPuerta(){
        System.out.println("Puerta abierta");
    }

    @Override
    public void encender() {
        System.out.println("El automovil "+marca+" esta encendido");
    }

    @Override
    public void frenar() {
        System.out.println("El automovil esta frenando");
    }
}
