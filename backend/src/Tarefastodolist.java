public class Tarefastodolist implements Comparable<Tarefastodolist>{
    private String descricao;
    private int prioridade;
    private String nome;
    private String categoria;
    private String termino;
    private String status;

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String valor){
        descricao = valor;
    }
    public int getPrioridade(){
        return prioridade;
    }
    public void setPrioridade(int valor){
        prioridade = valor;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String valor){
        nome = valor;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String valor){
        categoria = valor;
    }
    public String getTermino(){
        return termino;
    }
    public void setTermino(String valor){
        termino = valor;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String valor){
        status = valor;
    }

    @Override
    public int compareTo(Tarefastodolist item){
        return String.valueOf(this.getPrioridade()).compareTo(String.valueOf(item.getPrioridade()));
    }

}