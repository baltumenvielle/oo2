public abstract class Tarea {
    protected String descripcion;

    public Tarea(String descripcion) { this.descripcion = descripcion; }

    public double getAvance() { return this.getTiempoEstimado() / this.getTiempoUtilizado(); }

    public abstract int getTiempoEstimado();
    public abstract int getTiempoUtilizado();
    public abstract void iniciarTarea();
    public abstract void completarTarea();
}
