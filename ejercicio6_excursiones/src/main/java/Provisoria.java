public class Provisoria extends Estado {

    public Provisoria(Excursion excursion) { super(excursion); }

    @Override
    public String getInformacionAdicional() {
        return "Cantidad de cupos faltantes para completar el cupo mínimo: " + (this.excursion.getCupoMin() - this.excursion.getInscriptos());
    }
}
