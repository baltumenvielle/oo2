public class Arquero extends PersonajeBuilder {
    @Override
    public void asignarArmadura() { this.personaje.setArmadura(new Cuero()); }
    @Override
    public void asignarArma() { this.personaje.setArma(new Arco()); }
    @Override
    public void asignarHabilidad() { this.personaje.setHabilidad("Especialista en disparos de flechas"); }
}
