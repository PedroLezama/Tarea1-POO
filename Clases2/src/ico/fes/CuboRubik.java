package ico.fes;

public class CuboRubik {
    private String tipo;
    private String marca;
    private float precio;

    public CuboRubik() {
    }

    public CuboRubik(String tipo, String marca, float precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
    public void rotar(){
        System.out.println("Cara rotada");
    }
    public void resuelto(){
        System.out.println("Todas las caras coinciden");
    }
}
