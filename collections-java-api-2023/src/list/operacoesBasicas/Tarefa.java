package list.operacoesBasicas;

public class Tarefa {
    private String descricao;
    
    // Construtor da Classe
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    // Método para retornar a descrição da tarefa
    public String getDescricao() {
        return descricao;
    }
    
    // Método para definir a descrição a tarefa
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
}
