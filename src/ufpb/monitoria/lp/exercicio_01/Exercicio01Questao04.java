package ufpb.monitoria.lp.exercicio_01;

import java.util.Scanner;

// 4. Crie um procedimento/método/função para calcular o fatorial de um número 
// que é passado como parâmetro.

public class Exercicio01Questao04 {
	
	public static void main(String[] args) {
		
		System.out.println("Informe o número para caucular o fatorial: ");
		int num = new Scanner(System.in).nextInt();
		
		int fat = fatorial(num);
		System.out.println("O fatorial de " + num + " é: " + fat);
	}
	
	public static int fatorial(int num){
		int fat = 1;
		for(int i = 2; i <= num; i++)
			fat *= i; // essa expressão é o mesmo que: fat = fat * i
		return fat;
	}
	
	public static int fatorialRecursiva(int num){
		if (num < 2)
			return 1;
		else 
			return num * fatorialRecursiva(num - 1);
	}
}
