package ico.fes;

public class Computadora {
    private String tipo; //laptop o escritorio
    private int memoriaRam;
    private String procesador;

    public Computadora() {
    }

    public Computadora(String tipo, int memoriaRam, String procesador) {
        this.tipo = tipo;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "tipo='" + tipo + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", procesador='" + procesador + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("*Encendiendo*");
    }
    public void actualizar(){
        System.out.println("Actualizando el sistema");
    }
}
