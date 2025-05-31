public class Maximo extends HomeWeatherDecorator {

    Maximo(WeatherData decorator) { super(decorator); }

    @Override
    public String displayData() { return super.displayData() + " Maximo: "
            + this.getTemperaturas().stream().mapToDouble(Double::doubleValue).max()
            + ";";
    }
}
