import java.util.List;

public abstract class HomeWeatherDecorator implements WeatherData {
    protected WeatherData decorator;

    HomeWeatherDecorator(WeatherData decorator) { this.decorator = decorator; }

    @Override
    public double getTemperatura() { return this.decorator.getTemperatura(); }
    @Override
    public double getPresion() { return this.decorator.getPresion(); }
    @Override
    public double getRadiacionSolar() { return this.decorator.getRadiacionSolar(); }
    @Override
    public List<Double> getTemperaturas() { return this.decorator.getTemperaturas(); }
    @Override
    public String displayData() { return this.decorator.displayData(); }
}
