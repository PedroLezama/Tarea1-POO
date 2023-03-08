package ico.fes;

public class Libro {
    private String autor;
    private String titulo;
    private int anio;
    private int paginas;

    public Libro() {
    }

    public Libro(String autor, String titulo, int anio, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", paginas=" + paginas +
                '}';
    }
    public void empezar(){
        System.out.println("Capitulo 1.....");
    }
    public void finalizar(){
        System.out.println("Fin");
    }
}
