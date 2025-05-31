public class Director {
    private Creador creador;

    public Personaje crearPersonaje() {
        this.creador.setArmadura();
        this.creador.setArma();
        this.creador.setHabilidad();
        return this.creador.getPersonaje();
    }
}
