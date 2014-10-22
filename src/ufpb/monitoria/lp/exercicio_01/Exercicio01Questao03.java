package ufpb.monitoria.lp.exercicio_01;

import java.util.Scanner;

// 3. Crie um procedimento/método/função que recebe as 3 notas parciais do aluno e sua nota da final e 
// diz se você foi aprovado ou não (Média final, que é a média ponderada de suas notas maior ou igual a 5, 
// sabendo que a nota da final tem peso 4 e a media das 3 notas da disciplina tem peso 6).

public class Exercicio01Questao03 {
	
	public static void main(String[] args) {		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a nota 1: ");
		float nota1 = input.nextFloat();
		
		System.out.print("Informe a nota 2: ");
		float nota2 = input.nextFloat();
		
		System.out.print("Informe a nota 3: ");
		float nota3 = input.nextFloat();
		
		System.out.print("Informe a nota na Final: ");
		float notaFinal = input.nextFloat();		
		
		boolean foiAprovado = verificaAprovacaoDoAluno(nota1, nota2, nota3, notaFinal);
				
		if(foiAprovado)
			System.out.println(">> O aluno foi aprovado! :)");
		else
			System.out.println(">> O aluno foi reprovado! :(");
		
	}
	
	public static boolean verificaAprovacaoDoAluno(float nota1, float nota2, float nota3, float notaFinal){
			
			float mediaDasNotasDisciplina = (nota1 + nota2 + nota3)/3;
			
			float mediaFinal = notaFinal * 0.4f + mediaDasNotasDisciplina * 0.6f;			
		
		return mediaFinal >= 5;
	}

}
