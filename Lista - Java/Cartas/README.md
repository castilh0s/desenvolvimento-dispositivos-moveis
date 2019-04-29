# Cartas

Implemente um programa para jogar cartas.

Implemente a classe **Carta** contendo dois atributos de instância do tipo String **naipe** e **valor** que serão utilizadas para armazenar o nome do valor e o nome do naipe de uma carta específica. O construtor da classe deve receber duas Strings que ele vai utilizar para inicializar **naipe** e **valor**. Implemente um método chamado **toString** que retorna uma String no formato "Rainha de Copas".

Implemente a classe **DeckDeCartas** para gerenciar um monte de cartas. Ela deve conter um atributo de instância chamado **monte** do tipo ArrayList. A classe **DeckDeCartas** também deve declarar um atributo de instância do tipo Integer chamado **cartaAtual** que representa um número sequencial (0 a 51) indicando a próxima **Carta** a ser a distribuída a partir do **monte**, e uma constante com nome **TOTAL_DE_CARTAS** para indicar o número de Cartas total no baralho (52). Deve também implementar uma da constante chamada **VALORES** que contém as Strings de "A" a "Rei" e uma da constante NAIPES que contém as Strings Paus, Outros, Copas, Espadas.

Implemente o **construtor** da classe **DeckDeCartas** onde deve ser instanciado **monte** com tamanho **TOTAL_DE_CARTAS**. O **construtor** deve usar um loop para preencher o **monte** com **Cartas**. Cada **Carta** é instanciada e inicializada usando os valores das constantes VALORES (que contém as Strings de "A" a "Rei") e uma da constante NAIPES (que contém as Strings Paus, Outros, Copas, Espadas. Use como referência as informações da wikipedia para fazer essa implementação: [Bralho francês de 52 cartas](https://pt.wikipedia.org/wiki/Baralho#Baralho_francês_de_52_cartas)

Implemente na classe **DeckDeCartas** o método **embaralhar** para embaralhar as Cartas no **monte**.

Implemente o método **distribuir** para distribuir uma **Carta** do **monte**. Lembre-se de que **cartaAtual** indica o índice da próxima Carta a ser distribuída, isto é, a Carta na parte superior do baralho. Se monte não estiver vazio este método retorna Carta na parte superior e incrementa **cartaAtual** para preparar-se para a próxima chamada do método distribuir. Caso contrário, deve-se **levantar uma exceção** (RuntimeException) dizendo que não existem mais cartas no baralho.

Implemente um programa chamado **CartasTeste** que demonstre o funcionamento da classe DeckDeCartas, embaralhando e distribuindo todas as cartas. Imprima mensagens que indiquem quando o baralho está sendo embaralhado e uma linha para cada carta distribuída.

## Exemplo

**Entrada:**

* Não tem entrada.

**Saída de exemplo:**

```bash
> Embaralhando o deck!
>
> Distribuindo Valete de Paus
> Distribuindo Ás de Ouros
> ...
>
> Nenhuma carta no baralho! Fim de jogo!
```

Nesta questão é interessante usando a API disponível no Java 8 ou superiores. Algumas sugestões:

* Arrays.asList(list)
* Collections.shuffle(list)
* Collections.reverse(list)
* Collections.copy(list, list)
* Collections.fill(list, 's')
* Collections.max(list)
* Collections.min(list)
* Collections.sort(list)
* Collections.binarySearch(list, key)
