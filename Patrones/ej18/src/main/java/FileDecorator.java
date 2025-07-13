import java.time.LocalDate;

public abstract class FileDecorator implements Componente {
    protected Componente decorado;

    @Override
    public String getNombre() { return this.decorado.getNombre(); }
    @Override
    public String getExtension() { return this.decorado.getExtension(); }
    @Override
    public int getTamano() { return this.decorado.getTamano(); }
    @Override
    public LocalDate getFechaCreacion() { return this.decorado.getFechaCreacion(); }
    @Override
    public LocalDate getFechaModificacion() { return this.decorado.getFechaModificacion(); }
    @Override
    public String getPermisos() { return this.decorado.getPermisos(); }
    @Override
    public String prettyPrint() { return this.decorado.prettyPrint(); }
}
