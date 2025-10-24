## Sistema Acadêmico — Exercício de POO (com Java)

Este repositório contém a solução em Java para uma atividade da faculdade sobre conceitos básicos de Programação Orientada a Objetos (POO): classes, objetos, encapsulamento, herança, polimorfismo e interfaces.

O objetivo aqui é implementar todas as questões em Java (uma classe/arquivo por questão quando aplicável), documentar o código com comentários e testar as funcionalidades no método `main`.

### O que está sendo criado

- Classes que modelam pessoas envolvidas em um sistema acadêmico: `Pessoa`, `Aluno` e `Professor`.
- Interface `Avaliado` para demonstrar o uso de interfaces.
- Um método `main` em `Main.java` que instancia objetos com dados de exemplo (seus próprios dados) e demonstra cada requisito solicitado na atividade.

### Mapeamento das questões da atividade

Questão 1 – Classe e Objeto
- Implementado: classe `Aluno` com atributos `nome` e `matricula`.
- No `main`: é criado um objeto `Aluno` com dados de exemplo e seus atributos são exibidos.

Questão 2 – Encapsulamento
- Implementado: atributos privados em `Aluno` com métodos `get` e `set` (getters/setters).
- No `main`: demonstramos alteração e leitura de atributos via setters/getters.

Questão 3 – Herança
- Implementado: classe `Pessoa` (atributo `nome`) e `Aluno` estende `Pessoa`. `Aluno` tem também atributo `curso`.
- Implementado: classe `Professor` com atributo `disciplina` (também herda de `Pessoa`, quando aplicável).
- No `main`: criamos um `Aluno` e um `Professor` e exibimos seus atributos.

Questão 4 – Polimorfismo
- Implementado: método `apresentar()` em `Pessoa` e sobrescritas em `Aluno` e `Professor` retornando uma string de apresentação.
- No `main`: chamamos `apresentar()` para demonstrar polimorfismo.

Questão 5 – Interface
- Implementado: interface `Avaliado` com `avaliarDesempenho()`.
- `Aluno` implementa `Avaliado` e devolve uma mensagem personalizada, por exemplo: "Aluno [nome] obteve ótimo desempenho!".
- No `main`: chamamos `avaliarDesempenho()` do objeto `Aluno`.

### Arquivos e propósito

- `Pessoa.java` — classe base com atributo(s) e método `apresentar()`.
- `Aluno.java` — modela um aluno; atributos: `nome`, `matricula`, `curso`; getters/setters; implementação de `Avaliado` e sobrescrita de `apresentar()`.
- `Professor.java` — modela um professor; atributo: `disciplina`; sobrescrita de `apresentar()`.
- `Avaliado.java` — interface com o método `avaliarDesempenho()`.
- `Main.java` — classe com o método `main` que instancia objetos com seus dados, testa todas as funcionalidades e imprime o resultado no console.

> Observação: os arquivos Java estão organizados por classe (um arquivo por classe), conforme pedido na atividade.

### Como compilar e executar

```bash
# Compilar todos os .java dentro de src/
javac src/*.java -d out

# Executar a aplicação (Main no pacote default)
java -cp out Main
```

Certifique‑se de ter o JDK instalado (verifique com `java -version`/`javac -version`).

### Boas práticas adotadas

- Comentários explicativos em pontos-chave do código (conforme solicitado pela atividade).
- Separação de classes por arquivo para melhor organização.
- Testes manuais de todas as funcionalidades no `main`.

----
Desenvolvido com dedicação por [Mônica Alves](https://github.com/MonicaAlvesP). Contribuições e sugestões são bem‑vindas 🌸.
