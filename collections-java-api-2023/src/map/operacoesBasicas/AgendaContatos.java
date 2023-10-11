package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributos
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        System.out.println("Adicionando o contato '" + nome + "' à agenda (Map).");
        //agendaContatosMap.put(nome, telefone);
        if (!agendaContatosMap.containsKey(nome)){
            agendaContatosMap.put(nome, telefone);
        } else {
            System.out.println("Contato '" + nome + "' já existe na agenda (Map).");
        }
        
        // if (pesquisarPorNome(nome) == null){
        //     agendaContatosMap.put(nome, telefone);
        // } else {
        //     System.out.println("Contato '" + nome + "' já existe na agenda (Map).");
        // }
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            System.out.println("Removendo o contato '" + nome + "' da Agenda (Map).");
            agendaContatosMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        if (!agendaContatosMap.isEmpty()) {
            System.out.println("Exibindo todos os contatos:");
            System.out.println(agendaContatosMap);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato '" + nome + "' não encontrado na agenda (Map).");
            }
        } else {
            System.out.println("Agenda de contatos está vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 2222);
        agendaContatos.adicionarContato("Camila", 44444);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + (numeroPesquisaNaoExistente == null ? "<inexistente>" : numeroPesquisaNaoExistente));
    }
}