public class CreadorMago extends Creador {

    @Override
    public void setArma() { this.personaje.setArma(new Baston()); }

    @Override
    public void setArmadura() { this.personaje.setArmadura(new Cuero()); }

    @Override
    public void setHabilidad() { this.personaje.setHabilidad("Magia");}
}
