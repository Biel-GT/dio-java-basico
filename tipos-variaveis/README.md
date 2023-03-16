## Iniciando em Java - Aula 4

- Tipos primitivos de dados em Java, existem 8 tipos e uma palavra reservada para cada um deles:
    - Partes inteiras:
        - byte -> números pequenos (1 byte)
        - short -> números médio (2 bytes)
        - int -> número grande (4 bytes) 
        - long -> número gigante (8 bytes)

        O *int* é muito comum por questão de compatibilidade da JVM (recomendado na maioria dos casos)
    
    - Partes fracionárias:
        - float -> (4 bytes)
        - double -> (8 bytes)
        
        O *double* é muito comum por questão de garantia da precisão.
    
    - Parte lógica:
        - boolean -> 1 bit (0 ou 1), representa *Verdadeiro* ou *Falso* 
    
    - Parte literail:
        - char -> 1 caractere (1 byte)
        
    - Esses tipos **NÃO** são considerados objetos, portanto, representam valores brutos. São armazenados direto na pilha de memória.

- String
    - O tipo *String* também faz parte do literal, mas não é um tipo primitivo no Java
    - É uma Classe do Java:
        ```java
            java.lang.String
        ```
        - Deve ser declarada e instanciada, a instância é automática ao atribuir um valor a variável
        - É uma sequência de caracteres em ASCII que é armazenada numa instância da classe

- O principal na hora de definir o tipo de dados da variável é entender a sua proposta e seus limites mínimo e máximo.

- Sintaxe de declaração de variáveis:
    - Tipo nome atribuição (opcional)
        ```java
            int idade;
            double salario = 2.5;
        ```

    - `Atenção` a atribuição com ponto ou vírgula, em Java o '.' não representa milhar.
        - Uso de convenção americana -> 2.5 = 2,5 no Brasil e 2500 sim

    - *OBS*: 
        - uso de valores que começam com 0, Java não armazena o zero, então armazenar como String, CEP e CPF são exemplos.
        - float deve ser declarado com 'F' no final do valor para que o número não seja interpretado como outro tipo
            ```java
                float pi = 3.14F;
            ```

        - long também deve ser declarado com 'L' no final
            ```java
                long cpf = 98765432109L; // cpf fictício
            ```

- Java é uma linguagem fortemente tipada, ou seja:
    - O tipo faz toda a diferença:
        - Um tipo *short* pode ser armazenado em um tipo *int*
            ```java
                short numeroShort = 1;
                int numeroInt = numeroShort;
            ```
        - Um tipo *int* não pode ser armazenado em um tipo *short*
            ```java
                int numeroInt = 10;
                short numeroShort = numeroInt;
                // Isso acontece porque pode acontecer de o número int ser maior do que o short pode armazenar
            ```

- Variáveis x Constantes:
    - Variáveis são valores que podem ser alterados ao longo do código
    - Constantes são valores únicos que não sofrem alteração *NUNCA*
    - Para declarar uma constante basta usar *final* antes da declaração:
        ```java
            final float PI = 3.14F;
            // Constantes devem ser declaradas SEMPRE em CAIXA ALTA por motivo de convenção
        ```
        - *OBS*: estar em caixa alta não significa que será uma constante, o que define isso é o uso do *final* na declaração.
        

`**Aprendizado**` - Realce de código no README 🥳