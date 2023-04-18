package ico.fes;

import java.awt.*;
import java.sql.SQLOutput;

public class Taxi extends Automovil{
    private String servicio; //taxi normal, uber, didi
    private boolean maletero;
    private int numeroLicencia;

    public Taxi() {
    }

    public Taxi(String tipo, Color color, double precio, String marca, String modelo,
                int pasajeros, String servicio, boolean maletero, int numeroLicencia) {
        super(tipo, color, precio, marca, modelo, pasajeros);
        this.servicio = servicio;
        this.maletero = maletero;
        this.numeroLicencia = numeroLicencia;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public boolean isMaletero() {
        return maletero;
    }

    public void setMaletero(boolean maletero) {
        this.maletero = maletero;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "servicio='" + servicio + '\'' +
                ", maletero=" + maletero +
                ", numeroLicencia=" + numeroLicencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pasajeros=" + pasajeros +
                ", tipo='" + tipo + '\'' +
                ", color=" + color +
                ", precio=" + precio +
                '}';
    }
    public void empezarTaximetro(){
        System.out.println("$12.50.....");
    }
    public void tarifaFinal(){
        System.out.println("Precio a pagar $40.66");
    }

    @Override
    public void encender() {
        System.out.println("El taxi esta encendido");
    }

    @Override
    public void frenar() {
        System.out.println("El taxi ha frenado");
    }

    @Override
    public void abrirPuerta() {
        System.out.println("Puerta del taxi abierta");
    }

    @Override
    public void avanzar() {
        System.out.println("El taxi empezo a avanzar");
    }
}
