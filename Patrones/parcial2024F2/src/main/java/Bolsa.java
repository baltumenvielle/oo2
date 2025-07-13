import java.util.List;

public class Bolsa implements Objeto {
    private List<Objeto> objetos;
    private int capacidad;

    public Bolsa(int capacidad) { this.capacidad = capacidad; }

    public String getNombre() { return ""; }

    public int getCapacidadTotal() {
        return this.capacidad - this.getEspacioOcupado() +
                this.objetos.stream().mapToInt(Objeto::getCapacidadTotal).sum();
    }

    public int getEspacioOcupado() { return this.objetos.stream().mapToInt(Objeto::getEspacioOcupado).sum(); }

    public Item buscarItem(String nombre) {
        return (Item)this.objetos.stream()
                .filter(objeto -> objeto.getNombre().equals(nombre))
                .findFirst().orElse(null);
    }

    public int espacioMasGrande() {
        return Math.max(this.getEspacioOcupado(),
                this.objetos.stream()
                .mapToInt(Objeto::espacioMasGrande)
                .max().orElse(0));
    }

    public boolean guardarObjeto(Objeto objeto) {
        if (this.getEspacioOcupado() + objeto.getEspacioOcupado() <= this.capacidad) {
            this.objetos.add(objeto);
            return true;
        }
        return this.objetos.stream().anyMatch(obj -> obj.guardarObjeto(objeto));
    }
}
