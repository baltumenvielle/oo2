public class Provisoria implements Estado {
    @Override
    public void inscribirUsuario(Excursion excursion, Usuario usuario) {
        excursion.inscribirALista(usuario);
        if (excursion.getCantidadInscriptos() >= excursion.getCupoMin()) excursion.setEstado(new Disponible());
    }
    @Override
    public String ofrecerInformacion(Excursion excursion) { return "Cantidad de cupos faltantes para alcanzar el cupo mínimo: " + (excursion.getCupoMin() - excursion.getCantidadInscriptos()); }
}
