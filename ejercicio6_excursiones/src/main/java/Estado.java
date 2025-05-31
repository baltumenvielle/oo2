public abstract class Estado {
    protected Excursion excursion;

    public Estado(Excursion excursion) { this.excursion = excursion; }

    public abstract String getInformacionAdicional();
}
