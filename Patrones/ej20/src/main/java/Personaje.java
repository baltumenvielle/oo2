public class Personaje {
    private Armadura armadura;
    private Arma arma;
    private String nombre, habilidad;
    private double vida;

    public Personaje() { this.vida = 100; }
    public void setArmadura(Armadura armadura) { this.armadura = armadura; }
    public void setArma(Arma arma) { this.arma = arma; }
    public Arma getArma() { return this.arma; }
    public void setHabilidad(String habilidad) { this.habilidad = habilidad; }
    public void reducirDano(double dano) { this.vida -= dano; }
    public void enfrentarse(Personaje personaje) { this.reducirDano(this.armadura.recibirDano(personaje.getArma())); }
}
