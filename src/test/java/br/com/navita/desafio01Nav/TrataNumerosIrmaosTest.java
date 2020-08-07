/**
 * 
 */
package br.com.navita.desafio01Nav;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * @author valbercarreiro
 *
 */
class TrataNumerosIrmaosTest {
     
     private static final Integer VALOR_INVALIDO_ENTRADA = 204578973;     
     
     private static final Integer RETORNO_ENTRADA_VALOR_INVALIDO = -1;     
     
     private static final Integer VALOR_ENTRADA_SUCESSO = 4578973;
     
     private static final Integer RETORNO_VALOR_ENTRADA_SUCESSO = 9877543;
     
     private static final Integer VALOR_ZERO = 0;
     
     private static final Integer VALOR_NEGATIVO = -1;
     
     private TrataNumerosIrmaos trataNumerosIrmaos;

     @BeforeEach
     void setUp() throws Exception {
          this.trataNumerosIrmaos = new TrataNumerosIrmaos();
     }
     
     @Test
     public void retornaMaiorNumeroIrmaoValorInvalidoEntradaTest() {
          Integer retorno = this.trataNumerosIrmaos.retornaMaiorNumeroIrmao(VALOR_INVALIDO_ENTRADA);
          assertEquals(retorno, RETORNO_ENTRADA_VALOR_INVALIDO);
     }
     
     @Test
     public void retornaMaiorNumeroIrmaoSucessoTest() {
          Integer retorno = this.trataNumerosIrmaos.retornaMaiorNumeroIrmao(VALOR_ENTRADA_SUCESSO);
          assertEquals(retorno, RETORNO_VALOR_ENTRADA_SUCESSO);
     }
     
     @Test
     public void retornaMaiorNumeroIrmaoValorZeroTest() {
          Integer retorno = this.trataNumerosIrmaos.retornaMaiorNumeroIrmao(VALOR_ZERO);
          assertEquals(retorno, VALOR_ZERO);
     }
     
     @Test
     public void retornaMaiorNumeroIrmaoValorMenorQueZeroTest() {
          assertThrows(NumberFormatException.class, () -> {
               this.trataNumerosIrmaos.retornaMaiorNumeroIrmao(VALOR_NEGATIVO);
          });
     }

}
