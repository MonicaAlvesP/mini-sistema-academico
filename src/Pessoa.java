/**
 * Classe base (Superclasse) para o sistema.
 * Define atributos e métodos comuns a todas as pessoas
 * da universidade (Alunos, Professores, etc).
 * (Base para Questão 3: Herança)
 * (Questão 4: Polimorfismo)
 */

public class Pessoa {
  // Atributo protegido para que as classes filhas (Aluno, Professor)
  // possam acessá-lo, mas ainda encapsulado do resto do mundo.
  private String nome;

  // Pessoa deverá ser criada com um nome
  public Pessoa(String nome) {
    this.nome = nome;
  }

  // --- Getters e Setters para acesso ao nome ---
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  // Método de apresentação genérico para aplicarmos polimorfismo
  public String apresentar() {
    return "Olá, meu nome é " + nome + ".";
  }
}