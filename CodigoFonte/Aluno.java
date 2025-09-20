import java.util.List;
import java.util.ArrayList;
public class Aluno {
   private String nome ;
    private float nota;
    private float nota2;
    private float nota3;
    private float media;

public Aluno(String nome,float nota, float nota2,float nota3){
    this.nome = nome;
    this.nota = nota;
    this.nota2 = nota2;
    this.nota3 = nota3;
    this.media = media(nota,nota2,nota3);
    
} 
    public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public float getNota() {
    return nota;
}

public void setNota2(float nota2) {
    this.nota2 = nota2;
}
    public float getNota2() {
    return nota2;
}

public void setNota3(float nota3) {
    this.nota3 = nota3;
}
    public float getNome3(){
        return nota3;
    }
    

public void setNota(float nota) {
    this.nota = nota;
}
    
    
    
    
    public float media(float nota,float nota2,float nota3){
        return (nota + nota2 + nota3)/3;
    }
    @Override
public String toString() {
    return "===== Dados do Aluno =====\n" +
           "Nome: " + nome + "\n" +
           "Redes: " + nota + "\n" +
           "Bancos de Dados: " + nota2 + "\n" +
           "Java: " + nota3 + "\n" +
           "Nota Final: " + String.format("%.2f", media )+ "\n" + 
           "\n===========================";
}
    
    public void mediaFinal(float media, Aluno aluno){
        Listas li = new Listas();
        if(media < 5){
            System.out.println("Status: Reprovado");
        }else if(media > 5 && media < 7){
            System.out.println("Status: Recuperaçao");
        }else if(media >= 7 && media <=9){
            System.out.println("Status: Aprovado");
        }else if(media == 10){
            System.out.println("Status: Aprovado com Louvor");
                
        }
        
    }
} 