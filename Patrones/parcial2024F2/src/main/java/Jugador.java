public class Jugador {
    private String nombre;
    private Bolsa bolsa;

    public Jugador(String nombre, int capacidad) {
        this.nombre = nombre;
        this.bolsa = new Bolsa(capacidad);
    }

    public boolean guardarObjeto(Objeto objeto) { return this.bolsa.guardarObjeto(objeto); }
    public Item buscarItem(String nombre) { return this.bolsa.buscarItem(nombre); }
    public int espacioMasGrande() { return this.bolsa.espacioMasGrande(); }
    public int capacidadDisponible() { return this.bolsa.getCapacidadTotal(); }
}
