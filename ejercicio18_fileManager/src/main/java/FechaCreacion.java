public class FechaCreacion extends FileDecorator {
    public String prettyPrint() { return this.component.prettyPrint() + " - " + this.getFechaCreacion().toString(); }
}
