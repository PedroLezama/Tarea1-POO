public class Persona {
    private int edad;
    private float estatura;
    private String nombre;
    private String genero;
    private float peso;

    public Persona() {
    }

    public Persona(int edad, float estatura, String nombre, String genero, float peso) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", estatura=" + estatura +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", peso=" + peso +
                '}';
    }
}
