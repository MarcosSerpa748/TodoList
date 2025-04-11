import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista l1 = new Lista();

        System.out.println("Digite 10 para iniciar o programa:");
        String minhaEsco = sc.nextLine();
        while (!minhaEsco.equals("-1")){
            System.out.println("Funções:Adicionar, Mostrar lista, Remover e -1 para finalizar:");
            minhaEsco = sc.nextLine();
            switch (minhaEsco){
                case "Adicionar":
                    System.out.println("Digite a sua tarefa:");
                    String tarefa = sc.nextLine();
                    System.out.println("Digite o dia de sua realização:");
                    String data = sc.nextLine();
                    System.out.println("Digite o horário:");
                    String horario = sc.nextLine();
                    Tarefa t1 = new Tarefa(tarefa,data,horario);
                    l1.adicionarTarefa(t1);
                    break;
                case"Mostrar lista":
                    l1.mostrarLista();
                    break;
                case"Remover":
                    System.out.println("Digite o index da tarefa:");
                    int index = sc.nextInt();
                    l1.removerTarefa(index);
                    minhaEsco = sc.nextLine();
                    break;
            }
        }
        System.out.println("Finalizando...");

    }
}