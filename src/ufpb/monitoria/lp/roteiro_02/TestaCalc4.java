/**
 * 
 */
package ufpb.monitoria.lp.roteiro_02;

import java.util.Scanner;

/**
 * @author joaohelis
 *
 */

/*
 *  9. Crie uma classe TestaCalc4  que lê do usuário (pode ser com JOptionPane) um número representando uma das seguintes opções:
	1- Calcula Menor Número
	2 - Calcula Média Aritmética
	De acordo com o valor lido para "opção", o programa chama o método correspondente na CalculadoraGenerica passando um array de inteiros resultante da conversão de "args" para um array inteiros, de maneira similar ao que foi feito no passo 7.
	
	Para escolher entre as opções, ao invés de "if", utilize o switch, que tem a seguinte estrutura geral:
	
	switch ( < expressao > )
	{
	  case 1: instruções; break;
	  case 2: instruções; break;
	  case 3: instruções; break;
	  default: instruções; 
	}
	
	Para esta classe em particular, o switch pode ficar assim:
	
	switch(opcao){   
	  case 1: 
	    System.out.println( CalculadoraGenerica.calculaMenorNumero(numeros));
	    break;
	  case 2:
	   System.out.println( CalculadoraGenerica.calculaMediaAritmetica(numeros));
	    break;
	  default:
	   System.out.println( "Opção inválida");
	}
 */

public class TestaCalc4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int [args.length];
		
		for(int cont = 0; cont < numeros.length; cont++)
			numeros[cont] = Integer.parseInt(args[cont]);
		
		System.out.println("Informe a opção desejada: \n");
		System.out.println("1 - Calcula menor Número");
		System.out.println("2 - Calcula Média Aritimética");
		int opcao = entrada.nextInt();
		
		switch(opcao){
		case 1:
			System.out.println( CalculadoraGenerica.calculaMenorNumero(numeros));
			break;
		case 2:
			System.out.println(CalculadoraGenerica.calculaMediaAritmetica(numeros));
			break;
		default:
			   System.out.println( "Opção inválida");
		}
		
	}

}
