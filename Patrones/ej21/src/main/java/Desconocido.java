import java.time.LocalDate;

public class Desconocido implements Animal {
    @Override
    public String getIdentificador() { return "No tiene identificador"; }
    @Override
    public void setIdentificador(String identificador) {}
    @Override
    public String getEspecie() { return "No tiene especie"; }
    @Override
    public void setEspecie(String especie) {}
    @Override
    public LocalDate getFechaNacimiento() { return null; }
    @Override
    public void setFechaNacimiento(LocalDate fechaNacimiento) {}
    @Override
    public Animal getPadre() { return this; }
    @Override
    public void setPadre(Mamifero padre) {}
    @Override
    public Animal getMadre() { return this; }
    @Override
    public void setMadre(Mamifero madre) {}
    @Override
    public Animal getAbueloMaterno() { return this; }
    @Override
    public Animal getAbueloPaterno() { return this; }
    @Override
    public Animal getAbuelaMaterna() { return this; }
    @Override
    public Animal getAbuelaPaterna() { return this; }
    @Override
    public boolean tieneComoAncestroA(Animal animal) { return false; }
}
