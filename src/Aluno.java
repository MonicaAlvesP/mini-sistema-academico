/*
 * Classe que representa a entidade Aluno
 * (Questão 1: Classe e Objeto)
 * (Questão 2: Encapsulamento)
 * (Questão 3: Herança)
 * (Questão 4: Polimorfismo)
 */

public class Aluno extends Pessoa implements Avaliado {
  // --- Atributos (características) específicos do Aluno ---
  // --- Modificador de acesso private para encapsulamento ---
  private String matricula;
  private String curso;

  // --- Construtor para inicializar os atributos ---
  public Aluno(String nome, String matricula, String curso) {
    super(nome); // Chama o construtor da superclasse (Pessoa)
    this.matricula = matricula;
    this.curso = curso;
  }

  // --- Métodos getters para acessar os atributos ---
  // Getter e Setter para nome (herda automaticamente de Pessoa)
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

  // Sobrescreve o método apresentar() da classe Pessoa
  @Override
  public String apresentar() {
    return "Olá, meu nome é " + getNome() + " e eu sou aluno do curso de " + curso + ".";
  }

  // Implementa o método avaliar() da interface Avaliado
  @Override
  public String avaliarDesempenho() {
    return "Aluno " + getNome() + " obteve ótimo desempenho!.";
  }
}