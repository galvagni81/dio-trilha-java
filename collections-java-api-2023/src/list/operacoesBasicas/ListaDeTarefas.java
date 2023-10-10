package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private List<Tarefa> tarefaList;

    public ListaDeTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    // Método para adicionar uma tarefa à Lista de Tarefas
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Método para remover uma tarefa da Lista de Tarefas
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    // Método para obter o número total de tarefas da Lista
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    // Método para imprimir a descrição das tarefas na Lista
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList.toString());
    }

    public static void main(String[] args) {
        
        ListaDeTarefas listaTarefa = new ListaDeTarefas();
        listaTarefa.limpaConsole();
        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        
        listaTarefa.obterDescricaoTarefas();
        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos da lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricaoTarefas();
    }

    public void limpaConsole(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    }
}
