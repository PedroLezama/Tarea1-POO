public class Monitor {
    private int pulgadas;
    private String marca;
    private String modelo;
    private int resolucion;

    public Monitor() {
    }

    public Monitor(int pulgadas, String marca, String modelo, int resolucion) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
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

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", resolucion=" + resolucion +
                '}';
    }
}
