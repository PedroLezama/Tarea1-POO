package ico.fes;

import java.awt.*;

public class Vehiculo {
    protected String tipo;
    protected Color color;
    protected double precio;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, Color color, double precio) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", color=" + color +
                ", precio=" + precio +
                '}';
    }
    public void encender(){
        System.out.println("El vehiculo esta encendido");
    }
    public void frenar(){
        System.out.println("El vehiculo ha frenado");
    }
}
