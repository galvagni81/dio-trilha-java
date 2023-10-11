package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributos
    private Set<String> palavrasUnicasSet;

    // Construtor da classe
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    // Método para adicionar a palavra ao conjunto (Set)
    public void adicionarPalavraUnica(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    // Método para remover a palavra do conjunto (Set)
    public void removerPalavraUnica(String palavra) {
        // Verifica se o conjunto não está vazio
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra \'" + palavra + "\' não encontrada no conjunto (Set).");
            }
        } else {
            System.out.println("O conjunto (Set) está vazio.");
        }
    }

    // Método que verifica se uma palavra está contida no conjunto (Set)
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    // Método para exibir as palavras únicas do conjunto (Set)
    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto (Set) está vazio.");
        }
    }

    // Método 'main' da classe para efetuar os testes
    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        // Adicionando palavras únicas ao conjunto
        conjuntoPalavrasUnicas.adicionarPalavraUnica("Java");
        conjuntoPalavrasUnicas.adicionarPalavraUnica("Python");
        conjuntoPalavrasUnicas.adicionarPalavraUnica("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavraUnica("Python");
        conjuntoPalavrasUnicas.adicionarPalavraUnica("C++");
        conjuntoPalavrasUnicas.adicionarPalavraUnica("Ruby");

        // Exibindo as palavras únicas do cojunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        
        // Removendo uma palavra do conjunto
        conjuntoPalavrasUnicas.removerPalavraUnica("Python");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Removendo uma palavra inexistente do conjunto
        conjuntoPalavrasUnicas.removerPalavraUnica("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto?\n" + (conjuntoPalavrasUnicas.verificarPalavra("Java") ? "Sim." : "Não."));
        System.out.println("A linguagem 'Python' está no conjunto?\n" + (conjuntoPalavrasUnicas.verificarPalavra("Python") ? "Sim." : "Não."));

        // Exibindo as palavras únicas atualizadas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
