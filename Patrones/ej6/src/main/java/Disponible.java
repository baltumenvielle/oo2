public class Disponible implements Estado {
    @Override
    public void inscribirUsuario(Excursion excursion, Usuario usuario) {
        if (excursion.getCantidadInscriptos()+1 < excursion.getCupoMax()) excursion.inscribirALista(usuario);
        if (excursion.getCantidadInscriptos() == excursion.getCupoMax()) excursion.setEstado(new Llena());
    }
    @Override
    public String ofrecerInformacion(Excursion excursion) {
        return "Mails de usuarios inscriptos: " + excursion.getInscriptos().stream().map(inscripto -> inscripto.getEmail()).toString() + "\n"
                + "Cantidad de cupos para alcanzar el cupo máximo: " + (excursion.getCupoMax() - excursion.getCantidadInscriptos());
    }
}
