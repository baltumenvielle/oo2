import java.time.LocalDate;

public class Mamifero implements Animal {
    private String identificador, especie;
    private Mamifero padre, madre;
    private LocalDate fechaNacimiento;

    @Override
    public String getIdentificador() { return this.identificador; }
    @Override
    public void setIdentificador(String identificador) { this.identificador = identificador; }
    @Override
    public String getEspecie() { return this.especie; }
    @Override
    public void setEspecie(String especie) { this.especie = especie; }
    @Override
    public LocalDate getFechaNacimiento() {return this.fechaNacimiento; }
    @Override
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    @Override
    public Animal getPadre() { return this.padre; }
    @Override
    public void setPadre(Mamifero padre) { this.padre = padre; }
    @Override
    public Animal getMadre() { return this.madre; }
    @Override
    public void setMadre(Mamifero madre) { this.madre = madre; }
    @Override
    public Animal getAbueloMaterno() { return this.madre.getPadre(); }
    @Override
    public Animal getAbueloPaterno() { return this.padre.getPadre(); }
    @Override
    public Animal getAbuelaMaterna() { return this.madre.getMadre(); }
    @Override
    public Animal getAbuelaPaterna() { return this.padre.getMadre(); }

    @Override
    public boolean tieneComoAncestroA(Animal animal) {
        return ((this.padre == animal) || (this.madre == animal)
                || this.padre.tieneComoAncestroA(animal)
                || this.madre.tieneComoAncestroA(animal));
    }
}
