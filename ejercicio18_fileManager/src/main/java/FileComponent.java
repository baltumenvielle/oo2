import java.time.LocalDate;

public interface FileComponent {
    String getNombre();
    String getPermisos();
    String getExtension();
    LocalDate getFechaCreacion();
    LocalDate getFechaModificacion();
    double getTamanio();
    String prettyPrint();
}
