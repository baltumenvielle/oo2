public class CreadorGuerrero extends Creador {

    @Override
    public void setArma() { this.personaje.setArma(new Espada()); }

    @Override
    public void setArmadura() { this.personaje.setArmadura(new Acero()); }

    @Override
    public void setHabilidad() { this.personaje.setHabilidad("Combate cuerpo a cuerpo");}
}
