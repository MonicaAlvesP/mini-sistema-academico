/**
 * Classe que representa a entidade Aluno.
 * (Questão 1: Classe e Objeto)
 * (Questão 2: Encapsulamento aplicado)
 * (Questão 3: Herança aplicada - esta classe "herda" de Pessoa)
 * (Questão 5: Interface aplicada - esta classe "implementa" Avaliado)
 */

public class Aluno extends Pessoa implements Avaliado {
  // --- Atributos (características) Específicos de Aluno ---
  // --- Modificador de acesso private para encapsulamento ---
  private String matricula;
  private String curso; // Novo atributo específico de Aluno

  // --- Construtor para inicialização dos atributos ---
  public Aluno(String nome, String matricula, String curso) {
    super(nome); // Chama o construtor da classe pai (Pessoa)
    this.matricula = matricula;
    this.curso = curso;
  }

  // --- Getters e Setters para acesso aos atributos ---
  // Getter e Setter para nome (herdado automaticamente de Pessoa)

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  @Override // Método sobrescrito para apresentar o aluno
  public String apresentar() {
    return "Olá, meu nome é " + getNome() + ", estou cursando " + curso + " (matricula: " + matricula + ").";
  }

  @Override // Implementação do método da interface Avaliado
  public String avaliarDesempenho() {
    return "Aluno " + getNome() + " obteve ótimo desempenho!";
  }
}
