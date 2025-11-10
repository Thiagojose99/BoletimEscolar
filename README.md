# BoletimEscolar
Exercicios para praticar
📘 Boletim Escolar

Este projeto em Java tem como objetivo simular um boletim escolar, permitindo cadastrar alunos com suas notas e calcular automaticamente a média final e o status (aprovado, recuperação ou reprovado).

🚀 Funcionalidades

Cadastrar aluno com nome e três notas

Calcular a média final automaticamente

Exibir as informações do aluno

Mostrar o status do aluno de acordo com a média

📂 Estrutura do Projeto
src/
└── com/mycompany/boletimescolar/
    ├── Aluno.java
    └── Listas.java   (classe auxiliar opcional)

💻 Exemplo de Uso
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Thiago", 7.5f, 8.0f, 9.0f);
        System.out.println(aluno.toString());
        aluno.mediaFinal(aluno.media(7.5f, 8.0f, 9.0f), aluno);
    }
}

🧾 Saída esperada:
===== Dados do Aluno =====
Nome: Thiago
Redes: 7.5
Bancos de Dados: 8.0
Java: 9.0
Nota Final: 8.17

===========================
Status: Aprovado

🛠️ Tecnologias Utilizadas

Java SE

IDE: NetBeans / IntelliJ / Eclipse

✍️ Autor

Desenvolvido por Thiago José Gonçalves da Silva 👨‍💻
