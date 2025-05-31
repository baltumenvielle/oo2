public class CreadorArquero extends Creador {

    @Override
    public void setArma() { this.personaje.setArma(new Arco()); }

    @Override
    public void setArmadura() { this.personaje.setArmadura(new Cuero()); }

    @Override
    public void setHabilidad() { this.personaje.setHabilidad("Disparos de flechas");}
}
