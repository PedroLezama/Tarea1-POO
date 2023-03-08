package ico.fes;

import java.awt.*;

public class Gato {
    private Color color;
    private String raza;
    private String nombre;
    private int edad;
    private String genero;

    public Gato() {
    }

    public Gato(Color color, String raza, String nombre, int edad, String genero) {
        this.color = color;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color=" + color +
                ", raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void maullar(){
        System.out.println("MIAUUUU");
    }
    public void ronronear(){
        System.out.println("Prrrrrrrr");
    }
}
