# Geometria

Crie uma hierarquia de **herança** para as classes **Quadrilatero**, **Trapezio**, **Paralelogramo**, **Retangulo** e **Quadrado**. Utilize Quadrilatero como a superclasse da hierarquia.
Implemente em cada uma dessas classes o método **toString** para retornar o nome da classe atual e também da sua superclasse direta. No caso da classe Quadrilatero, retorne apenas o nome dela mesma. Escreva um programa chamado **GeometriaTeste** que instancia objetos de suas classes e imprime cada um na tela, gerando a saída abaixo.

## Exemplo

**Entrada:**

* Não tem entrada.

**Saída de exemplo:**

```bash
> Quadrilatero
> Trapezio -> Quadrilatero
> Paralelogramo -> Quadrilatero
> Retangulo -> Quadrilatero
> Quadrado -> Retangulo -> Quadrilatero
```