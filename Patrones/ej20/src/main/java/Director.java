public class Director {
    private PersonajeBuilder builder;

    public Personaje hacerPersonaje() {
        this.builder.reset();
        this.builder.asignarArmadura();
        this.builder.asignarArma();
        this.builder.asignarHabilidad();
        return this.builder.getPersonaje();
    }
}
