import java.time.LocalDate;

public class Armado {
    private String nombrePersona;
    private LocalDate fechaSolicitada;
    private Presupuesto presupuesto;

    public Computadora hacerComputadora() {
        this.presupuesto.armarProcesador();
        this.presupuesto.armarRAM();
        this.presupuesto.armarDisco();
        this.presupuesto.armarGPU();
        this.presupuesto.armarGabinete();
        this.presupuesto.armarFuente();
        this.presupuesto.armarExtras();
        return this.presupuesto.getComputadora();
    }

    /* Para agregar más configuraciones, habria que hacer otra clase "Armado" o cambiar los pasos de esta clase "Armado",
        aunque de esa forma sólo se podrían armar computadoras con esa única configuración. */
}
