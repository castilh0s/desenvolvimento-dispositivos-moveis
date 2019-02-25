# Retângulo

Crie uma classe Retangulo com os atributos privados comprimento e largura, cada um dos quais assumo como padrão o valor 1. Forneça os metódos que calculam o **perímetro** e a **área** do retângulo. A classe deve ter métodos getters e setters para o comprimento e largura. Os métodos setters devem verificar se os atributos comprimento e largura são, cada um, números de ponto flutuante maiores que 0,0. Se não forem maiores, deve levantar uma exceção. Escreva um programa para testar a classe Retangulo chamado RetanguloTeste e que trate as exceções levantadas.

## Exemplos

### Com erro

```bash
$ java Retangulo 0 1
> Erro: Um dos lados do retângulo é igual ou menor que zero.
```

### Sem erro

```bash
$ java Retangulo 2.5 3
> Área: 7.5
> Perímetro: 11
```