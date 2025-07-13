import java.util.List;

public abstract class WeatherDecorator implements WeatherData {
    protected WeatherData decorado;

    @Override
    public double getTemperatura() { return this.decorado.getTemperatura(); }
    @Override
    public double getPresion() { return this.decorado.getPresion(); }
    @Override
    public double getRadiacionSolar() { return this.decorado.getRadiacionSolar(); }
    @Override
    public List<Double> getTemperaturas() { return this.decorado.getTemperaturas(); }
    @Override
    public String displayData() { return this.decorado.displayData(); }
}
