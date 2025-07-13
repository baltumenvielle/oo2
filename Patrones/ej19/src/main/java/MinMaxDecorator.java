public class MinMaxDecorator extends WeatherDecorator {
    @Override
    public String displayData() { return super.displayData() + " Mínimo: " + this.getMin() + ";" + " Máximo: " + this.getMax() + ";"; }

    private double getMax() { return this.getTemperaturas().stream().mapToDouble(Double::doubleValue).max().orElse(0); }
    private double getMin() { return this.getTemperaturas().stream().mapToDouble(Double::doubleValue).min().orElse(0); }
}
