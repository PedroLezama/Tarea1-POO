package ico.fes;

public class Pais {
    private String nombre;
    private int poblacion;
    private String continente;

    public Pais() {
    }

    public Pais(String nombre, int poblacion, String continente) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", continente='" + continente + '\'' +
                '}';
    }
    public void pasaporte(){
        System.out.println("Muestra tu pasaporte para entrar al pais");
    }
    public void saludo(){
        System.out.println("Bienvenido a "+nombre+", disfrute su estancia");
    }
}
