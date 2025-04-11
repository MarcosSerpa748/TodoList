public class Tarefa implements Comparable<Tarefa> {
    private String tipo;
    private String data;
    private String horario;

    public Tarefa (String tipo, String data,String horario){
        this.tipo = tipo;
        this.data = data;
        this.horario = horario;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Tarefa:"+getTipo()+" esta marcado para o dia "+getData()+" às "+getHorario()+" horas";
    }

    @Override
    public int compareTo(Tarefa t){
        return this.getData().compareTo(t.data);
    }
}
