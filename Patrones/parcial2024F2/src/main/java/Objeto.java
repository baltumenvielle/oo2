public interface Objeto {
    int getCapacidadTotal();
    int getEspacioOcupado();
    Item buscarItem(String nombre);
    int espacioMasGrande();
    boolean guardarObjeto(Objeto objeto);
    String getNombre();
}
