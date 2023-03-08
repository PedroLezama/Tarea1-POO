package ico.fes;

public class Lampara {
    private String tipo;
    private String marca;
    private float costo;
    private boolean inteligente;

    public Lampara() {
    }

    public Lampara(String tipo, String marca, float costo, boolean inteligente) {
        this.tipo = tipo;
        this.marca = marca;
        this.costo = costo;
        this.inteligente = inteligente;
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

    public boolean isInteligente() {
        return inteligente;
    }

    public void setInteligente(boolean inteligente) {
        this.inteligente = inteligente;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", costo=" + costo +
                ", inteligente=" + inteligente +
                '}';
    }
    public void prender(){
        System.out.println("LUZ");
    }
    public void fundido(){
        System.out.println("El foco esta fundido");
    }
}
