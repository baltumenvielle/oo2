import java.time.LocalDate;

public abstract class FileDecorator implements FileComponent {
    protected FileComponent component;

    @Override
    public String getNombre() { return this.component.getNombre(); }
    @Override
    public String getPermisos() { return this.component.getPermisos(); }
    @Override
    public String getExtension() { return this.component.getExtension(); }
    @Override
    public LocalDate getFechaCreacion() { return this.component.getFechaCreacion(); }
    @Override
    public LocalDate getFechaModificacion() { return this.component.getFechaModificacion(); }
    @Override
    public String prettyPrint() { return this.component.prettyPrint(); }
    @Override
    public double getTamanio() { return this.component.getTamanio(); }
}
