import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lista {
    private List<Tarefa> list;

    public Lista() {
        this.list = new ArrayList<>();
    }

    public void mostrarLista(){
        if (this.list.isEmpty()){
            System.out.println("A lista esta vazia.");
        }else{
            list.sort(Comparator.comparing(Tarefa::data));
            for (Tarefa i:this.list){
                System.out.println(i);
            }
        }
    }

    public void adicionarTarefa(Tarefa t){
        System.out.println("Tarefa adicionada com sucesso!");
        this.list.add(t);
    }
    public void removerTarefa(int remover){
        System.out.println("Tarefa removida com sucesso!");
        this.list.remove(remover);
    }


}
