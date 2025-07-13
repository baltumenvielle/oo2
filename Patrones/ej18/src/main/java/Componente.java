import java.time.LocalDate;

public interface Componente {
    String getNombre();
    String getExtension();
    int getTamano();
    LocalDate getFechaCreacion();
    LocalDate getFechaModificacion();
    String getPermisos();
    String prettyPrint();
}
