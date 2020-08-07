package br.com.navita.desafio01Nav;

import java.util.Scanner;

/**
 * @author valbercarreiro
 *
 */
public class Main {

     public static void main(String[] args) {

          TrataNumerosIrmaos trataNumeros = new TrataNumerosIrmaos();
          Scanner scan = new Scanner(System.in);
          try {               
               System.out.print("Entre com o valor: ");
               Integer valor = Integer.parseInt(scan.nextLine());
               System.out.println(trataNumeros.retornaMaiorNumeroIrmao(valor));
          } catch (Exception e) {
               System.out.println("Valor de entrada inválido para um inteiro");
          } finally {
               scan.close();               
          }
          
     }

}