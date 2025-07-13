public class Llena implements Estado {
    @Override
    public void inscribirUsuario(Excursion excursion, Usuario usuario) { excursion.inscribirAEspera(usuario); }
    @Override
    public String ofrecerInformacion(Excursion excursion) { return ""; }
}
