package ufpb.monitoria.lp.exercicio_02;

import java.util.Scanner;

// Crie um procedimento/método/função que recebe um preço de um produto e um valor 
// de desconto (número entre 0 e 100) e que retorne o valor do produto após aplicar 
// o desconto. Por exemplo, se esse método receber um produto que custa 100 reais e 
// onde deve ser aplicado um desconto de 10%, o método deve retornar 90.

public class Exercicio02Questao01 {
	
	public static void main(String[] args) {		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o preço do prouduto: ");
		float precoProduto = input.nextFloat();
		
		System.out.print("Informe a porcentagem de desconto a ser calculada sobre o preço do produto: ");
		int porcentagemDeDesconto = input.nextInt();
		
		float precoFinalDoProduto = calcularPrecoFinalDoProduto(precoProduto, porcentagemDeDesconto);
		
		System.out.printf("O preço final do produto é: R$ %.2f %n", precoFinalDoProduto);
		
	}
	
	public static float calcularPrecoFinalDoProduto(float precoProduto, int porcentagemDeDesconto){		
		return precoProduto -= precoProduto * (porcentagemDeDesconto / 100f);
	}

}
