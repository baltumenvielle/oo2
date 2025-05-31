public class Promedio extends HomeWeatherDecorator {

    Promedio(WeatherData decorator) { super(decorator); }

    @Override
    public String displayData() { return super.displayData() + " Promedio: "
            + this.getTemperaturas().stream().mapToDouble(Double::doubleValue).average().orElse(0)
            + ";";
    }
}
