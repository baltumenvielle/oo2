import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Directorio extends Componente {
    private List<Componente> componentes;

    @Override
    public int tamanioTotalOcupado() {
        return 32 + this.componentes.stream()
                                    .mapToInt(Componente::tamanioTotalOcupado)
                                    .sum();
    }

    @Override
    public Archivo archivoMasGrande() {
        return this.componentes.stream()
                                .map(Componente::archivoMasGrande)
                                .max((a1, a2) -> Integer.compare(a1.tamanioTotalOcupado(), a2.tamanioTotalOcupado()))
                                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.componentes.stream()
                                .map(Componente::archivoMasNuevo)
                                .max((a1, a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
                                .orElse(null);
    }


    @Override
    public Componente buscar(String nombre) {
        if (this.getNombre().equals(nombre)) return this;
        return this.componentes.stream()
                .map(componente -> componente.buscar(nombre))
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Componente> buscarTodos(String nombre) {
        List<Componente> resultados = new LinkedList<>();

        if (this.getNombre().equals(nombre)) resultados.add(this);
        this.componentes.stream()
                .flatMap(componente -> componente.buscarTodos(nombre).stream())
                .forEach(resultados::add);

        return resultados;
    }

    @Override
    public String listadoDeContenido() {
        return "";
    }
}
