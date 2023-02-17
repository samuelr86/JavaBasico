## Exceções
try permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

catch permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try

finally permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. 

try {
    //bloco de código conforme esperado
}
catch(Exception e){ // precisamos saber qual exceção

    // bloco de código que captura as exceções que podem acontecer
    // em caso de um fluxo não previsto

}