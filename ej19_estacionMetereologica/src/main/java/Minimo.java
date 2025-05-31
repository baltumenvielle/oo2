public class Minimo extends HomeWeatherDecorator {

    Minimo(WeatherData decorator) { super(decorator); }

    @Override
    public String displayData() { return super.displayData() + " Minimo: "
            + this.getTemperaturas().stream().mapToDouble(Double::doubleValue).min()
            + ";";
    }
}
