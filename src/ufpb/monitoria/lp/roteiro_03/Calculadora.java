package ufpb.monitoria.lp.roteiro_03;

public class Calculadora {
	
	public static void main(String[] args){
		double[] numeros = {10, 10, 9};
		double[] pesos = {6, 2, 2};
		System.out.println(calculaMediaAritmetica(numeros));
		System.out.println(calculaMediaPonderada(numeros, pesos));		
	}
	
	/*
	 * 
	 * soma(double num1, double num2): Soma num1 com num2 e retorna essa soma
	 * subtrai(double num1, double num2): Subtrai de num1 o num2 e retorna o resultado
	 * multiplica(double num1, double num2): Multiplica dois números e retorna o resultado
	 * divide(double num1, double num2): Divide num1 por num2 e retorna o resultado
	 * calculaMediaAritmetica (double [] numeros): retorna a média aritmética dos números no array (somatório dos números/quantidade de números)
	 */
	
	public static double soma(double num1, double num2){
		return num1 + num2;
	}
	
	public static double subtrai(double num1, double num2){
		return num1 - num2;
	}
	
	public static double multiplica(double num1, double num2){
		return num1 * num2;
	}
	
	public static double divide(double num1, double num2){		
		return num1 / num2;
	}
	
	public static double  calculaMediaAritmetica(double [] numeros){
		double soma = 0;
		for(int i = 0; i < numeros.length; i++)
			soma += numeros[i];
		return soma/numeros.length;
	}
	
	public static double calculaMediaPonderada(double[] numeros, double[] pesos){
		double soma = 0,
				somaDosPesos = 0;
		for(int i = 0; i < numeros.length; i++){
			soma += numeros[i] * pesos[i];
			somaDosPesos += pesos[i];
		}
		return soma/somaDosPesos;
	}
		

}
