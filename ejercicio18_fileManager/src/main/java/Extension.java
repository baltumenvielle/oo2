public class Extension extends FileDecorator {
    public String prettyPrint() { return this.component.prettyPrint() + " - " + this.getExtension(); }
}
