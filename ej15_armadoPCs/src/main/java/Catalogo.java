import java.util.LinkedList;
import java.util.List;

public class Catalogo {
    private List<Componente> componentes;

    public Catalogo() { this.componentes = new LinkedList<>(); }

    public Componente getComponente(String descripcion) {
        return componentes.stream()
                .filter(componente -> componente.getDescripcion().equals(descripcion))
                .findFirst().orElse(null);
    }
}
