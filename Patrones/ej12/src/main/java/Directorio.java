import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Directorio extends Elemento {
    private List<Elemento> contenido;

    @Override
    public int getTamanio() { return 32 + this.contenido.stream().mapToInt(Elemento::getTamanio).sum(); }

    @Override
    public Archivo archivoMasGrande() {
        return this.contenido.stream()
                .map(Elemento::archivoMasGrande)
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Archivo::getTamanio))
                .orElse(null);
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this.contenido.stream()
                .map(Elemento::archivoMasNuevo)
                .filter(Objects::nonNull).min((e1, e2) -> e1.getFechaCreacion().compareTo(e2.getFechaCreacion()))
                .orElse(null);
    }

    @Override
    public Elemento buscar(String nombre) {
        return this.contenido.stream()
            .map(elem -> elem.buscar(nombre))
                .filter(Objects::nonNull)
                .findFirst().orElse(null);
    }

    @Override
    protected void buscarHijos(String nombre, List<Elemento> encontrados) {
        if (this.nombre.equals(nombre)) encontrados.add(this);
        this.contenido.stream().forEach(elem -> elem.buscarTodos(nombre, encontrados));
    }

    @Override
    public String listadoDeContenido() {
        return "/" + this.contenido.stream()
                .map(Elemento::listadoDeContenido)
                .collect(Collectors.joining());
    }
}
