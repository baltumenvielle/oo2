import java.util.List;

public class WeatherStationAdapter implements WeatherData {
    private HomeWeatherStation adaptee;

    @Override
    public double getTemperatura() { return this.adaptee.getTemperatura(); }
    @Override
    public double getPresion() { return this.adaptee.getPresion(); }
    @Override
    public double getRadiacionSolar() { return this.adaptee.getRadiacionSolar(); }
    @Override
    public List<Double> getTemperaturas() { return this.adaptee.getTemperaturas(); }
    @Override
    public String displayData() { return "Temperatura C: " + this.getCelsius() + ";" + " Presión atmosf: " + this.getPresion() + ";" +  " Radiación solar: " + this.getRadiacionSolar() + ";"; }

    private double getCelsius() { return (this.getTemperatura() - 32) / 1.8; }
}
