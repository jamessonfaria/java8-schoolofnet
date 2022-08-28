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
- Possibilita que o metodo de uma interface tenha uma implementação padrão.

### Streams API
- Streams API, recurso que oferece ao desenvolvedor a possibilidade de trabalhar com conjuntos de elementos de forma mais simples e com um número menor de linhas de código. Isso se tornou possível graças à incorporação do paradigma funcional, combinado com as expressões lambda, o que facilita a manutenção do código e aumenta a eficiência no processamento devido ao uso de paralelismo.
- Reduzir a preocupação do desenvolvedor com a forma de implementar controle de fluxo ao lidar com coleções, deixando isso a cargo da API. A ideia é iterar sobre essas coleções de objetos e, a cada elemento, realizar alguma ação, seja ela de filtragem, mapeamento, transformação, etc.

### Optional
- Optional é uma classe que foi implementada no Java 8, que tem o objetivo de simplificar os códigos.
- O Optional nos ajuda a evitar os erros NullPointerException, tirar a necessidade da verificação (if x != null) e também a escrever um código com menos linhas e mais claro.

### Date Time API
- O Java 8 introduziu novas APIs para Data e Hora para resolver as deficiências dos antigos java.util.Date e java.util.Calendar .
- __Segurança de thread__ – As classes Date e Calendar não são thread-safe, deixando os desenvolvedores para lidar com a dor de cabeça de problemas de simultaneidade difíceis de depurar e escrever código adicional para lidar com a segurança de thread. Pelo contrário, as novas APIs de data e hora introduzidas no Java 8 são imutáveis ​​e seguras para threads, eliminando assim a dor de cabeça da simultaneidade dos desenvolvedores.
- __Design de API__ e facilidade de compreensão – As APIs de Data e Calendário são mal projetadas com métodos inadequados para realizar operações do dia-a-dia. A nova API de Data / Hora é centrada em ISO e segue modelos de domínio consistentes para data, hora, duração e períodos. Há uma grande variedade de métodos utilitários que suportam as operações mais comuns.
- __ZonedDate e Time__ – Os desenvolvedores tiveram que escrever lógica adicional para lidar com a lógica de fuso horário com as APIs antigas, enquanto que com as novas APIs, o manuseio do fuso horário pode ser feito com APIs Local e ZonedDate / Time .

### Nashorn Javascript Engine
- Essa engine permite colocar codigo javascript dentro de uma classe java.
- Permite usar linha de comando via shell através do jjs.
- O novo mecanismo JavaScript padrão para a JVM a partir do Java 8.
Muitas técnicas sofisticadas foram usadas para tornar as ordens de magnitude do Nashorn mais eficientes do que seu antecessor chamado Rhino, por isso é uma mudança que vale a pena.