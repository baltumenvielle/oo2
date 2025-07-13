public class DecoradorPermisos extends FileDecorator {
    @Override
    public String prettyPrint() { return super.prettyPrint() + " - " + this.decorado.getPermisos(); }
}
