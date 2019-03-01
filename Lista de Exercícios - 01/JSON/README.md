# JSON

Antes de começar, leia sobre o formato JSON:

* [Site oficial](https://www.json.org)
* [Wikipédia](https://pt.wikipedia.org/wiki/JSON)

Implemente um programa chamado JsonTeste que recebe como parâmetro o nome de um arquivo JSON e lê este arquivo. Utilize a classa **Fatura** implementada no exercício anterior. Você vai carregar os dados do arquivo JSON como objetos do tipo **Fatura**. Retorne do terminal o valor total das faturas que estão no arquivo JSON.

## Exemplo

**Entrada:**

* Nome do arquivo. Ex: nome_do_arquivo.json

**Saída de exemplo:**

```bash
> Total das faturas: R$ 1000.00 (20 Faturas)
```

Considere como exemplo de conteúdo para o arquivo JSON a estrutura abaixo:

```json
{
  "itens": [
    {
      "codigo": "A12C",
      "descricao": "Computador",
      "quantidade": 1,
      "preco": 2021.42
    },
    {
      "codigo": "B132",
      "descricao": "Impressora",
      "quantidade": 1,
      "preco": 821.42
    },
    {
      "codigo": "D34F",
      "descricao": "Mouse",
      "quantidade": 8,
      "preco": 42.42
    }
  ]
}
```