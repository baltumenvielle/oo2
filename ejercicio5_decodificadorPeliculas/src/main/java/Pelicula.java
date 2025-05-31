import java.util.LinkedList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int estreno;
    private double puntaje;
    private List<Pelicula> similares;

    public Pelicula(String titulo, int estreno, double puntaje) {
        similares = new LinkedList<Pelicula>();
        this.titulo = titulo;
        this.estreno = estreno;
        this.puntaje = puntaje;
    }

    public void agregarSimilar(Pelicula p) {
        this.similares.add(p);
        p.agregarSimilar(this);
    }

    public int getEstreno() { return this.estreno; }
    public String getTitulo() { return this.titulo; }
    public double getPuntaje() { return this.puntaje; }
    public List<Pelicula> getSimilares() { return this.similares; }
}
