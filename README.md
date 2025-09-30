# Calculadora CLI

Se trata do meu primeiro projeto em Java, bem simples de fato, mas representa uma grande aprendizado para o meu portifólio pessoal...
Sugestões são bem vindas!

Uma **calculadora de linha de comando** em Java com operações básicas, potência, raiz quadrada e histórico de cálculos.  

Inclui **testes unitários com JUnit 5** para validar as operações matemáticas.

---

## Funcionalidades

- Adição, subtração, multiplicação e divisão  
- Potência e raiz quadrada  
- Histórico de cálculos  
- Limpeza do histórico  
- Tratamento de erros (divisão por zero, raiz quadrada de número negativo)  

---

## Pré-requisitos

- Java 17+  
- Maven 3+  

---

## Estrutura do projeto

```
calculadora-cli/
├── src/
│   ├── main/java/      # Código-fonte da calculadora
│   └── test/java/      # Testes unitários com JUnit
├── pom.xml             # Configuração do Maven
└── .gitignore          # Ignora target/, IDE e arquivos temporários
```

---

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/luis-jagella/calculadora-java.git
cd calculadora-java
```

2. Compile e execute com Maven:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="CalculadoraCLI"
```

3. Use a CLI conforme o menu interativo:

```
------- CALCULADORA CLI -------
1 - Adição
2 - Subtração
3 - Multiplicação
4 - Divisão
5 - Potência
6 - Raiz Quadrada
7 - Histórico
8 - Limpar histórico
0 - Sair
```

---

## Executando os testes unitários

O projeto usa **JUnit 5** para testes de operações matemáticas:

```bash
mvn test
```

Exemplo de teste incluso (`OperacoesTest`):

```java
@Test
public void testSomar() {
    assertEquals(5.0, Operacoes.somar(2, 3));
    assertEquals(-1.0, Operacoes.somar(2, -3));
    assertEquals(0.0, Operacoes.somar(0, 0));
}
```

---

## Tecnologias

- Java 17+  
- Maven  
- JUnit 5  

---

## Contribuição

Contribuições são bem-vindas!  
1. Fork o projeto  
2. Crie uma branch para sua feature (`git checkout -b feature/nome-da-feature`)  
3. Commit suas alterações (`git commit -m "Descrição da feature"`)  
4. Push para sua branch (`git push origin feature/nome-da-feature`)  
5. Abra um Pull Request  

---
