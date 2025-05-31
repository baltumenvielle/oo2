import java.util.LinkedList;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
    private double temperatura, presion, radiacionSolar;
    private List<Double> temperaturas;

    @Override
    public double getTemperatura() { return this.temperatura; }

    @Override
    public double getPresion() { return this.presion; }

    @Override
    public double getRadiacionSolar() { return this.radiacionSolar; }

    @Override
    public List<Double> getTemperaturas() { return this.temperaturas; }

    @Override
    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() + "; "
                + "Presión atmosf: " + this.getPresion() + "; "
                + "Radiación solar: " + this.getRadiacionSolar() + ";";
    }
}
