public class CreadorThoor extends Creador {
    @Override
    public void setArma() { this.personaje.setArma(new Martillo());}

    @Override
    public void setArmadura() { this.personaje.setArmadura(new Hierro()); }

    @Override
    public void setHabilidad() { this.personaje.setHabilidad("Lanzarrayos"); }
}
