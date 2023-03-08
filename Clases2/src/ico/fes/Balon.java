package ico.fes;

public class Balon {
    private String tipo;
    private String marca;
    private float costo;

    public Balon() {
    }

    public Balon(String tipo, String marca, float costo) {
        this.tipo = tipo;
        this.marca = marca;
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", costo=" + costo +
                '}';
    }
    public void bota(){
        System.out.println("Esta rebotando");
    }
    public void ponchada(){
        System.out.println("La pelota tiene un hoyo");
    }
}
