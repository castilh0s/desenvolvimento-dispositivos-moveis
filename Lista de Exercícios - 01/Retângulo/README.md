# Retângulo

Crie uma classe **Retangulo** com os atributos **comprimento** e **largura**, cada um dos quais assume como padrão o valor 1. Escreva os métodos que calculam o perimetro e a area do retângulo. A classe deve ter métodos **setters** e **getters** para o comprimento e a largura. Os métodos setters devem verificar se os atributos comprimento e largura são, cada um, números de ponto flutuante maiores que 0,0. Se não forem maiores, deve levantar uma **exceção**. Escreva um programa chamado **RetanguloTeste** para testar o uso da classe Retangulo e seus métodos, e que também trate as exceções levantadas.

## Exemplos

### Com erro

**Entrada:**

* Comprimento. Ex: 0

**Saída de exemplo:**

```bash
> Erro: Um dos lados do retângulo é igual ou menor que zero.
```

### Sem erro

**Entrada:**

* Comprimento. Ex: 2.5
* Largura. Ex: 3

**Saída de exemplo:**

```bash
> Área: 7.5
> Perímetro: 11
```