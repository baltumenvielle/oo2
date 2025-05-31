public class Personaje {
    private int vida;
    private Arma arma;
    private Armadura armadura;
    private String habilidad;

    public Personaje() { this.vida = 100; }

    public void setArma(Arma arma) { this.arma = arma; }
    public void setArmadura(Armadura armadura) { this.armadura = armadura; }
    public void setHabilidad(String habilidad) { this.habilidad = habilidad; }

    public Arma getArma() { return this.arma; }
    public Armadura getArmadura() { return this.armadura; }
    public String getHabilidad() { return this.habilidad; }

    public void recibirDanio(Arma arma) { this.vida =- this.armadura.recibirDanio(arma); }
}
