## Analisador de Texto - Desafio Backend Sillion

Um aplicativo Java simples que recebe um URL e uma frase composta por N palavras, faz uma solicitação HTTP ao URL
fornecido, e retorna o número de vezes que a frase digitada é repetida no conteúdo da página, bem como a contagem de
cada palavra na frase.

## Funcionalidades

- Insira um URL válido no console.
- Insira no console uma frase composta por N palavras.
- Faça uma solicitação para o referido URL.
- Mostre o número de vezes que a frase digitada é repetida no console.
- Mostre no console o número de vezes que cada palavra da frase é repetida.

## Exemplo

URL de entrada: https://exemplo.com
Frase a procurar: exemplo de frase

Resultados:

``` bash
"exemplo de frase" => repete 3 vezes
"exemplo" => é repetido 5 vezes
"de" => é repetido 8 vezes
"frase" => é repetido 3 vezes
``` 

## Configuração

Certifique-se de ter o Maven e Java 11 (ou superior) instalados em sua máquina. Para construir o projeto,
execute `mvn clean install`.

## Configuração do Projeto

### Pré-requisitos

- Maven
- Java 11 (ou superior)

### Construindo o Projeto

Execute o seguinte comando para construir o projeto e gerar o arquivo JAR:

```bash
mvn clean install
Como Executar
Execute o aplicativo localmente após a construção do JAR:
```

```bash
java -jar target/nome-do-seu-arquivo-jar.jar
```

## Exemplos

Exemplos de entradas e saídas esperadas.

Exemplo 1:
URL de Entrada: https://exemplo.com

Frase a Procurar: exemplo de frase

Resultados:

```bash
"exemplo de frase" => repete 3 vezes
"exemplo" => é repetido 5 vezes
"de" => é repetido 8 vezes
"frase" => é repetido 3 vezes
```

## Contribuição

Sinta-se à vontade para contribuir! Leia nosso Guia de Contribuição para começar.

## Contato

Para dúvidas ou colaborações, entre em contato conosco em edualmeida.a7@gmail.com.