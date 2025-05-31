public class Permisos extends FileDecorator {
    public String prettyPrint() { return this.component.prettyPrint() + " - " + this.getPermisos(); }
}
