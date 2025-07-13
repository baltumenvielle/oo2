public class Pelicula {
    private String titulo;
    private double puntaje;
    private int estreno;
    private Pelicula similar;

    public Pelicula getSimilar() { return this.similar; }
    public double getPuntaje() { return this.puntaje; }
    public int getEstreno() { return this.estreno; }
}
