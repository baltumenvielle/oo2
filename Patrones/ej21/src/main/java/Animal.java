import java.time.LocalDate;

public interface Animal {
    String getIdentificador();
    void setIdentificador(String identificador);
    String getEspecie();
    void setEspecie(String especie);
    LocalDate getFechaNacimiento();
    void setFechaNacimiento(LocalDate fechaNacimiento);
    Animal getPadre();
    void setPadre(Mamifero padre);
    Animal getMadre();
    void setMadre(Mamifero madre);
    Animal getAbueloMaterno();
    Animal getAbueloPaterno();
    Animal getAbuelaMaterna();
    Animal getAbuelaPaterna();
    boolean tieneComoAncestroA(Animal animal);
}
