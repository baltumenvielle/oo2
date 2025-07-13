public class Mago extends PersonajeBuilder {
    @Override
    public void asignarArmadura() { this.personaje.setArmadura(new Cuero()); }
    @Override
    public void asignarArma() { this.personaje.setArma(new Baston()); }
    @Override
    public void asignarHabilidad() { this.personaje.setHabilidad("Magia y combate a distancia"); }
}
