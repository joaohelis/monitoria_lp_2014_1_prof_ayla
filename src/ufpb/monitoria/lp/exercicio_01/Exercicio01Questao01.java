package ufpb.monitoria.lp.exercicio_01;

import java.util.Scanner;

// 1. Crie um procedimento/método/função que recebe 3 notas e retorna sua média aritmética.

public class Exercicio01Questao01 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = input.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		float nota2 = input.nextFloat();
		
		System.out.print("Informe a terceira nota: ");
		float nota3 = input.nextFloat();
		
		float media = calculaMedia(nota1, nota2, nota3);
		
		System.out.println("A média das notas informadas foi: " + media);		
	}
	
	public static float calculaMedia(float nota1, float nota2, float nota3){
		float media = (nota1 + nota2 + nota3)/3;
		return media;
	}
	
}
