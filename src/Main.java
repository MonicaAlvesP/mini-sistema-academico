public class Main {
  public static void main(String[] args) {
    // Instanciando um objeto da classe Aluno e passando valores para os atributos
    Aluno aluno_cesumar = new Aluno("Mônica Alves", "24123214-5", "Análise e Desenvolvimento de Sistemas");

    // Exibindo os dados
    System.out.println("Bem Vindo ao nosso Sistema Acadêmico!");
    System.out.println("Realizando busca de aluno...");
    System.out.println("\n--- Dados do Aluno ---");
    System.out.println("Aluno: " + aluno_cesumar.getNome() + ", Matrícula: " + aluno_cesumar.getMatricula());

    // --- Encapsulamento---
    System.out.println("\nAtualizando nome do Aluno...");
    aluno_cesumar.setNome("Mônica Alves Pereira");
    System.out.println("Nome atualizado com sucesso!");
    System.out.println("Nome: " + aluno_cesumar.getNome() + ", Matrícula: " + aluno_cesumar.getMatricula() + ", Curso: "
        + aluno_cesumar.getCurso());
    System.out.println(aluno_cesumar.apresentar()); // Polimorfismo
    System.out.println(aluno_cesumar.avaliarDesempenho()); // Implementação da interface Avaliado

    // --- Herança ---
    // Instanciando um objeto da classe Professor que também herda de Pessoa
    System.out.println("\nRealizando busca de professor...");
    Professor prof_cesumar = new Professor("Mario Garcia", "Programação Orientada a Objetos");
    System.out.println("\n--- Dados do Professor ---");
    System.out.println("Professor: " + prof_cesumar.getNome() + ", Disciplina: " + prof_cesumar.getDisciplina());
    System.out.println(prof_cesumar.apresentar()); // Polimorfismo
  }
}
