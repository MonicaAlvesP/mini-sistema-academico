/**
 * Classe que representa a entidade Professor.
 * Esta classe "herda" da classe Pessoa.
 */

public class Professor extends Pessoa {
  // Atributo específico da classe Professor
  private String disciplina;

  public Professor(String nome, String disciplina) {
    // Chama o construtor da superclasse (Pessoa) para inicializar o nome
    super(nome);
    this.disciplina = disciplina;
  }

  // --- Getters e Setters para a disciplina ---
  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  // Sobrescreve o método apresentar() da classe Pessoa
  @Override
  public String apresentar() {
    return "Olá, meu nome é " + getNome() + " e eu ensino " + disciplina + " aqui na Unicesumar.";
  }
}
