public abstract class Creador {
    protected Personaje personaje;

    public abstract void setArma();
    public abstract void setArmadura();
    public abstract void setHabilidad();

    public Personaje getPersonaje() { return this.personaje; }
}
