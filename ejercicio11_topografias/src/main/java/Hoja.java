public class Hoja implements TopografiaI {
    private double proporcionAgua;

    @Override
    public double calcularProporcionAgua() {
        return this.proporcionAgua;
    }

    @Override
    public boolean esIgual(TopografiaI topografia) {
        return ((TopografiaI)topografia).calcularProporcionAgua() == this.calcularProporcionAgua();
    }
}
