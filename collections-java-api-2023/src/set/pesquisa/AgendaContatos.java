package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero){
        System.out.println("Adicionando o contato abaixo na agenda:");
        System.out.println("\tNome: " + nome + "\n\tNúmero: " + numero);
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println("Exibindo todos os contatos:");
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        System.out.println("Pesquisando contato pelo nome '" + nome + "'.");
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        System.out.println("Atualizando o número para o contato '" + nome + "'");

        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        // Inserindo novos contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 654321);
        agendaContatos.adicionarContato("Maria Silva", 111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        
        agendaContatos.atualizarNumeroContato("Camila", 987654);
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
    }
}
