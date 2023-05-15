package ico.fes;

public class VideoJuego {

        private int id;
        private String nombre;
        private String genero;
        private double pesoEnGb;
        private String plataformas;
        private String desarrollador;

    public VideoJuego() {
    }

    public VideoJuego(int id, String nombre, String genero, double pesoEnGb, String plataformas, String desarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.pesoEnGb = pesoEnGb;
        this.plataformas = plataformas;
        this.desarrollador = desarrollador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPesoEnGb() {
        return pesoEnGb;
    }

    public void setPesoEnGb(double pesoEnGb) {
        this.pesoEnGb = pesoEnGb;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", pesoEnGb=" + pesoEnGb +
                ", plataformas='" + plataformas + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                '}';
    }
}
