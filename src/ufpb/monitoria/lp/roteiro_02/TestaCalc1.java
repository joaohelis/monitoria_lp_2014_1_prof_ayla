/**
 * 
 */
package ufpb.monitoria.lp.roteiro_02;

/**
 * @author joaohelis
 *
 */

/*
 * 3. Declare uma classe TestaCalc1, com um método main que chama o método CalculadoraGenerica.calculaMenorNumero passando como parâmetros 3 números passados como argumento para o programa (String [] args).   O programa deve imprimir o menor dos números passados. Como cada argumento do programa é um String, você deve convertê-los para inteiros. Uma forma de fazer isso é usando o comando Integer.parseInt(stringAConverter). 
   
   Ex: int x = Integer.parseInt(args[0]);

	Outros comandos semelhantes são o Boolean.parseBoolean(str) e o Double.parseDouble(str).

	Para compilar suas classes, você pode utilizar o comando javac -encoding UTF-8 *.java a partir do diretório onde estão as classes criadas.
	
	Para executar o programa TestaCalc1, utilize o comando java -cp . TestaCalc1
		
 * 
 */

public class TestaCalc1 {
	
	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]),
			num2 = Integer.parseInt(args[1]),
			num3 = Integer.parseInt(args[2]);
		
		int menorNumero = CalculadoraGenerica.calculaMenorNumero(num1, num2, num3);
		
		System.out.println("O menor número é:"+menorNumero);
	}

}
