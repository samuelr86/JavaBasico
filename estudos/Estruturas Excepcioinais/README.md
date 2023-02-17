## Exceções
try permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

catch permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try

finally permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. 
```java
try {
    //bloco de código conforme esperado
}
catch(Exception e){ // precisamos saber qual exceção

    // bloco de código que captura as exceções que podem acontecer
    // em caso de um fluxo não previsto

}
```

## Hierarquia de Exceções

São organizadas em Checked e Unchecked

O que determina se uma exceção ser classificada como Checada ou não-checada é o risco dela ser disparada, logo você precisa tratá-la.

### Exceções customizadas

Nós podemos criar nossas próprias exceções, baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recurso desenvolvidos no projeto.
Imagine que como regra para formatar um CEP necessite sempre de 8 digitos, caso contrário lançara uma exceção que denominamos CepInvalidoException.

```java
public class CepInvalidoException extends Exception{}
```

Em seguida criamos nosso método de formatação de cep:

```java
public static String formatarCep(String cep) throw CepInvalidoException{
    if(cep.length() != 8)
        throw new CepInvalidoException();

        return "23.765-064";
}
```