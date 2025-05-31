import java.util.stream.Collectors;

public class Disponible extends Estado {

    public Disponible(Excursion excursion) { super(excursion); }

    @Override
    public String getInformacionAdicional() {
        return "Usuarios inscriptos: " + this.excursion.getMails().stream().collect(Collectors.joining(", ")) + "\n"
                + "Cupos faltantes: " + (this.excursion.getCupoMax() - this.excursion.getInscriptos());
    }
}
