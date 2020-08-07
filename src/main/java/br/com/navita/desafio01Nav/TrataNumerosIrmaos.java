package br.com.navita.desafio01Nav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author valbercarreiro
 *
 */
public class TrataNumerosIrmaos {
     
     private static final Integer MAIOR_NUMERO_VALIDO = 100000000;
     
     private static final Integer RETORNO_DEFAULT = -1;

     private List<Integer> separaNumeros(Integer valor) throws NumberFormatException {
          List<Integer> retorno = new ArrayList<Integer>();
          
          if (valor == 0) {  
               retorno.add(0);
               return retorno;
          } else if (valor < 0) {
               throw new NumberFormatException();
          }
   
          String temp = Integer.toString(valor);
          
          Integer[] valores = new Integer[temp.length()];
          
          for (int i = 0; i < temp.length(); i++) {
              valores[i] = temp.charAt(i) - '0';
          }
          
          retorno = Arrays.asList(valores);
          Collections.sort(retorno);
          Collections.reverse(retorno);
          
          return retorno;
     }
     
     private Integer montaMaiorValorIrmao(List<Integer> valores) {
          Integer maiorValor = 0;
          
          StringBuilder valorAux = new StringBuilder("");
          
          valores.stream().forEach(valor -> valorAux.append(String.valueOf(valor)));
          
          maiorValor = Integer.parseInt(valorAux.toString().equals("") ? "0" : valorAux.toString());
          
          return maiorValor;
     }
     
     public Integer retornaMaiorNumeroIrmao(int valor) throws NumberFormatException {
          
          if(valor > MAIOR_NUMERO_VALIDO) {
               return RETORNO_DEFAULT;
          }
          
          Integer maiorValor =  montaMaiorValorIrmao(separaNumeros(valor));
          
          return maiorValor;
     }
}