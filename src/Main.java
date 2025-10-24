public class Main {
  public static void main(String[] args) {
    // Instanciando o objeto Aluno com o construtor e passando os valores
    Aluno aluno_cesumar = new Aluno("Mônica Alves Pereira", "20254123-4", "Análise e Desenvolvimento de Sistemas");

    // Exibindo os dados adicionados
    System.out.println("--- Dados do Aluno ---");
    System.out.println("Nome: " + aluno_cesumar.getNome());

    // --- Encapsulamento ---
    // Modificando os atributos usando os métodos setters
    aluno_cesumar.setNome("Mônica A. Pereira");
    System.out.println("Nome do Aluno atualizado: " + aluno_cesumar.getNome());
    System.out.println("Matrícula: " + aluno_cesumar.getMatricula());
    System.out.println("Curso: " + aluno_cesumar.getCurso());
    // --- Polimorfismo ---
    System.out.println(aluno_cesumar.apresentar());
    // --- Interface ---
    System.out.println(aluno_cesumar.avaliarDesempenho());

    // --- Herança ---
    // Instanciando o objeto Professor que também herda de Pessoa
    Professor prof_cesumar = new Professor("Mario Gárcia", "Orientação a Objetos");
    System.out.println("\n--- Dados do Professor ---");
    System.out.println("Professor: " + prof_cesumar.getNome());
    System.out.println("Disciplina: " + prof_cesumar.getDisciplina());
    // --- Polimorfismo ---
    System.out.println(prof_cesumar.apresentar());
  }
}