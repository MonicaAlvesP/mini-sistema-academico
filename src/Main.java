import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Bem Vindo ao nosso Sistema Acadêmico!");

      // Ler dados do Aluno pelo Scanner
      System.out.println("Por favor, informe o nome do aluno:");
      String alunoNome = scanner.nextLine().trim();

      System.out.println("Informe a matrícula do aluno:");
      String alunoMatricula = scanner.nextLine().trim();

      System.out.println("Informe o curso do aluno:");
      String alunoCurso = scanner.nextLine().trim();

      Aluno aluno_cesumar = new Aluno(alunoNome, alunoMatricula, alunoCurso);

      // Exibindo os dados
      System.out.println("Realizando busca de aluno...");
      System.out.println("\n--- Dados do Aluno ---");
      System.out.println("Aluno: " + aluno_cesumar.getNome() + ", Matrícula: " + aluno_cesumar.getMatricula());

      // --- Encapsulamento ---
      // Pergunta ao usuário se deseja atualizar o nome (evita alteração automática)
      System.out.println("\nDeseja atualizar o nome do Aluno? (s/n)");
      String atualizar = scanner.nextLine().trim();
      if (atualizar.equalsIgnoreCase("s") || atualizar.equalsIgnoreCase("sim")) {
        System.out.println("Informe o novo nome do aluno:");
        String novoNome = scanner.nextLine().trim();
        if (!novoNome.isEmpty()) {
          aluno_cesumar.setNome(novoNome);
          System.out.println("Nome atualizado com sucesso!");
        } else {
          System.out.println("Nome em branco. Mantendo o nome anterior.");
        }
      } else {
        System.out.println("Nome mantido.");
      }
      System.out
          .println("Nome: " + aluno_cesumar.getNome() + ", Matrícula: " + aluno_cesumar.getMatricula() + ", Curso: "
              + aluno_cesumar.getCurso());
      System.out.println(aluno_cesumar.apresentar()); // Polimorfismo
      System.out.println(aluno_cesumar.avaliarDesempenho()); // Implementação da interface Avaliado

      // --- Herança ---
      // Ler dados do Professor pelo Scanner
      System.out.println("\nRealizando busca de professor...");
      System.out.println("Por favor, informe o nome do professor:");
      String profNome = scanner.nextLine().trim();

      System.out.println("Informe a disciplina do professor:");
      String profDisciplina = scanner.nextLine().trim();

      Professor prof_cesumar = new Professor(profNome, profDisciplina);
      System.out.println("\n--- Dados do Professor ---");
      System.out.println("Professor: " + prof_cesumar.getNome() + ", Disciplina: " + prof_cesumar.getDisciplina());
      System.out.println(prof_cesumar.apresentar()); // Polimorfismo
    }
  }
}
