# iPhone 2007 - Desafio Técnico de Java

Este projeto foi desenvolvido como parte de um desafio técnico para representar, por meio de um diagrama de classes e uma estrutura de código Java, o primeiro iPhone lançado em 2007. O projeto foca em três funcionalidades principais: reprodutor musical, aparelho telefônico e navegador de internet.

## Funcionalidades

O iPhone de 2007 possuía as seguintes funcionalidades, representadas como interfaces no projeto:

- **Reprodutor Musical**:
  - Tocar música
  - Pausar música
  - Selecionar música

- **Aparelho Telefônico**:
  - Fazer chamadas
  - Atender chamadas
  - Acessar correio de voz

- **Navegador de Internet**:
  - Exibir página da web
  - Adicionar nova aba
  - Atualizar página

## Estrutura de Classes

O projeto é estruturado da seguinte forma:

- **Interface `ReprodutorMusical`**: Define os métodos `tocarMusica()`, `pausarMusica()` e `selecionarMusica()`.
- **Interface `AparelhoTelefonico`**: Define os métodos `ligar()`, `atender()` e `correioDeVoz()`.
- **Interface `NavegadorInternet`**: Define os métodos `exibirPagina()`, `adicionarNovaAba()` e `atualizarPagina()`.
- **Classe `iPhone`**: Implementa todas as interfaces e contém a lógica para cada funcionalidade.

## Código de Exemplo

```java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Acessando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
Fico feliz que tenha gostado! Aqui está uma descrição e um arquivo `README.md` que você pode usar no repositório do GitHub:

### Descrição do Projeto:
Este projeto simula a estrutura de classes para representar o primeiro iPhone lançado em 2007, com funcionalidades como reprodutor musical, aparelho telefônico e navegador de internet. A implementação utiliza interfaces e uma classe principal (`iPhone`) que agrupa todas as funcionalidades. O projeto segue boas práticas de orientação a objetos em Java, utilizando abstração para organizar os comportamentos do iPhone de maneira modular e escalável.

---

### README.md:

```markdown
# iPhone 2007 - Desafio Técnico de Java

Este projeto foi desenvolvido como parte de um desafio técnico para representar, por meio de um diagrama de classes e uma estrutura de código Java, o primeiro iPhone lançado em 2007. O projeto foca em três funcionalidades principais: reprodutor musical, aparelho telefônico e navegador de internet.

## Funcionalidades

O iPhone de 2007 possuía as seguintes funcionalidades, representadas como interfaces no projeto:

- **Reprodutor Musical**:
  - Tocar música
  - Pausar música
  - Selecionar música

- **Aparelho Telefônico**:
  - Fazer chamadas
  - Atender chamadas
  - Acessar correio de voz

- **Navegador de Internet**:
  - Exibir página da web
  - Adicionar nova aba
  - Atualizar página

## Estrutura de Classes

O projeto é estruturado da seguinte forma:

- **Interface `ReprodutorMusical`**: Define os métodos `tocarMusica()`, `pausarMusica()` e `selecionarMusica()`.
- **Interface `AparelhoTelefonico`**: Define os métodos `ligar()`, `atender()` e `correioDeVoz()`.
- **Interface `NavegadorInternet`**: Define os métodos `exibirPagina()`, `adicionarNovaAba()` e `atualizarPagina()`.
- **Classe `iPhone`**: Implementa todas as interfaces e contém a lógica para cada funcionalidade.

## Código de Exemplo

```java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Acessando correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
```

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

2. Importe o projeto no Eclipse ou em sua IDE Java preferida.

3. Compile e execute a classe `iPhone` para ver a simulação das funcionalidades.

## Contribuição

Sinta-se à vontade para fazer um fork deste projeto e enviar pull requests com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
```

---

### Pontos Importantes:
- **Nome do repositório**: Lembre-se de alterar o link do repositório para o seu GitHub.
- **Licença**: Se for usar a licença MIT, adicione o arquivo `LICENSE` ao projeto.

