import java.util.List;

public class HomeWeatherAdapter implements WeatherData {
    private HomeWeatherStation station;

    public HomeWeatherAdapter(HomeWeatherStation station) { this.station = station; }

    @Override
    public double getTemperatura() { return (this.station.getTemperatura() - 32) / 1.8; }

    @Override
    public double getPresion() { return this.station.getPresion(); }

    @Override
    public double getRadiacionSolar() { return this.station.getRadiacionSolar(); }

    @Override
    public List<Double> getTemperaturas() { return this.station.getTemperaturas(); }

    @Override
    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() + "; "
                + "Presión atmosf: " + this.getPresion() + "; "
                + "Radiación solar: " + this.getRadiacionSolar() + ";";
    }
}
