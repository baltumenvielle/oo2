public class DecoradorTamano extends FileDecorator {
    @Override
    public String prettyPrint() { return super.prettyPrint() + " - " + this.decorado.getTamano();  }
}
