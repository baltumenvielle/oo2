public class DecoradorFechaCreacion extends FileDecorator {
    @Override
    public String prettyPrint() { return super.prettyPrint() + " - " + this.decorado.getFechaCreacion(); }
}
