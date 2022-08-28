# Java 8 - Schoolofnet
### Lambdas
- Uma expressão Lambda permite definir uma interface funcional (novamente, um método abstrato) que o compilador identifica pela estrutura. O compilador pode determinar a interface funcional representada a partir de sua posição. O tipo de uma expressão lambda é o da interface funcional associada.
- Forma como o java possibilitou para utilização do paradigma 
funcional.

### Method Reference
- Fazer referencia a um metodo estatico de forma simples apenas declarando a classe e o metodo.
- é usado para referenciar o método da interface funcional. É uma forma compacta e fácil de expressão lambda. Cada vez que você estiver usando a expressão lambda apenas para fazer referência a um método, poderá substituir sua expressão lambda pela referência de método.

### Functional Interface
- Functional Interfaces são todas as interfaces que possuem um método à ser implementados, ou em outras palavras, um método abstrato. Isso quer dizer que várias interfaces que já existiam e que atendiam a essa premissa, automaticamente se tornaram interfaces funcionais. 
- O compilador consegue reconhecer essas interfaces e disponibilizá-las para o desenvolvedor trabalhar, por exemplo, com Lambdas.

### Default Methods
- Possibilita que o metodo de uma interface tem uma implementação padrão.