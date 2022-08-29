import java.util.*;

public class Todolistzghero
{
    public static void main(String[] args)
    {
//
        System.out.println("Welcome to your Todo List ZG Hero!\n");
        System.out.println("Please Enter your Name: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello "+name);

        int choice;

        List<Tarefastodolist> listaTarefas = new ArrayList<>();

        do
        {
            //Display the Menu
            System.out.println("Please choose an option\n");
            System.out.println("1. Cadastrar Tarefa");
            System.out.println("2. Apagar tarefa");
            System.out.println("3. Listar Tarefas por Categoria");
            System.out.println("4. Listar Tarefas por Status");
            System.out.println("5. Listar Tarefas por Prioridades");
            System.out.println("6. Mostrar Tarefa");
            System.out.println("7. Alterar");
            System.out.println("8. Exit");

            choice = in.nextInt();

            switch(choice)
            {
                case 1:
                    Tarefastodolist tarefa = new Tarefastodolist();
                    System.out.println("Digite a descrição da tarefa");
                    tarefa.setDescricao(in.next());
                    System.out.println("Digite a prioridade da tarefa");
                    tarefa.setPrioridade(in.nextInt());
                    System.out.println("Digite o nome da tarefa");
                    tarefa.setNome(in.next());
                    System.out.println("Digite a categoria da tarefa");
                    tarefa.setCategoria(in.next());
                    System.out.println("Digite a data de termino da tarefa");
                    tarefa.setTermino(in.next());
                    System.out.println("Digite o status da tarefa");
                    tarefa.setStatus(in.next());
                    listaTarefas.add(tarefa);
                    Collections.sort(listaTarefas);
                    break;
                case 2:
                    System.out.println("Digite o nome da tarefa");
                    String nome = in.next();

                    for(Tarefastodolist tarefaAtual : listaTarefas){
                        if(tarefaAtual.getNome().equals(nome)){
                            listaTarefas.remove(tarefaAtual);
                            break;
                        }
                    }
                    break;
                case 3:
                    List<String> categorias = new ArrayList<>();
                    for (Tarefastodolist item : listaTarefas) {
                        if(!categorias.contains(item.getCategoria())){
                            categorias.add(item.getCategoria());
                        }
                    }

                    for (String item : categorias) {
                        System.out.println("Categoria: " + item + "\n");

                        for (Tarefastodolist itemTarefa : listaTarefas) {

                            if(itemTarefa.getCategoria().equals(item)){
                                System.out.println(itemTarefa.getNome());
                            }
                        }

                        System.out.println("\n");
                    }
                    break;
                case 4:
                    List<String> status = new ArrayList<>();
                    for (Tarefastodolist item : listaTarefas) {
                        if(!status.contains(item.getStatus())){
                            status.add(item.getStatus());
                        }
                    }

                    for (String item : status) {
                        System.out.println("Status: " + item + "\n");

                        for (Tarefastodolist itemTarefa : listaTarefas) {

                            if(itemTarefa.getStatus().equals(item)){
                                System.out.println(itemTarefa.getNome());
                            }
                        }

                        System.out.println("\n");
                    }
                    break;
                case 5:
                    List<Integer> prioridades = new ArrayList<>();
                    for (Tarefastodolist item : listaTarefas) {
                        if(!prioridades.contains(item.getPrioridade())){
                            prioridades.add(item.getPrioridade());
                        }
                    }

                    for (int item : prioridades) {
                        System.out.println("Prioridade: " + item + "\n");

                        for (Tarefastodolist itemTarefa : listaTarefas) {

                            if(itemTarefa.getPrioridade() == item) {
                                System.out.println(itemTarefa.getNome());
                            }
                        }

                        System.out.println("\n");
                    }
                    break;
                case 6:
                    System.out.println("Digite o nome da tarefa");
                    String nomeTarefa = in.next();

                    for(Tarefastodolist tarefaAtual : listaTarefas){
                        if(tarefaAtual.getNome().equals(nomeTarefa)){
                            System.out.println("Nome: " + tarefaAtual.getNome()+ "\n");
                            System.out.println("Descrição: " + tarefaAtual.getDescricao()+ "\n");
                            System.out.println("Prioridade: " + tarefaAtual.getPrioridade()+ "\n");
                            System.out.println("Data de Termino: " + tarefaAtual.getTermino()+ "\n");
                            System.out.println("Categoria: " + tarefaAtual.getCategoria()+ "\n");
                            System.out.println("Status: " + tarefaAtual.getStatus()+ "\n");
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("Digite o nome da tarefa");
                    String outraTarefa = in.next();

                    for(Tarefastodolist tarefaAtual : listaTarefas){
                        if(tarefaAtual.getNome().equals(outraTarefa)){

                            System.out.println("Digite a descrição da tarefa");
                            tarefaAtual.setDescricao(in.next());
                            System.out.println("Digite a prioridade da tarefa");
                            tarefaAtual.setPrioridade(in.nextInt());
                            System.out.println("Digite o nome da tarefa");
                            tarefaAtual.setNome(in.next());
                            System.out.println("Digite a categoria da tarefa");
                            tarefaAtual.setCategoria(in.next());
                            System.out.println("Digite a data de termino da tarefa");
                            tarefaAtual.setTermino(in.next());
                            System.out.println("Digite o status da tarefa");
                            tarefaAtual.setStatus(in.next());
                            break;
                        }
                    }
                    break;




            }
        } while ( choice != 8);
    }
}
