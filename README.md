# Exercício-Codificador
Exercicio 2 - Fundamentos de Desenvolvimento de Software.

**Grupo**: Gaya Pizoli, Gustavo Rech, João Pedro Graboski e Matheus Cunha.

## Tarefa 1: 
**Descrição**: Criar pelo menos duas outras implementações para a interface
“Codificador” usando algoritmos de codificação distintos. Atribua o nível de
segurança de cada algoritmo por seus próprios critérios.

**Resolução**:Para a tarefa 1, foram criadas as classes CodificadorMedio e CodificadorAvancado, ambas implementadno a interface Codificador. CodificadorMedio codifica a string invertando as letras do alfabeto. Já em CodificadorAvancado,cada letra da string é deslocada por um valor que aumenta a cada letra encontrada.

## Tarefa 2: 
**Descrição**: Criar um “Factory” de codificador. O “factory” deverá receber como
parâmetro o nível de segurança necessário, selecionando então a implementação
que tiver o nível de segurança o mais próximo do desejado.

## Tarefa 3: 
**Descrição**: Criar um exemplo de uso do “Factory” que demonstre as funcionalidades
de todas as implementações da interface “Codificador”

**Resolução Tarefas 2 & 3**: Foi criada uma inteface da factory de codificador que vai detectar o tipo de codificação a ser usada com base no nível de segurança e uma classe factory que implementa a interface e que dá a definição lógica para a "fábrica de codificadores": CodificadorSimples (1), CodificadorMedio (2) e CodificadorAvancado (3). 

## Tarefa 4: 
**Descrição**: Transformar o “Factory” em um singleton de maneira a facilitar seu uso.

**Resolução**: Para a resolução da tarefa 4, a classe CodificadorFactoryClas que implementa a interface CodificadorFactory foi alterada de modo que fosse criado um atributo de instância a ser usado na função getInstance(). Dessa maneira, só uma instância da factory é criada na main.

