public interface Estado {
    void iniciarTarea(TareaSimple tarea);
    void completarTarea(TareaSimple tarea);
    int getTiempoUtilizado(TareaSimple tarea);
}
