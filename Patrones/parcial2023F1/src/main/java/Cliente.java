import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private LocalDate fechaNacimiento;
    private List<Vehiculo> vehiculos;
    private Promocion promocion;

    public Cliente(LocalDate fechaNacimiento, Promocion promocion) {
        this.fechaNacimiento = fechaNacimiento;
        this.promocion = promocion;
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public int getEdad() { return (int) ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now()); }
    public void setPromocion(Promocion promocion) { this.promocion = promocion; }
    public double montoAAbonar() { return this.promocion.montoAAbonar(this); }
    public List<Vehiculo> getVehiculos() { return this.vehiculos; }
}
