public class PromedioDecorator extends WeatherDecorator {
    @Override
    public String displayData() { return super.displayData() + " Promedio: " + this.getPromedio() + ";"; }

    private double getPromedio() { return this.getTemperaturas().stream().mapToDouble(Double::doubleValue).average().orElse(0); }
}
