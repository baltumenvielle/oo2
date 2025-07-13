public class Guerrero extends PersonajeBuilder {
    @Override
    public void asignarArmadura() { this.personaje.setArmadura(new Acero()); }
    @Override
    public void asignarArma() { this.personaje.setArma(new Espada()); }
    @Override
    public void asignarHabilidad() { this.personaje.setHabilidad("Combate cuerpo a cuerpo"); }
}
