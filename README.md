# Finanças API

Projeto pessoal em desenvolvimento para um aplicativo de organização financeira baseado no método de envelopes.

A proposta é permitir que o usuário separe dinheiro por finalidade, como mercado, aluguel, água e combustível, acompanhe os gastos e consulte o valor disponível em cada envelope.

## Objetivo

Este projeto está sendo desenvolvido como parte dos meus estudos de Engenharia de Software e desenvolvimento Back-End.

A versão atual utiliza Java no terminal para construir e testar progressivamente as regras de negócio. Futuramente, o projeto será evoluído para uma API REST.

## Funcionalidades atuais

- Cadastro do nome do envelope pelo terminal
- Validação de nome vazio ou formado apenas por espaços
- Entrada do valor separado em centavos
- Entrada do valor gasto em centavos
- Validação de valores negativos
- Bloqueio de gastos superiores ao valor separado
- Repetição da entrada até receber dados válidos
- Cálculo do valor disponível no envelope

## Regras de negócio implementadas

- Todo envelope precisa ter um nome
- Valores monetários não podem ser negativos
- Um gasto não pode ser maior do que o valor separado
- O valor disponível é calculado pela diferença entre o valor separado e o valor gasto
- Os valores são armazenados em centavos para evitar imprecisões de ponto flutuante

## Tecnologias utilizadas

- Java
- Git
- GitHub

## Como executar

### Pré-requisito

- Java JDK 21 ou superior

### Compilar

Na raiz do projeto, execute:

```bash
javac estudos-java/CadastroEnvelope.java
```
### Executar
```bash
java -cp estudos-java CadastroEnvelope
```
## Exemplo de uso

```text
Digite o nome do envelope: Mercado
Digite o valor separado em centavos: 80000
Digite o valor gasto em centavos: 30000

Envelope: Mercado
Valor separado em centavos: 80000
Valor gasto em centavos: 30000
Valor disponível em centavos: 50000
```

Nesse exemplo, `50000` centavos correspondem a `R$ 500,00`.

## Estrutura atual

```text
financas-api/
├── .gitignore
├── README.md
└── estudos-java/
    └── CadastroEnvelope.java
```

### Próximas etapas

- Organizar o código em métodos
- Aplicar orientação a objetos
- Criar a classe `Envelope`
- Armazenar múltiplos envelopes
- Evoluir o projeto para uma API REST
- Integrar um banco de dados
- Adicionar testes automatizados

## Status

Projeto em Desenvolvimento