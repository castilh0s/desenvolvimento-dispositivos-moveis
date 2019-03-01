# Fatura

Crie uma classe chamada **Fatura** para que uma loja de eletrônicos a utilize para representar uma fatura de um item vendido nesta loja. Uma fatura deve conter as seguintes informações como atributos de instância:

* o código da fatura (tipo String)
* a descrição (tipo String)
* a quantidade comprada de um item (tipo Integer)
* e o preço por item (tipo Double)

Sua classe **Fatura** deve ter um **construtor** que inicializa os quatro atributos. Além disso, fornece um método chamado **totalFaturado** que calcula o valor de fatura, isto é, multiplica a quantidade pelo preço por item e depois retorna esse valor. Escreva um programa chamado **FaturaTeste** que recebe os parâmetros de entrada para instanciar um objeto do tipo **Fatura** e depois imprima a saída no terminal como indicado no exemplo.

## Exemplo

**Entrada:**

* Código. Ex: 123
* Descrição. Ex: Mouse
* Quantidade. Ex: 3
* Preço. Ex: 25.5

**Saída de exemplo:**

```bash
> Código: 123
> Descrição: Mouse
> Total: R$ 76.5
```