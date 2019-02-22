# Fatura

Crie uma classe chamada Fatura para que uma loja de eletrônicos e a utilize para representar uma fatura de um item vendido nesta loja. Uma fatura deve incluir quatro informações como variáveis de instância:

- o código da fatura (tipo String)
- a descrição (tipo String)
- a quantidade comprada de um item (tipo Integer)
- e o preço por item (tipo Double)

Sua classe deve ter um **construtor** que inicializa as quatro variáveis de instância. Além disso, fornece um método chamado **totalFaturado** que calcula o valor de fatura (isto é, multiplica a quantidade pelo preço por item) e depois retorna esse valor. Escreva um aplicativo de linha de comando chamado FaturaTetse que utiliza a classe Fatura e recebe os parâmetros e imprime no terminal.

## Exemplo

```bash
$ java FaturaTeste codigo descricao 5 4.5
> Descrição: descricao
> Total: R$ 22.5
```