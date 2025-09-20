
import java.util.ArrayList;
import java.util.List;
public class Listas {

    
    List<Aluno> lista = new ArrayList<>();
    // Para guardar o Objeto aluno
    List<Aluno> listaAprovados = new ArrayList<>();
    // Para guardar os aprovados
    List<Aluno> listaReprovados = new ArrayList<>();
    // Para guardar os reprovados
    List<Aluno> listaRecuperacao = new ArrayList<>();
    // Para guardar os Recuperacao
    
    
    
    
    // Metodos para adicionar
    
    public void aprovados(Aluno aluno){
        listaAprovados.add(aluno);
    }
    public void reprovados(Aluno aluno){
        listaReprovados.add(aluno);
    }
    
    public void recuperacao(Aluno aluno){
        listaRecuperacao.add(aluno);
    }
    
    public void adicionarAluno(Aluno aluno){
        lista.add(aluno);
    }
    
    
    // Metodos para mostrar
    public void mostrarTodos(){
        int alun = lista.size();
        if(alun == 0){
            System.out.println("Nao existe aluno");
        }else{
            for(Aluno a : lista){
                System.out.println(a);
            }
        }
    }
    // mostrar aprovados
    public void mostrarAprovados(){
        int aprov = listaAprovados.size();
            for(Aluno a : listaAprovados){
                System.out.println(a);
                
            }
        }
    // mostrar reprovados
    public void mostrarReprovados(){
        int reprov = listaReprovados.size();
        if(reprov == 0){
            System.out.println("Nao existe alunos Reprovados");
        }else{
            for(Aluno a : listaReprovados){
                System.out.println(a);
            }
            
        }
    }
    public void clasAprov(float media, Aluno aluno){
        if(media < 5){
            reprovados(aluno);
            
        }else if(media > 5 && media < 7){
            recuperacao(aluno);
            System.out.println("Status: Recuperaçao");
        }else if(media >= 7 && media <=9){
            System.out.println("Status: Aprovado");
        listaAprovados.add(aluno);
        }else if(media == 10){
            System.out.println("Status: Aprovado com Louvor");
        listaAprovados.add(aluno);
        }
    }
    
}


