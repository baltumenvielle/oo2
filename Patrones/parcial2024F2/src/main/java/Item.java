public class Item implements Objeto {
    private int espacio;
    private String nombre;

    public int getCapacidadTotal() { return 0; }
    public int getEspacioOcupado() { return this.espacio; }
    public Item buscarItem(String nombre) { if (this.nombre.equals(nombre)) return this; else return null; }
    public int espacioMasGrande() { return this.espacio; }
    public boolean guardarObjeto(Objeto objeto) { return false; }
    public String getNombre() { return this.nombre; }
}
