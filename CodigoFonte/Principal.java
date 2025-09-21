import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Listas listas = new Listas();
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Mostrar Todos os Alunos");
            System.out.println("3 - Aprovados ");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a nota de Redes: ");
                    float nota = sc.nextFloat();

                    System.out.print("Digite a nota de Bancos de Dados: ");
                    float nota2 = sc.nextFloat();

                    System.out.print("Digite a nota de Java: ");
                    float nota3 = sc.nextFloat();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2, nota3);
                    listas.adicionarAluno(aluno);

                    System.out.println(aluno);
                    aluno.mediaFinal(aluno.media(nota, nota2, nota3),aluno);
                float media = aluno.media(nota,nota2,nota3);
               listas.clasAprov(media,aluno);
                    break;

                case 2:
                   while(true){
                    System.out.println("\n===== Submenu =====");
                    System.out.println("1 - Mostrar Todos os Alunos");
                    System.out.println("2 - Mostrar Alunos em Recuperação");
                    System.out.println("3 - Mostrar Alunos Reprovados");
                    System.out.println("4 - Voltar ao Menu Principal");
                    System.out.print("Escolha uma opção: ");
                    int subOpcao = sc.nextInt();
                    sc.nextLine();
                    if(subOpcao == 1){
                        listas.mostrarTodos();
                    }else if(subOpcao == 2){
                        listas.mostrarRecuperado();
                    }else if(subOpcao == 3){
                        listas.mostrarReprovados();
                    }else if(subOpcao == 4){
                        break;
                    }
                }
                    break;

                case 3:
                    listas.mostrarAprovados();
                       
                     break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        sc.close();
    }
}



