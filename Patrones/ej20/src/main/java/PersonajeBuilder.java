public abstract class PersonajeBuilder {
    protected Personaje personaje;

    public void reset() { this.personaje = new Personaje(); }
    public Personaje getPersonaje() { return this.personaje; }
    public abstract void asignarArmadura();
    public abstract void asignarArma();
    public abstract void asignarHabilidad();
}
