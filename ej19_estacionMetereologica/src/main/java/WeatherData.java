import java.util.List;

public interface WeatherData {
    double getTemperatura();
    double getPresion();
    double getRadiacionSolar();
    List<Double> getTemperaturas();
    String displayData();
}
