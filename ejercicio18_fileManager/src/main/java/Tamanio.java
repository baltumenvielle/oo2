public class Tamanio extends FileDecorator {
    public String prettyPrint() { return this.component.prettyPrint() + " - " + this.getTamanio(); }
}
