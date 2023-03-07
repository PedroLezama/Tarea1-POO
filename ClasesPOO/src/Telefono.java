public class Telefono {
    private float pulgadas;
    private int bateria;
    private String marca;
    private String modelo;

    public Telefono() {
    }

    public Telefono(float pulgadas, int bateria, String marca, String modelo) {
        this.pulgadas = pulgadas;
        this.bateria = bateria;
        this.marca = marca;
        this.modelo = modelo;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
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

    @Override
    public String toString() {
        return "Telefono{" +
                "pulgadas=" + pulgadas +
                ", bateria=" + bateria +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
