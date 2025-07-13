public class DecoradorFechaMod extends FileDecorator {
    @Override
    public String prettyPrint() { return super.prettyPrint() + " - " + this.decorado.getFechaModificacion(); }
}
