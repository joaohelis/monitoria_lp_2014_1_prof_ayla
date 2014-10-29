/**
 * 
 */
package ufpb.monitoria.lp.roteiro_02;

/**
 * @author joaohelis
 *
 */

/*
 *  Material Auxiliar: Tutorial Java da Oracle (http://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)
	
	1. Crie uma classe chamada "CalculadoraGenerica" onde declararemos alguns métodos.  
	
	2. Declare o método calculaMenorNumero na classe CalculadoraGenerica, que recebe 3 inteiros e retorna o menor deles.
	
	Lembre-se de que a estrutura do if em Java é:
	
	if ( < Condicao1 > ) {
  		< Instruções para Condição1 verdadeira >
	} else if ( < Condicao2 > ) {
  		< Instruções para condição2 verdadeira >
	} else {
  		< Instruções para condições 1 e 2 falsas >
	}
 * 
 */

public class CalculadoraGenerica {
		
	public static int calculaMenorNumero(int num1, int num2, int num3){
		if(num1 < num2 && num1 < num3)
			return num1;
		else if(num2 < num1 && num2 < num3)
			return num2;
		else if (num1 == num2 & num1 < num3)
			return num1;
		return num3;
	}
	
	/*
	 * 
	 * 	6. Declare o método calculaMenorNumero na classe CalculadoraGenerica, que recebe um array de inteiros (int [] numeros) e retorna o menor deles. Para varrer o array de números, você pode usar o "while", que tem a seguinte estrutura:

		while ( < Condicao1 > ) {
  			< Instruções para executar enquanto Condição1 for verdadeira >
		} 

		Lembre de criar um contador. Sua Condicao1 pode ser algo do tipo "while (cont < numeros.length)" onde numeros.length é o tamanho do array passado. Para incrementar o contador, você pode usar o operador de auto-incremento de Java.

		Ex: 
		cont++;

		Esse comando é equivalente a:
		cont = cont + 1;
	 */
	public static int calculaMenorNumero(int[] numeros){
		int menor = Integer.MAX_VALUE,
		    cont = 0;
		while(cont < numeros.length){
			if(numeros[cont] < menor)
				menor = numeros[cont];
			cont++;
		}
		return menor;
	}
	
	/*
	 * 
	 *	8. Declare o método calculaMediaAritmetica na classe CalculadoraGenerica, que recebe um array de inteiros (int [] numeros) e retorna a média aritmética deles. Para varrer o array de inteiros, você pode utilizar o "for" de Java, que tem o seguinte formato:

  		for (inicialização; condição; incremento ou decremento) {
        	< Instruções para executar enquanto condição for verdadeira >
  		}

  		Um exemplo de "for" para varrer um array de inteiros é este:
  
  		for (int k=0; k < numeros.length; k++) {
    		//instruções a executar enquanto k for menor que o tamanho do array "numeros".
  		} 
	 */
	public static int calculaMediaAritmetica(int[] numeros){
		int soma = 0;
		for(int i = 0; i < numeros.length; i++)
			soma += numeros[i];
		int media = soma/numeros.length;
		return media;
	}
}
