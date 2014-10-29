/**
 * 
 */
package ufpb.monitoria.lp.roteiro_02;

/**
 * @author joaohelis
 *
 */

/*
 * 
 * 	7. Crie uma classe TestaCalc3 que recebe como argumentos (String [] args) para o programa uma lista de inteiros e chama o método CalculadoraGenerica.calculaMenorNumero para calcular o menor deles. Como "args"  é uma variável que guarda um array de Strings e não um array de inteiros, você precisará criar no seu programa um array de inteiros que terá o mesmo tamanho do array "args". O tamanho (length) de args é obtido através da chamada "args.length" .  Para criar o array de números, pode-se fazer da seguinte forma:

	int [] numeros = new int [args.length];

	Depois, deve-se varrer o array "args" (pode ser com o while) convertendo cada um dos seus elementos para inteiro (Integer.parseInt(args[cont]), preenchendo assim a variável numeros:

	numeros[cont] = Integer.parseInt(args[cont]);
 */

public class TestaCalc3 {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[args.length];
		
		// Exemplo de transformação de um array de String em um array de Inteiro, utilizando um for
		// for(int cont = 0; cont < numeros.length; cont++)
		// 		numeros[cont] = Integer.parseInt(args[cont]); 
		
		// Exemplo de transformação de um array de String em um array de Inteiro, utilizando um while
		int cont = 0;
		while(cont < numeros.length){
			numeros[cont] = Integer.parseInt(args[cont]);
			cont++;
		}
		
		int menorNumero = CalculadoraGenerica.calculaMenorNumero(numeros);
		
		System.out.println("O menor número é:"+menorNumero);
	}

}
