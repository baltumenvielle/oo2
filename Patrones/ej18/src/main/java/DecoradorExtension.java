public class DecoradorExtension extends FileDecorator {
    @Override
    public String prettyPrint() { return super.prettyPrint() + " - " + this.decorado.getExtension(); }
}
